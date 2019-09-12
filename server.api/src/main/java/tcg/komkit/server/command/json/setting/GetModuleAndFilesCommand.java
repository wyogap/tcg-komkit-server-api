package tcg.komkit.server.command.json.setting;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

import tcg.komkit.server.command.json.JsonCommand;
import tcg.komkit.server.command.json.JsonRequest;
import tcg.komkit.server.command.json.JsonResponse;
import tcg.komkit.server.json.JsonModule;
import tcg.komkit.server.json.JsonModuleInfo;

public abstract class GetModuleAndFilesCommand extends JsonCommand {
	static private final String DESCRIPTION = "Get a module and its file and dependecies.";
	static private final String COMMAND = "module";

	public GetModuleAndFilesCommand() {
		this.moduleName = SettingModule.MODULE;
		this.commandName = COMMAND;
		this.description = DESCRIPTION;
	}

	static public class Request extends JsonRequest {

		public Request() {
			this.module = SettingModule.MODULE;
			this.command = COMMAND;
		}

		@JsonProperty
		public String moduleId = null;
	}

	static public class Response extends JsonResponse {

		@JsonProperty
		public JsonModule module = null;

		@JsonProperty
		public List<String> files = null;
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
