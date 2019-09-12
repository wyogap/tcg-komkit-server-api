package tcg.komkit.server.command.json.community;

import com.fasterxml.jackson.annotation.JsonProperty;

import tcg.komkit.server.command.json.JsonCommand;
import tcg.komkit.server.command.json.JsonRequest;
import tcg.komkit.server.command.json.JsonResponse;

public abstract class RemoveAdministratorCommand extends JsonCommand {
	static private final String DESCRIPTION = "Remove a community administrator.";
	static private final String COMMAND = "remove-admin";

	public RemoveAdministratorCommand() {
		this.moduleName = CommunityModule.MODULE;
		this.commandName = COMMAND;
		this.description = DESCRIPTION;
	}

	static public class Request extends JsonRequest {

		public Request() {
			this.module = CommunityModule.MODULE;
			this.command = COMMAND;
		}

		@JsonProperty
		public int communityId = 0;

		@JsonProperty
		public String adminUserId = null;
	}

	static public class Response extends JsonResponse {

	}

    @Override
	public Class getRequestClass() {
		return Request.class;
	}

    @Override
	public Class getResponseClass() {
		return Response.class;
	}

}
