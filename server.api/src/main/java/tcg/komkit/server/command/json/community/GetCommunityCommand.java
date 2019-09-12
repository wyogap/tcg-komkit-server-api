package tcg.komkit.server.command.json.community;

import com.fasterxml.jackson.annotation.JsonProperty;

import tcg.komkit.server.command.json.JsonCommand;
import tcg.komkit.server.command.json.JsonRequest;
import tcg.komkit.server.command.json.JsonResponse;
import tcg.komkit.server.json.JsonCommunity;

public abstract class GetCommunityCommand extends JsonCommand {
	static private final String DESCRIPTION = "Get detail info about a community.";
	static private final String COMMAND = "info";

	public GetCommunityCommand() {
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
	}

	static public class Response extends JsonResponse {

		@JsonProperty
		public JsonCommunity community = null;
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
