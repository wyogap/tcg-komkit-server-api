package tcg.komkit.server.command.json.broadcast;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import tcg.komkit.server.command.json.JsonCommand;
import tcg.komkit.server.command.json.JsonRequest;
import tcg.komkit.server.command.json.JsonResponse;

public abstract class GetFailuresCommand extends JsonCommand {
	static private final String DESCRIPTION = "Get list of failures for a broadcast.";
	static private final String COMMAND = "get-failures";

	public GetFailuresCommand() {
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

		@JsonProperty
		public int pageNumber = 0;			//optional

		@JsonProperty
		public int pageSize = 0;			//optional
	}

	static public class Response extends JsonResponse {

		@JsonProperty
		public int totalResults = 0;

		@JsonProperty
		public int pageNumber = 0;

		@JsonProperty
		public int pageSize = 0;

		@JsonProperty
		public List<String> failures = null;
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
