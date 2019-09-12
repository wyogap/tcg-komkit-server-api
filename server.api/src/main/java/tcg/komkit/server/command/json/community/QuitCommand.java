package tcg.komkit.server.command.json.community;

import com.fasterxml.jackson.annotation.JsonProperty;

import tcg.komkit.server.command.json.JsonCommand;
import tcg.komkit.server.command.json.JsonRequest;
import tcg.komkit.server.command.json.JsonResponse;

public abstract class QuitCommand extends JsonCommand {
	static private final String DESCRIPTION = "Quit a community.";
	static private final String COMMAND = "quit";

	public QuitCommand() {
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
