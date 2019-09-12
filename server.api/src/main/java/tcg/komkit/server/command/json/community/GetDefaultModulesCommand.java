package tcg.komkit.server.command.json.community;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

import tcg.komkit.server.command.json.JsonCommand;
import tcg.komkit.server.command.json.JsonRequest;
import tcg.komkit.server.command.json.JsonResponse;
import tcg.komkit.server.json.JsonMemberField;
import tcg.komkit.server.json.JsonModuleInfo;

public abstract class GetDefaultModulesCommand extends JsonCommand {
	static private final String DESCRIPTION = "Get list of default modules for this community.";
	static private final String COMMAND = "modules";

	public GetDefaultModulesCommand() {
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
		public List<JsonModuleInfo> modules = null;
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
