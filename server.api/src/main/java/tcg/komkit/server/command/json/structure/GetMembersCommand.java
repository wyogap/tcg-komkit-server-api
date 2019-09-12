package tcg.komkit.server.command.json.structure;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import tcg.komkit.server.command.json.JsonCommand;
import tcg.komkit.server.command.json.JsonRequest;
import tcg.komkit.server.command.json.JsonResponse;
import tcg.komkit.server.json.JsonMember;
import tcg.komkit.server.json.JsonMemberInfo;

public abstract class GetMembersCommand extends JsonCommand {
	static private final String DESCRIPTION = "Get all members of the structure.";
	static private final String COMMAND = "members";

	public GetMembersCommand() {
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

		@JsonProperty
		public int pageNumber = 0;

		@JsonProperty
		public int pageSize = 0;
	}

	static public class Response extends JsonResponse {

		@JsonProperty
		public int totalMembers = 0;

		@JsonProperty
		public int pageNumber = 0;

		@JsonProperty
		public int pageSize = 0;

		@JsonProperty
		public List<JsonMemberInfo> members = null;
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
