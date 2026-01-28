package library.functions

class JGitRepositoryAPIGenerator implements FunctionGenerator{
	override generate()
	'''
	package functions;
	
	import static org.eclipse.jgit.lib.Constants.R_HEADS;
	import static org.eclipse.jgit.lib.Constants.R_REMOTES;
	
	import java.io.File;
	import java.io.IOException;
	import java.net.URISyntaxException;
	import java.util.Collection;
	import java.util.List;
	
	import org.eclipse.jgit.api.CreateBranchCommand.SetupUpstreamMode;
	import org.eclipse.jgit.api.Git;
	import org.eclipse.jgit.api.ListBranchCommand.ListMode;
	import org.eclipse.jgit.api.MergeResult;
	import org.eclipse.jgit.api.PullResult;
	import org.eclipse.jgit.api.PushCommand;
	import org.eclipse.jgit.api.RemoteAddCommand;
	import org.eclipse.jgit.api.Status;
	import org.eclipse.jgit.api.errors.GitAPIException;
	import org.eclipse.jgit.dircache.DirCache;
	import org.eclipse.jgit.errors.AmbiguousObjectException;
	import org.eclipse.jgit.errors.IncorrectObjectTypeException;
	import org.eclipse.jgit.errors.NoWorkTreeException;
	import org.eclipse.jgit.errors.RevisionSyntaxException;
	import org.eclipse.jgit.lib.Constants;
	import org.eclipse.jgit.lib.ObjectId;
	import org.eclipse.jgit.lib.Ref;
	import org.eclipse.jgit.lib.RefUpdate.Result;
	import org.eclipse.jgit.lib.Repository;
	import org.eclipse.jgit.merge.MergeStrategy;
	import org.eclipse.jgit.revwalk.RevCommit;
	import org.eclipse.jgit.revwalk.RevWalk;
	import org.eclipse.jgit.transport.FetchResult;
	import org.eclipse.jgit.transport.RemoteConfig;
	import org.eclipse.jgit.transport.TrackingRefUpdate;
	import org.eclipse.jgit.transport.URIish;
	import org.eclipse.jgit.transport.UsernamePasswordCredentialsProvider;
	
	// The high level commands, less granular.
	// Guide: https://www.javacodegeeks.com/2015/12/getting-started-jgit.html
	// https://www.codeaffine.com/2015/12/15/getting-started-with-jgit/
	
	public class JGitRepositoryAPI {
	
		private static JGitRepositoryAPI api;
	
		private JGitRepositoryAPI() {
		}
	
		public static JGitRepositoryAPI getInstance() {
			try {
				if (api == null) {
					api = new JGitRepositoryAPI();
				}
				return api;
			} catch (Exception e) {
	
				e.printStackTrace();
			}
			return null;
		}
	
		/**
		 * Start a new repository at a given location
		 *
		 */
		public Git initLocalDirectory(String directory) {
			return initLocalDirectory(directory, null);
		}
	
		/**
		 * Start a new repository with different work and Git directories. This is
		 * useful if the work directory needs to be separated from the Git directory
		 * (i.e. backup or shared file system through a server)
		 *
		 *
		 */
		public Git initLocalDirectory(String workDirectory, String gitDirectory) {
			try {
				if (gitDirectory != null) {
					return Git.init().setDirectory(new File(workDirectory)).setGitDir(new File(gitDirectory)).call();
				}
				return Git.init().setDirectory(new File(workDirectory)).call();
	
				// Create a default branch main
				// git.branchCreate().setName("main").setStartPoint(CommitCommand("This is a new
				// Branch!")).call();
	
			} catch (IllegalStateException e) {
	
				e.printStackTrace();
	
			} catch (GitAPIException e) {
	
				e.printStackTrace();
	
			}
			return null;
		}
	
		/*
		 * Though remote repositories – like the name suggests – are usually stored on a
		 * remote host, the location given in setURI() can also be a path to a local
		 * resource.
		 *
		 * Authentication: https://www.codeaffine.com/2014/12/09/jgit-authentication/
		 * Clone with multiple branches:
		 * https://www.vogella.com/tutorials/JGit/article.html
		 */
		public Git cloneRepository(String remoteRepo, String directory, String username, String password,
				Boolean cloneAllbranches) {
			try {
				// remoteRepo should be something like this: https://github.com/eclipse/jgit.git
				// directory should be like : /path/to/repo
	
				// TODO Make the credentials provider save the information somewhere in the
				// object, so it doesn't have to recall it everytime.
				// Also check if there is a way to reuse the internal DataStore for passwords
				// used by EGit/JGit
				return Git.cloneRepository().setURI(remoteRepo).setDirectory(new File(directory))
						.setCloneAllBranches(cloneAllbranches)
						.setCredentialsProvider(new UsernamePasswordCredentialsProvider(username, password)).call();
				/*
				 * However the destination location is chosen, explicitly through your code or
				 * by JGit, the designated directory must either be empty or must not exist.
				 */
			} catch (GitAPIException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
		}
	
		public Git openLocalRepository(String directory) {
			// directory should be like : /path/to/repo
			/*
			 * Could add more granularity with FileRepositoryBuilder (More for plumbing
			 * maybe) It would also permit me to check whether or not the repository exist
			 * before calling it, prevent some errors. Worth investigating
			 */
			try {
				return Git.open(new File(directory));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
		}
	
		/**
		 * Add files to the index (Staging area)
		 *
		 * The path given to addFilePattern() must be relative to the work directory
		 * root. If a path does not point to an existing file, it is simply ignored.
		 * This means I should be careful for files that aren't added and report them to
		 * the user if necessary.
		 *
		 * So "readme.txt" means its at the root level of the repository.
		 *
		 * Passing a ‘.’ will add all files within the work directory recursively.
		 */
		public DirCache addCommand(Git git, List<String> paths) {
			try {
				DirCache index = null;
				// Example to add a simple readme.txt
				for (String path : paths) {
					index = git.add().addFilepattern(path).call();
					index.getEntryCount(); // Returns the number of entries that were entered. If it doesn't match the
					// number entered in parameter.
				}
	
				// TODO This might be a dumb check. Verify if this is really needed.
				if (index.getEntryCount() != paths.size()) {
					System.out.println("Some entries have not been added.");
				}
	
				return index;
	
			} catch (GitAPIException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
		}
	
		public RevCommit commitCommand(Git git, String commitMessage) {
			try {
				// TODO How to set the branch the commit is going to be on? Change the git... to
				// something specific?
				RevCommit commit = git.commit().setMessage(commitMessage).call(); // The author and committer are taken from
				return commit; // the configuration if not denoted with
				// the accordingly labeled methods.
			} catch (GitAPIException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
		}
	
		/**
		 * Counterpart of the AddCommand. Removes files specified by paths.
		 *
		 * No wildcards can be used here. Need to be specified individually.
		 *
		 * @param cached true = files deleted from work directory; false = files kept in
		 *               work directory (can be added again later)
		 */
		public DirCache rmCommand(Git git, List<String> paths, Boolean cached) {
			try {
				DirCache index = null;
				// Example to add a simple readme.txt
				for (String path : paths) {
					// Unless .setCached(true) was specified, the file will also be deleted from the
					// work directory.
					index = git.rm().addFilepattern(path).setCached(cached).call();
					index.getEntryCount(); // Returns the number of entries that were entered. If it doesn't match the
					// number entered in parameter.
				}
				return index;
			} catch (GitAPIException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
		}
	
		/**
		 * Counterpart of the AddCommand. Removes files specified by paths.
		 *
		 * No wildcards can be used here. Need to be specified individually.
		 *
		 * rm command without cache (files deleted from work directory)
		 */
		public DirCache rmCommand(Git git, List<String> paths) {
			return rmCommand(git, paths, false);
		}
	
		public Status getStatus(Git git) {
			try {
				return git.status().call(); // addPath(), the StatusCommand can be configured to show only the status of
											// certain files.
			} catch (NoWorkTreeException | GitAPIException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
		}
	
		public Status getStatus(Git git, String path) {
			try {
				// addPath(), the StatusCommand can be configured to show only the status of
				// certain files.
				return git.status().addPath(path).call();
			} catch (NoWorkTreeException | GitAPIException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
		}
	
		/**
		 * This functions returns the commit history with various informations linked to
		 * them.
		 *
		 * @return List of commits in order
		 */
		public Iterable<RevCommit> getLog(Git git) {
			try {
				return git.log().call();
			} catch (GitAPIException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
		}
	
		/**
		 * Avoids a possible resource leak that occurs because the RevWalk that is used
		 * internally by the LogCommand is never closed.
		 *
		 * This is according to the guide (2014) and might be fixed today.
		 *
		 * Recommend using getLog() instead.
		 */
		public void getLogSafe(Git git) {
			Repository repository = git.getRepository();
			try (RevWalk revWalk = new RevWalk(repository)) {
				ObjectId commitId = repository.resolve("refs/heads/side-branch");
				revWalk.markStart(revWalk.parseCommit(commitId));
				for (RevCommit commit : revWalk) {
					System.out.println(commit.getFullMessage());
				}
			} catch (RevisionSyntaxException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (AmbiguousObjectException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IncorrectObjectTypeException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
		/**
		 * Push the current commits to the remote.
		 *
		 * Should call "RemoteAddCommand()" before if no remote repository has been set.
		 *
		 *
		 * This is for pushing all pending commits to the target repository. Does not
		 * check if a repository is set beforehand and does not check for specific
		 * branches (to my knowledge, needs more testing).
		 */
		// TODO check SO for how to push for specific branches (plumbing API)
		public void pushCommand(Git git, String username, String password) {
			// SO:
			// https://stackoverflow.com/questions/13446842/how-do-i-do-git-push-with-jgit
			PushCommand pushCommand = git.push();
			pushCommand.setCredentialsProvider(new UsernamePasswordCredentialsProvider(username, password));
			// you can add more settings here if needed
			try {
				pushCommand.call();
			} catch (GitAPIException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
			/*
			 * Old version: https://www.codeaffine.com/2015/12/15/getting-started-with-jgit/
			 * // Local should be the local repository. Iterable<PushResult> iterable =
			 * local.push().call(); PushResult pushResult = iterable.iterator().next();
			 * org.eclipse.jgit.transport.RemoteRefUpdate.Status status =
			 * pushResult.getRemoteUpdate("refs/heads/master") .getStatus();
			 */
		}
	
		/**
		 * Fetch remote changes at the target repository with the given name and the
		 * target branch.
		 *
		 * @param remoteName       (i.e. "origin")
		 * @param remoteBranchName (i.e. "master")
		 * @return
		 *
		 * @return result the list of changes from the remote
		 */
		public Result fetchCommand(Git git, String remoteName, String remoteBranchName, String username, String password) {
			try {
				FetchResult fetchResult = git.fetch()
						.setCredentialsProvider(new UsernamePasswordCredentialsProvider(username, password)).call();
				TrackingRefUpdate refUpdate = fetchResult
						.getTrackingRefUpdate("refs/remotes/" + remoteName + "/" + remoteBranchName);
				Result result = refUpdate.getResult();
				return result;
			} catch (GitAPIException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
		}
	
		/**
		 * Calls the fetchCommand() with default parameters "origin" and "master"
		 *
		 * @return result the list of changes from the remote
		 */
		public Result fetchCommand(Git git, String username, String password) {
			return fetchCommand(git, "origin", "master", username, password);
		}
	
		// https://www.javacodegeeks.com/2015/12/clone-git-repositories-jgit.html
		/* Returns a list of all the branches a remote repository has to offer */
		public Collection<Ref> remoteRefs(String remote) {
			try {
				Collection<Ref> remoteRefs = Git.lsRemoteRepository().setHeads(true).setRemote(remote).call();
				return remoteRefs;
			} catch (GitAPIException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
		}
	
		/**
		 * Adds a remote repository to the git instance and gives it a custom name.
		 */
		public void remoteAddCommand(Git git, String remoteHttpUrl, String remoteName) {
			RemoteAddCommand remoteAddcommand = git.remoteAdd();
			remoteAddcommand.setName(remoteName);
			try {
				remoteAddcommand.setUri(new URIish(remoteHttpUrl));
			} catch (URISyntaxException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				remoteAddcommand.call();
			} catch (GitAPIException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
		}
	
		/**
		 * Adds a remote repository to the git instance with the default name "origin".
		 */
		public void remoteAddCommand(Git git, String remoteHttpUrl) {
			remoteAddCommand(git, remoteHttpUrl, "origin");
		}
	
		/**
		 * Create a new branch with a given name.
		 *
		 * @return reference to the branch
		 */
		public Ref createBranch(Git git, String name) {
			Ref headRef;
			try {
				headRef = git.getRepository().getRefDatabase().findRef(Constants.HEAD);
				if (headRef == null || headRef.getObjectId() == null) {
					System.out.println("WARNING: No initial commit has been made.");
					System.out.println("Creating initial commit...");
					commitCommand(git, "Initial commit");
					System.out.println("'master' branch created and initial commit done.");
					return git.branchCreate().setName(name).call();
				}
				return git.branchCreate().setName(name).call();
			} catch (IOException | GitAPIException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
			return null;
	
		}
	
		/**
		 * Create a new branch with a given name and a commit to start from.
		 *
		 * @return reference to the branch
		 */
		public Ref createBranch(Git git, String name, RevCommit commit) {
			try {
				// TODO check if locally created branches get pushed to a remote repository
				// automatically
				return git.branchCreate().setName(name).setStartPoint(commit).call();
			} catch (GitAPIException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
		}
	
		public Repository getRepository(Git git) {
			return git.getRepository();
		}
	
		/**
		 * Checkout another branch.
		 *
		 * @param branchName The name of the branch to checkout
		 */
		public Ref checkoutCommand(Git git, String branchName) {
			try {
				return git.checkout().setName(branchName).call();
			} catch (GitAPIException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
		}
	
		/**
		 * Create a new branch and checkout to it. Setup a tracker to a remote branch
		 * and set the start point.
		 *
		 * Mandatory to pull a remote branch locally.
		 *
		 * @param branchName     The name of the new branch to be created
		 * @param startPointName The name of the branch you should create the new branch
		 *                       from (start point)
		 */
		// TODO Maybe rename this method to something more meaningful like
		// pullRemoteBranchLocally
		public Ref checkoutCreateCommand(Git git, String branchName, String startPointName) {
			try {
	
				return git.checkout().setCreateBranch(true).setName(branchName).setUpstreamMode(SetupUpstreamMode.TRACK)
						.setStartPoint("origin/" + startPointName).call();
			} catch (GitAPIException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				checkoutCommand(git, branchName);
			}
			return null;
		}
	
		/**
		 * Create a new branch and checkout to it. The start point is the current HEAD
		 * for the new branch.
		 *
		 * @param branchName The name of the new branch to be created
		 */
		public Ref checkoutCreateCommand(Git git, String branchName) {
			try {
				return git.checkout().setCreateBranch(true).setName(branchName).call();
			} catch (GitAPIException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
		}
	
		public List<Ref> branchListCommand(Git git) {
			try {
				return git.branchList().call();
			} catch (GitAPIException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
		}
	
		public List<Ref> remoteBranchListCommand(Git git) {
			try {
				return git.branchList().setListMode(ListMode.REMOTE).call();
			} catch (GitAPIException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
	
		}
	
		public List<RemoteConfig> remoteListCommand(Git git) {
			try {
				return git.remoteList().call();
			} catch (GitAPIException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
	
		}
	
		/**
		 * Basic Pull operation for merging incoming changes into the local repository.
		 */
		public PullResult pullCommand(Git git, String username, String password) {
	
			try {
				return git.pull().setCredentialsProvider(new UsernamePasswordCredentialsProvider(username, password))
						.call();
			} catch (GitAPIException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
		}
	
		/**
		 * Merge a given remote branch with the current HEAD.
		 *
		 * @return
		 */
		// SO:
		// https://stackoverflow.com/questions/36372274/how-to-get-conflicts-before-merge-with-jgit
		// DSMCompare?
		public MergeResult mergeRemoteCommand(Git git, String branchName, MergeStrategy mergeStrategy) {
			try {
				return git.merge().setStrategy(mergeStrategy).include(git.getRepository().exactRef(R_REMOTES + branchName))
						.call();
			} catch (IOException | GitAPIException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
		}
	
		/**
		 * Merge a given local branch with the current HEAD.
		 *
		 * @return
		 */
		// SO:
		// https://stackoverflow.com/questions/36372274/how-to-get-conflicts-before-merge-with-jgit
		public MergeResult mergeLocalCommand(Git git, String branchName, MergeStrategy mergeStrategy) {
			try {
				return git.merge().setStrategy(mergeStrategy).include(git.getRepository().exactRef(R_HEADS + branchName))
						.call();
			} catch (IOException | GitAPIException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
		}
	
	}
	
	'''
}