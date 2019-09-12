package tcg.komkit.server.command.json.user;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import tcg.komkit.server.command.json.JsonCommand;
import tcg.komkit.server.command.json.JsonRequest;
import tcg.komkit.server.command.json.JsonResponse;
import tcg.komkit.server.json.JsonCommunity;

/**
 * Get list of community where the user is member of
 */
public abstract class GetCommunitiesCommand extends JsonCommand {
	static private final String DESCRIPTION = "Get list of communities where the user is member of.";
	static private final String COMMAND = "communities";

	public GetCommunitiesCommand() {
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
		public List<JsonCommunity> communities = null;
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
