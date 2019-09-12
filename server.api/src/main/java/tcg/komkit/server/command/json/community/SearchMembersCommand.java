package tcg.komkit.server.command.json.community;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import tcg.komkit.server.command.json.JsonCommand;
import tcg.komkit.server.command.json.JsonRequest;
import tcg.komkit.server.command.json.JsonResponse;
import tcg.komkit.server.json.JsonMember;
import tcg.komkit.server.json.JsonMemberInfo;

public abstract class SearchMembersCommand extends JsonCommand {
	static private final String DESCRIPTION = "Search community members.";
	static private final String COMMAND = "search-members";

	public SearchMembersCommand() {
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
		public List<JsonMemberInfo> results = null;
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
