package tcg.komkit.server.command.json.structure;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import tcg.komkit.server.command.json.JsonRequest;
import tcg.komkit.server.command.json.JsonResponse;
import tcg.komkit.server.command.json.community.GetAdministratorsCommand;
import tcg.komkit.server.json.JsonMember;
import tcg.komkit.server.json.JsonMemberInfo;

public abstract class GetStructureAdministratorsCommand extends GetAdministratorsCommand {
	static private final String DESCRIPTION = "Get list of structure administrators.";
	static private final String COMMAND = "admins";

	public GetStructureAdministratorsCommand() {
		this.moduleName = StructureModule.MODULE;
		this.commandName = COMMAND;
		this.description = DESCRIPTION;
	}

	static public class Request extends JsonRequest {

		public Request() {
			this.module = StructureModule.MODULE;
			this.command = COMMAND;
		}

		@JsonProperty
		public int communityId = 0;

		@JsonProperty
		public int structureId = 0;
	}

	static public class Response extends JsonResponse {

		@JsonProperty
		public List<JsonMemberInfo> members = null;
	}

	public Class<Request> getRequestClass() {
		return Request.class;
	}

	public Class<JsonResponse> getResponseClass() {
		return JsonResponse.class;
	}

}
