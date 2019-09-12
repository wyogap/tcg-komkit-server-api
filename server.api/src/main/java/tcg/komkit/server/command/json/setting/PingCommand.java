package tcg.komkit.server.command.json.setting;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

import tcg.komkit.server.command.json.JsonCommand;
import tcg.komkit.server.command.json.JsonRequest;
import tcg.komkit.server.command.json.JsonResponse;
import tcg.komkit.server.json.JsonModule;

public abstract class PingCommand extends JsonCommand {
	static private final String DESCRIPTION = "Ping the server.";
	static private final String COMMAND = "ping";

	public PingCommand() {
		this.moduleName = SettingModule.MODULE;
		this.commandName = COMMAND;
		this.description = DESCRIPTION;
	}

	static public class Request extends JsonRequest {

		public Request() {
			this.module = SettingModule.MODULE;
			this.command = COMMAND;
		}
	}

	static public class Response extends JsonResponse {

		public Response() {}

		public Response(Request request) {
			this.requestId = request.requestId;
		}
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
