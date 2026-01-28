package vcsFeaturesMM.util;

import java.io.FileWriter;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Exceptions;
import vcsFeaturesMM.Database;
import vcsFeaturesMM.HighLevelCommand;
import vcsFeaturesMM.History;
import vcsFeaturesMM.LowLevelCommand;

@SuppressWarnings("all")
public class PartialGenerator {
  private EList<LowLevelCommand> llc;

  private EList<HighLevelCommand> hlc;

  private EList<Database> databases;

  private History history;

  private String appName;

  private boolean hasHighLevelCommands = false;

  private boolean hasLowLevelCommands = false;

  private boolean hasDSMCompare = false;

  private boolean hasAdd = false;

  private boolean hasCheckout = false;

  private boolean hasCheckoutCreate = false;

  private boolean hasClone = false;

  private boolean hasCommit = false;

  private boolean hasCherryPick = false;

  private boolean hasCreateBranch = false;

  private boolean hasFetch = false;

  private boolean hasInit = false;

  private boolean hasLog = false;

  private boolean hasOpen = false;

  private boolean hasPull = false;

  private boolean hasPush = false;

  private boolean hasRemoteAdd = false;

  private boolean hasRm = false;

  private boolean hasGitDiff = false;

  private boolean hasSingleBranch = false;

  private boolean hasMultiBranch = false;

  private boolean hasInfiniteBranches = false;

  private boolean hasLimitBranches = false;

  private boolean hasSpecificWindowRange = false;

  private boolean hasLabel = false;

  private boolean hasUniqueCustomLabel = false;

  private boolean hasCommitHash = false;

  private boolean hasFile = false;

  private boolean hasSemantic = false;

  private boolean hasElement = false;

  private boolean hasLine = false;

  private boolean hasLocalOnly = false;

  private boolean hasRemote = false;

  private boolean hasSQL = false;

  private boolean hasMongoDB = false;

  private boolean hasNeo4J = false;

  private boolean hasXMI = false;

  private FileWriter myWriter;

  private String myString;

