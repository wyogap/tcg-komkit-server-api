package tcg.komkit.server.command.json.setting;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Set;

import tcg.komkit.server.command.json.JsonCommand;
import tcg.komkit.server.command.json.JsonRequest;
import tcg.komkit.server.command.json.JsonResponse;
import tcg.komkit.server.command.json.community.CommunityModule;
import tcg.komkit.server.json.JsonMember;
import tcg.komkit.server.json.JsonModuleInfo;

public abstract class SearchModulesCommand extends JsonCommand {
	static private final String DESCRIPTION = "Search module list.";
	static private final String COMMAND = "search-modules";

	public SearchModulesCommand() {
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
		public String searchString = null;

		@JsonProperty
		public int pageNumber = 0;

		@JsonProperty
		public int pageSize = 0;
	}

	static public class Response extends JsonResponse {

		@JsonProperty
		public int totalResults = 0;

		@JsonProperty
		public int pageNumber = 0;

		@JsonProperty
		public int pageSize = 0;

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
