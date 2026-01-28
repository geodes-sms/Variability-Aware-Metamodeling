package library.controllers

class PorcelainControllerGenerator implements ControllerGenerator{
	override generate()
	'''
	package controllers;
	
	import java.util.ArrayList;
	import java.util.List;
	
	import org.eclipse.jgit.api.Git;
	import org.eclipse.jgit.lib.Ref;
	import org.eclipse.jgit.revwalk.RevCommit;
	import org.eclipse.jgit.transport.RemoteConfig;
	
	import functions.JGitRepositoryAPI;
	
	/**
	 * This controller is used to create custom JGit API calls. (i.e. When a
	 * repository is created, create a separate branch for saving the differencing
	 * artifacts)
	 *
	 * Should be made a singleton, to prevent multiple pointers to the repositories.
	 */
	public class PorcelainController implements IVcsController {
		static private IVcsController instance;
	
		List<Git> repositories;
		Git workspace;
	
		JGitRepositoryAPI api;
	
		private PorcelainController() {
			repositories = new ArrayList<Git>();
			api = JGitRepositoryAPI.getInstance();
		}
	
		public static IVcsController getInstance() {
			if (instance == null) {
				instance = new PorcelainController();
				return instance;
			}
			return instance;
		}
	
		@Override
		public List<Git> getRepositories() {
			return repositories;
		}
	
		@Override
		public void registerRepository(Git repo) {
			// If it is the first repository added, switch the workspace to it.
			if (repositories.size() == 0) {
				changeWorkspace(repo);
			}
			repositories.add(repo);
		}
	
		// TODO UNTESTED. I don't know what the format looks like, I'm just taking a
		// stab in the dark that the name of the repository is contained in the ID of
		// the repository.
		@Override
		public Git getRepository(String name) {
			Git result = null;
			for (Git repo : repositories) {
				if (repo.getRepository().getIdentifier().contains(name)) {
					result = repo;
				}
			}
			return result;
		}
	
		/**
		 * Get the current work directory and may return null if no repository have been
		 * initialized.
		 *
		 * @return {@link Git} or {@link <code>null</code>}
		 */
		@Override
		public Git getWorkspace() {
			return workspace;
		}
	
		/**
		 * Change the current working directory to execute the commands on.
		 */
		@Override
		public void changeWorkspace(Git repo) {
			workspace = repo;
		}
	
		@Override
		public void initLocalDirectory(String directory) {
			registerRepository(api.initLocalDirectory(directory));
		}
	
		@Override
		public void checkoutCommand(Git git, String branchName) {
			api.checkoutCommand(git, branchName);
		}
	
		@Override
		public void addCommand(Git git, List<String> paths) {
			// TODO Investigate whether I should look only for .xmi files and make a helper
			// class for this
			api.addCommand(git, paths);
		}
	
		@Override
		public void createBranch(Git git, String branchName) {
			api.createBranch(git, branchName);
	
		}
	
		@Override
		public void fetchCommand(Git git, String remoteName, String remoteBranchName, String username, String password) {
			// TODO change how the credentials are handled, because it is not viable at this
			// moment. Need to implement a usable password manager.
			api.fetchCommand(git, remoteName, remoteBranchName, username, password);
	
		}
	
		@Override
		public void remoteAddCommand(String remoteHttpUrl, String remoteName) {
			api.remoteAddCommand(getWorkspace(), remoteHttpUrl, remoteName);
	
		}
	
		@Override
		public void rmCommand(List<String> paths) {
			api.rmCommand(getWorkspace(), paths);
	
		}
	
		public List<Ref> getBranches() {
			return api.branchListCommand(getWorkspace());
		}
	
		@Override
		public List<String> getBranchesClean() {
			List<Ref> branchList = getBranches();
			return cleanBranches(branchList);
		}
	
		protected List<String> cleanBranches(List<Ref> branchList) {
			List<String> branchListClean = new ArrayList<>();
			for (Ref ref : branchList) {
				branchListClean.add(ref.getName());
			}
	
			return branchListClean;
		}
	
		public List<Ref> getRemoteBranches() {
			return api.remoteBranchListCommand(getWorkspace());
		}
	
		@Override
		public List<String> getRemoteBranchesClean() {
			List<Ref> branchList = getRemoteBranches();
			return cleanBranches(branchList);
		}
	
		public List<RemoteConfig> remoteList() {
			return api.remoteListCommand(getWorkspace());
		}
	
		@Override
		public List<String> remoteListClean() {
			List<RemoteConfig> remoteList = remoteList();
			return cleanRemoteList(remoteList);
		}
	
		protected List<String> cleanRemoteList(List<RemoteConfig> remoteList) {
			List<String> remoteListClean = new ArrayList<>();
			for (RemoteConfig ref : remoteList) {
				remoteListClean.add(ref.getName());
			}
	
			return remoteListClean;
		}
	
		@Override
		public void checkoutCreateCommand(Git git, String branchName) {
			api.checkoutCreateCommand(git, branchName);
		}
	
		@Override
		public void cloneRepository(String remoteRepo, String directory, String username, String password,
				Boolean cloneAllbranches) {
			api.cloneRepository(remoteRepo, directory, username, password, cloneAllbranches);
	
		}
	
		@Override
		public void commit(String commitMessage) {
			api.commitCommand(getWorkspace(), commitMessage);
		}
	
		@Override
		public void pullCommand(String username, String password) {
			api.pullCommand(getWorkspace(), username, password);
		}
	
		@Override
		public void pushCommand(String username, String password) {
			api.pushCommand(getWorkspace(), username, password);
		}
	
		/**
		 * This method is used to access the history of commits. Since there is no
		 * parameter needed, calling this method here should be sufficient, instead of
		 * making a handler and dialog for it.
		 *
		 * @return a list of all commits in order
		 */
		@Override
		public Iterable<RevCommit> logCommand() {
			return api.getLog(getWorkspace());
		}
	
		/**
		 * Opens a pre-existing Git directory
		 *
		 * @return a {@code Git} repository
		 */
		@Override
		public void openLocalDirectory(String directory) {
			registerRepository(api.openLocalRepository(directory));
	
		}
	
	}
	
	'''
}