  /**
   * '''VCSFeatures TestingV4
   * # COMMANDS
   * Merge tool: GitDiff
   * Basic command declaration:
   * - Command use Add as add,
   * - Command use Commit as commit,
   * - Command use Push as push,
   * - Command use Pull as pull,
   * - Command use Open as open
   * Super command declaration:
   * - Super command AddCommitPushPull with add -> commit -> push -> pull,
   * - Super command OpenAddCommit with open -> add -> commit
   * # HISTORY
   * Identifying label: CommitHash
   * Version history backlog: 0
   * Maximum number of branches: 0
   * # VERSIONNING
   * Detail level: Line, File
   * # COLLABORATION STYLE
   * Working: LocalOnly
   * # DATABASES
   * DB SQL @ "127.0.0.1",
   * DB MongoDB @ "https://www.google.com:8080",
   * DB Neo4J @ "192.168.0.1"
   * '''
   */
  public void generatePartialDynamicInstance() {
    try {
      FileWriter _fileWriter = new FileWriter("PartialDynamicInstance.vcs");
      this.myWriter = _fileWriter;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("VCSFeatures ");
      _builder.append(this.appName);
      _builder.newLineIfNotEmpty();
      _builder.append("# COMMANDS");
      _builder.newLine();
      {
        if (this.hasGitDiff) {
          _builder.append("Merge tool: GitDiff");
          _builder.newLine();
        }
      }
      this.myString = _builder.toString();
      if (this.hasDSMCompare) {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("Merge tool: DSMCompare");
        _builder_1.newLine();
        String _plus = (this.myString + _builder_1);
        this.myString = _plus;
      }
      if (this.hasLowLevelCommands) {
        StringConcatenation _builder_2 = new StringConcatenation();
        _builder_2.append("Basic command declaration:");
        _builder_2.newLine();
        {
          for(final LowLevelCommand low : this.llc) {
            _builder_2.append("- Command use ");
            String _literal = low.getCommand().getLiteral();
            _builder_2.append(_literal);
            _builder_2.append(" as ");
            String _name = low.getName();
            _builder_2.append(_name);
            _builder_2.newLineIfNotEmpty();
            _builder_2.newLine();
          }
        }
        String _plus_1 = (this.myString + _builder_2);
        this.myString = _plus_1;
      }
      if (this.hasHighLevelCommands) {
        StringConcatenation _builder_3 = new StringConcatenation();
        _builder_3.append("Super command declaration:");
        _builder_3.newLine();
        String _plus_2 = (this.myString + _builder_3);
        this.myString = _plus_2;
        for (final HighLevelCommand high : this.hlc) {
          {
            int i = ((int) 0);
            StringConcatenation _builder_4 = new StringConcatenation();
            _builder_4.append("- Super command ");
            String _name_1 = high.getName();
            _builder_4.append(_name_1);
            _builder_4.append(" with ");
            String _plus_3 = (this.myString + _builder_4);
            this.myString = _plus_3;
            EList<LowLevelCommand> _lowlevelcommand = high.getLowlevelcommand();
            for (final LowLevelCommand low_1 : _lowlevelcommand) {
              {
                i = (i + 1);
                StringConcatenation _builder_5 = new StringConcatenation();
                String _name_2 = low_1.getName();
                _builder_5.append(_name_2);
                {
                  int _size = high.getLowlevelcommand().size();
                  boolean _lessThan = (i < _size);
                  if (_lessThan) {
                    _builder_5.append(" -> ");
                  }
                }
                {
                  int _size_1 = high.getLowlevelcommand().size();
                  boolean _greaterEqualsThan = (i >= _size_1);
                  if (_greaterEqualsThan) {
                    _builder_5.newLineIfNotEmpty();
                    _builder_5.append("\t\t\t\t\t");
                  }
                }
                String _plus_4 = (this.myString + _builder_5);
                this.myString = _plus_4;
              }
            }
          }
        }
      }
      StringConcatenation _builder_4 = new StringConcatenation();
      _builder_4.append("# HISTORY ");
      _builder_4.newLine();
      String _plus_3 = (this.myString + _builder_4);
      this.myString = _plus_3;
      StringConcatenation _builder_5 = new StringConcatenation();
      _builder_5.append("Identifying label: ");
      String _name_1 = this.history.getLabelType().getName();
      _builder_5.append(_name_1);
      _builder_5.newLineIfNotEmpty();
      String _plus_4 = (this.myString + _builder_5);
      this.myString = _plus_4;
      if (this.hasSpecificWindowRange) {
        StringConcatenation _builder_6 = new StringConcatenation();
        _builder_6.append("Version history backlog: ");
        int _commitHistoryRange = this.history.getCommitHistoryRange();
        _builder_6.append(_commitHistoryRange);
        _builder_6.newLineIfNotEmpty();
        String _plus_5 = (this.myString + _builder_6);
        this.myString = _plus_5;
      } else {
        StringConcatenation _builder_7 = new StringConcatenation();
        _builder_7.append("Version history backlog: 0");
        _builder_7.newLine();
        String _plus_6 = (this.myString + _builder_7);
        this.myString = _plus_6;
      }
      if (this.hasSingleBranch) {
        StringConcatenation _builder_8 = new StringConcatenation();
        _builder_8.append("Maximum number of branches: 1");
        _builder_8.newLine();
        String _plus_7 = (this.myString + _builder_8);
        this.myString = _plus_7;
      }
      if (this.hasLimitBranches) {
        StringConcatenation _builder_9 = new StringConcatenation();
        _builder_9.append("Maximum number of branches: ");
        int _numberOfBranches = this.history.getNumberOfBranches();
        _builder_9.append(_numberOfBranches);
        _builder_9.newLineIfNotEmpty();
        String _plus_8 = (this.myString + _builder_9);
        this.myString = _plus_8;
      }
      if (this.hasInfiniteBranches) {
        StringConcatenation _builder_10 = new StringConcatenation();
        _builder_10.append("Maximum number of branches: 0");
        _builder_10.newLine();
        String _plus_9 = (this.myString + _builder_10);
        this.myString = _plus_9;
      }
      StringConcatenation _builder_11 = new StringConcatenation();
      _builder_11.append("# VERSIONNING ");
      _builder_11.newLine();
      _builder_11.append("Detail level:");
      _builder_11.newLine();
      String _plus_10 = (this.myString + _builder_11);
      this.myString = _plus_10;
      if (this.hasFile) {
        StringConcatenation _builder_12 = new StringConcatenation();
        _builder_12.append("File");
        _builder_12.newLine();
        String _plus_11 = (this.myString + _builder_12);
        this.myString = _plus_11;
      }
      if (this.hasSemantic) {
        StringConcatenation _builder_13 = new StringConcatenation();
        _builder_13.append("Semantic");
        _builder_13.newLine();
        String _plus_12 = (this.myString + _builder_13);
        this.myString = _plus_12;
      }
      if (this.hasElement) {
        StringConcatenation _builder_14 = new StringConcatenation();
        _builder_14.append("Element");
        _builder_14.newLine();
        String _plus_13 = (this.myString + _builder_14);
        this.myString = _plus_13;
      }
      if (this.hasLine) {
        StringConcatenation _builder_15 = new StringConcatenation();
        _builder_15.append("Line");
        _builder_15.newLine();
        String _plus_14 = (this.myString + _builder_15);
        this.myString = _plus_14;
      }
      StringConcatenation _builder_16 = new StringConcatenation();
      _builder_16.append("# COLLABORATION STYLE");
      _builder_16.newLine();
      String _plus_15 = (this.myString + _builder_16);
      this.myString = _plus_15;
      if (this.hasLocalOnly) {
        StringConcatenation _builder_17 = new StringConcatenation();
        _builder_17.append("Working: LocalOnly");
        _builder_17.newLine();
        String _plus_16 = (this.myString + _builder_17);
        this.myString = _plus_16;
      }
      if (this.hasRemote) {
        StringConcatenation _builder_18 = new StringConcatenation();
        _builder_18.append("Working: Remote");
        _builder_18.newLine();
        String _plus_17 = (this.myString + _builder_18);
        this.myString = _plus_17;
      }
      StringConcatenation _builder_19 = new StringConcatenation();
      _builder_19.append("# DATABASES");
      _builder_19.newLine();
      String _plus_18 = (this.myString + _builder_19);
      this.myString = _plus_18;
      for (final Database db : this.databases) {
        StringConcatenation _builder_20 = new StringConcatenation();
        _builder_20.append("DB ");
        String _name_2 = db.getName();
        _builder_20.append(_name_2);
        _builder_20.append(" ");
        String _name_3 = db.getDatabaseType().getName();
        _builder_20.append(_name_3);
        _builder_20.append(" @ ");
        String _connectionString = db.getConnectionString();
        _builder_20.append(_connectionString);
        _builder_20.newLineIfNotEmpty();
        String _plus_19 = (this.myString + _builder_20);
        this.myString = _plus_19;
      }
      this.myWriter.write(this.myString);
      this.myWriter.close();
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  public boolean hasHighLevelCommands() {
    return this.hasHighLevelCommands;
  }

  public boolean setHighLevelCommands(final boolean value) {
    return this.hasHighLevelCommands = value;
  }

  public boolean getLowLevelCommands(final boolean value) {
    return this.hasLowLevelCommands;
  }

  public boolean setLowLevelCommands(final boolean value) {
    return this.hasLowLevelCommands = value;
  }

  public boolean hasAdd() {
    return this.hasAdd;
  }

  public boolean setAdd(final boolean value) {
    return this.hasAdd = value;
  }

  public boolean hasCheckout() {
    return this.hasCheckout;
  }

  public boolean setCheckout(final boolean value) {
    return this.hasCheckout = value;
  }

  public boolean hasCheckoutCreate() {
    return this.hasCheckoutCreate;
  }

  public boolean setCheckoutCreate(final boolean value) {
    return this.hasCheckoutCreate = value;
  }

  public boolean hasClone() {
    return this.hasClone;
  }

  public boolean setClone(final boolean value) {
    return this.hasClone = value;
  }

  public boolean hasCommit() {
    return this.hasCommit;
  }

  public boolean setCommit(final boolean value) {
    return this.hasCommit = value;
  }

  public boolean hasCherryPick() {
    return this.hasCherryPick;
  }

  public boolean setCherryPick(final boolean value) {
    return this.hasCherryPick = value;
  }

  public boolean hasCreateBranch() {
    return this.hasCreateBranch;
  }

  public boolean setCreateBranch(final boolean value) {
    return this.hasCreateBranch = value;
  }

  public boolean hasFetch() {
    return this.hasFetch;
  }

  public boolean setFetch(final boolean value) {
    return this.hasFetch = value;
  }

  public boolean hasInit() {
    return this.hasInit;
  }

  public boolean setInit(final boolean value) {
    return this.hasInit = value;
  }

  public boolean hasLog() {
    return this.hasLog;
  }

  public boolean setLog(final boolean value) {
    return this.hasLog = value;
  }

  public boolean hasOpen() {
    return this.hasOpen;
  }

  public boolean setOpen(final boolean value) {
    return this.hasOpen = value;
  }

  public boolean hasPull() {
    return this.hasPull;
  }

  public boolean setPull(final boolean value) {
    return this.hasPull = value;
  }

  public boolean hasPush() {
    return this.hasPush;
  }

  public boolean setPush(final boolean value) {
    return this.hasPush = value;
  }

  public boolean hasRemoteAdd() {
    return this.hasRemoteAdd;
  }

  public boolean setRemoteAdd(final boolean value) {
    return this.hasRemoteAdd = value;
  }

  public boolean hasRm() {
    return this.hasRm;
  }

  public boolean setRm(final boolean value) {
    return this.hasRm = value;
  }

  public boolean hasDSMCompare() {
    return this.hasDSMCompare;
  }

  public boolean setDSMCompare(final boolean value) {
    return this.hasDSMCompare = value;
  }

  public boolean hasGitDiff() {
    return this.hasGitDiff;
  }

  public boolean setGitDiff(final boolean value) {
    return this.hasGitDiff = value;
  }

  public boolean hasSingleBranch() {
    return this.hasSingleBranch;
  }

  public boolean setSingleBranch(final boolean value) {
    return this.hasSingleBranch = value;
  }

  public boolean hasMultiBranch() {
    return this.hasMultiBranch;
  }

  public boolean setMultiBranch(final boolean value) {
    return this.hasMultiBranch = value;
  }

  public boolean hasInfiniteBranches() {
    return this.hasInfiniteBranches;
  }

  public boolean setInfiniteBranches(final boolean value) {
    return this.hasInfiniteBranches = value;
  }

  public boolean hasLimitBranches() {
    return this.hasLimitBranches;
  }

  public boolean setLimitBranches(final boolean value) {
    return this.hasLimitBranches = value;
  }

  public boolean hasSpecificWindowRange() {
    return this.hasSpecificWindowRange;
  }

  public boolean setSpecificWindowRange(final boolean value) {
    return this.hasSpecificWindowRange = value;
  }

  public boolean hasLabel() {
    return this.hasLabel;
  }

  public boolean setLabel(final boolean value) {
    return this.hasLabel = value;
  }

  public boolean hasUniqueCustomLabel() {
    return this.hasUniqueCustomLabel;
  }

  public boolean setUniqueCustomLabel(final boolean value) {
    return this.hasUniqueCustomLabel = value;
  }

  public boolean hasCommitHash() {
    return this.hasCommitHash;
  }

  public boolean setCommitHash(final boolean value) {
    return this.hasCommitHash = value;
  }

  public boolean hasFile() {
    return this.hasFile;
  }

  public boolean setFile(final boolean value) {
    return this.hasFile = value;
  }

  public boolean hasSemantic() {
    return this.hasSemantic;
  }

  public boolean setSemantic(final boolean value) {
    return this.hasSemantic = value;
  }

  public boolean hasElement() {
    return this.hasElement;
  }

  public boolean setElement(final boolean value) {
    return this.hasElement = value;
  }

  public boolean hasLine() {
    return this.hasLine;
  }

  public boolean setLine(final boolean value) {
    return this.hasLine = value;
  }

  public boolean hasLocalOnly() {
    return this.hasLocalOnly;
  }

  public boolean setLocalOnly(final boolean value) {
    return this.hasLocalOnly = value;
  }

  public boolean hasRemote() {
    return this.hasRemote;
  }

  public boolean setRemote(final boolean value) {
    return this.hasRemote = value;
  }

  public boolean hasSQL() {
    return this.hasSQL;
  }

  public boolean setSQL(final boolean value) {
    return this.hasSQL = value;
  }

  public boolean hasMongoDB() {
    return this.hasMongoDB;
  }

  public boolean setMongoDB(final boolean value) {
    return this.hasMongoDB = value;
  }

  public boolean hasNeo4J() {
    return this.hasNeo4J;
  }

  public boolean setNeo4J(final boolean value) {
    return this.hasNeo4J = value;
  }

  public boolean hasXMI() {
    return this.hasXMI;
  }

  public boolean setXMI(final boolean value) {
    return this.hasXMI = value;
  }

  public History setHistory(final History value) {
    return this.history = value;
  }

  public EList<Database> setDatabase(final EList<Database> value) {
    return this.databases = value;
  }

  public EList<LowLevelCommand> setLowLevelCommands(final EList<LowLevelCommand> value) {
    return this.llc = value;
  }

  public EList<HighLevelCommand> setHighLevelCommands(final EList<HighLevelCommand> value) {
    return this.hlc = value;
  }

  public String setAppName(final String value) {
    return this.appName = value;
  }
}
