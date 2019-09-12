package tcg.komkit.server.command.json.community;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

import tcg.komkit.server.command.json.JsonCommand;
import tcg.komkit.server.command.json.JsonRequest;
import tcg.komkit.server.command.json.JsonResponse;

public abstract class JoinCommand extends JsonCommand  {
	static private final String DESCRIPTION = "Join a community.";
	static private final String COMMAND = "join";

	public JoinCommand() {
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
		public String referral = null;

		@JsonProperty
		public String name = null;

		@JsonProperty
		public Map<String, String> profile = null;
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
