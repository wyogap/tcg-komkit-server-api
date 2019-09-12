package tcg.komkit.server.command.json.community;

import com.fasterxml.jackson.annotation.JsonProperty;

import tcg.komkit.server.json.EReferralType;
import tcg.komkit.server.command.json.JsonCommand;
import tcg.komkit.server.command.json.JsonRequest;
import tcg.komkit.server.command.json.JsonResponse;

public abstract class GenerateReferralCommand extends JsonCommand {

	static private final String DESCRIPTION = "Generate a referral code for a user. Used for invitation.";
	static private final String COMMAND = "generate-referral";

	public GenerateReferralCommand() {
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

		// optional
		@JsonProperty
		public int structureId = 0;

		@JsonProperty
		public String targetUserId = null;

		@JsonProperty
		public EReferralType type = EReferralType.MEMBER;
	}

	static public class Response extends JsonResponse {

		@JsonProperty
		public String referral = null;
	}

	public Class getRequestClass() {
		return Request.class;
	}

	public Class getResponseClass() {
		return Response.class;
	}

}
