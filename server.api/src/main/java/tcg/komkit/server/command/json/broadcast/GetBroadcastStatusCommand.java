package tcg.komkit.server.command.json.broadcast;

import com.fasterxml.jackson.annotation.JsonProperty;

import tcg.komkit.server.command.json.JsonCommand;
import tcg.komkit.server.command.json.JsonRequest;
import tcg.komkit.server.command.json.JsonResponse;
import tcg.komkit.server.json.JsonBroadcastStatus;

public abstract class GetBroadcastStatusCommand extends JsonCommand {
	static private final String DESCRIPTION = "Get broadcast status.";
	static private final String COMMAND = "status";

	public GetBroadcastStatusCommand() {
		this.moduleName = BroadcastModule.MODULE;
		this.commandName = COMMAND;
		this.description = DESCRIPTION;
	}

	static public class Request extends JsonRequest {

		public Request() {
			this.module = BroadcastModule.MODULE;
			this.command = COMMAND;
		}

		@JsonProperty
		public int communityId = 0;

		@JsonProperty
		public int broadcastId = 0;
	}

	static public class Response extends JsonResponse {

		@JsonProperty
		public JsonBroadcastStatus broadcastStatus = null;
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
