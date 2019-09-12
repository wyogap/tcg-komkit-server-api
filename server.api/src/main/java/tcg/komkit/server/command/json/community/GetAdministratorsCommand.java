package tcg.komkit.server.command.json.community;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import tcg.komkit.server.command.json.JsonCommand;
import tcg.komkit.server.command.json.JsonRequest;
import tcg.komkit.server.command.json.JsonResponse;
import tcg.komkit.server.json.JsonMember;
import tcg.komkit.server.json.JsonMemberInfo;

public abstract class GetAdministratorsCommand extends JsonCommand {
	static private final String DESCRIPTION = "Get the list of community administrators.";
	static private final String COMMAND = "admins";

	public GetAdministratorsCommand() {
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
		public List<JsonMemberInfo> members = null;
	}

	public Class getRequestClass() {
		return Request.class;
	}

	public Class getResponseClass() {
		return Response.class;
	}

}
