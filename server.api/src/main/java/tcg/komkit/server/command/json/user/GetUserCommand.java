package tcg.komkit.server.command.json.user;

import com.fasterxml.jackson.annotation.JsonProperty;

import tcg.komkit.server.command.json.JsonCommand;
import tcg.komkit.server.command.json.JsonRequest;
import tcg.komkit.server.command.json.JsonResponse;
import tcg.komkit.server.json.JsonUser;

/**
 * Get user info
 */
public abstract class GetUserCommand extends JsonCommand {
	static private final String DESCRIPTION = "Get detail info of a user.";
	static private final String COMMAND = "info";

	public GetUserCommand() {
		this.moduleName = UserModule.MODULE;
		this.commandName = COMMAND;
		this.description = DESCRIPTION;
	}

	static public class Request extends JsonRequest {
		public Request() {
			this.module = UserModule.MODULE;
			this.command = COMMAND;
		}

		public String targetUserId = null;
	}

	static public class Response extends JsonResponse {

		@JsonProperty
		public JsonUser user = null;
	}

    @Override
	public Class<Request> getRequestClass() {
		return Request.class;
	}

    @Override
	public Class<Response> getResponseClass() {
		return Response.class;
	}

}
