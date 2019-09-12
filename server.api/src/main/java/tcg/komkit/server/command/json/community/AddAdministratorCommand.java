package tcg.komkit.server.command.json.community;

import com.fasterxml.jackson.annotation.JsonProperty;
import tcg.komkit.server.command.json.JsonCommand;
import tcg.komkit.server.command.json.JsonRequest;
import tcg.komkit.server.command.json.JsonResponse;

public abstract class AddAdministratorCommand extends JsonCommand {
	static private final String DESCRIPTION = "Add user as community administrator.";
	static private final String COMMAND = "add-admin";

	public AddAdministratorCommand() {
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
		//exactly the same
	}

	public Class getRequestClass() {
		return Request.class;
	}

	public Class getResponseClass() {
		return Response.class;
	}

}
