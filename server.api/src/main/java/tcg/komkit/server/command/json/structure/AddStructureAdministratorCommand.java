package tcg.komkit.server.command.json.structure;

import com.fasterxml.jackson.annotation.JsonProperty;

import tcg.komkit.server.command.json.JsonRequest;
import tcg.komkit.server.command.json.JsonResponse;
import tcg.komkit.server.command.json.community.AddAdministratorCommand;

public abstract class AddStructureAdministratorCommand extends AddAdministratorCommand {
	static private final String DESCRIPTION = "Add a new structure administrator.";
	static private final String COMMAND = "add-admin";

	public AddStructureAdministratorCommand() {
		this.moduleName = StructureModule.MODULE;
		this.commandName = COMMAND;
		this.description = DESCRIPTION;
	}

	static public class Request extends JsonRequest {

		public Request() {
			this.module = StructureModule.MODULE;
			this.command = COMMAND;
		}

		@JsonProperty
		public int communityId = 0;

		@JsonProperty
		public int structureId = 0;

		@JsonProperty
		public String adminUserId = null;
	}


	static public class Response extends JsonResponse {}

	@Override
	public Class<Request> getRequestClass() {
		return Request.class;
	}

	@Override
	public Class<Response> getResponseClass() {
		return Response.class;
	}


}
