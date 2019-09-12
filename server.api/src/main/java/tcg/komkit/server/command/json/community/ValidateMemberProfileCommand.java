package tcg.komkit.server.command.json.community;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import tcg.komkit.server.command.json.JsonCommand;
import tcg.komkit.server.command.json.JsonRequest;
import tcg.komkit.server.command.json.JsonResponse;

public abstract class ValidateMemberProfileCommand extends JsonCommand {
	static private final String DESCRIPTION = "Validate profile (member fields) on a community member.";
	static private final String COMMAND = "validate-profile";

	public ValidateMemberProfileCommand() {
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
		public String targetUserId = null;

		@JsonProperty
		public List<String> fieldNames = null;
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
