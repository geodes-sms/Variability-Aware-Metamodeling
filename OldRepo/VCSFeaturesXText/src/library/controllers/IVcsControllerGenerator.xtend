package library.controllers

class IVcsControllerGenerator implements ControllerGenerator{
	override generate()
	'''
	package controllers;
	
	import java.util.List;
	
	import org.eclipse.jgit.api.Git;
	import org.eclipse.jgit.revwalk.RevCommit;
	
	public interface IVcsController {
	
		List<Git> getRepositories();
	
		void registerRepository(Git repo);
	
		// TODO UNTESTED. I don't know what the format looks like, I'm just taking a
		// stab in the dark that the name of the repository is contained in the ID of
		// the repository.
		Git getRepository(String name);
	
		/**
		 * Get the current work directory and may return null if no repository have been
		 * initialized.
		 *
		 * @return {@link Git} or {@link <code>null</code>}
		 */
		Git getWorkspace();
	
		/**
		 * Change the current working directory to execute the commands on.
		 */
		void changeWorkspace(Git repo);
	
		void initLocalDirectory(String directory);
	
		void checkoutCommand(Git git, String branchName);
	
		void addCommand(Git git, List<String> paths);
	
		void createBranch(Git git, String branchName);
	
		void fetchCommand(Git git, String remoteName, String remoteBranchName, String username, String password);
	
		void remoteAddCommand(String remoteHttpUrl, String remoteName);
	
		void rmCommand(List<String> paths);
	
		List<String> getBranchesClean();
	
		void checkoutCreateCommand(Git git, String branchName);
	
		void cloneRepository(String remoteRepo, String directory, String username, String password,
				Boolean cloneAllbranches);
	
		void commit(String commitMessage);
	
		List<String> getRemoteBranchesClean();
	
		List<String> remoteListClean();
	
		void pullCommand(String username, String password);
	
		void pushCommand(String username, String password);
	
		Iterable<RevCommit> logCommand();
	
		void openLocalDirectory(String directory);
	
	}
	'''
}