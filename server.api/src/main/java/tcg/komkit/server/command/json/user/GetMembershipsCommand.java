package tcg.komkit.server.command.json.user;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import tcg.komkit.server.command.json.JsonCommand;
import tcg.komkit.server.command.json.JsonRequest;
import tcg.komkit.server.command.json.JsonResponse;
import tcg.komkit.server.json.JsonMembership;

/**
 * Get user membership status in the community
 */
public abstract class GetMembershipsCommand extends JsonCommand {
	static private final String DESCRIPTION = "Get membership status in communities where the user is member of.";
	static private final String COMMAND = "memberships";

	public GetMembershipsCommand() {
		this.moduleName = UserModule.MODULE;
		this.commandName = COMMAND;
		this.description = DESCRIPTION;
	}

	static public class Request extends JsonRequest {
		public Request() {
			this.module = UserModule.MODULE;
			this.command = COMMAND;
		}
	}

	static public class Response extends JsonResponse {

		@JsonProperty
		public List<JsonMembership> memberships = null;
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
