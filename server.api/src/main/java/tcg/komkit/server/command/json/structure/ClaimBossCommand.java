package tcg.komkit.server.command.json.structure;

import tcg.komkit.server.command.json.community.JoinCommand;

public abstract class ClaimBossCommand extends JoinCommand {
	static private final String DESCRIPTION = "Join a structure as a boss.";
	static private final String COMMAND = "claim-boss";

	public ClaimBossCommand() {
		this.moduleName = StructureModule.MODULE;
		this.commandName = COMMAND;
		this.description = DESCRIPTION;
	}

	static public class Request extends JoinCommand.Request {
		public Request() {
			this.module = StructureModule.MODULE;
			this.command = COMMAND;
		}
	}

	@Override
	public Class getRequestClass() {
		return Request.class;
	}


}
