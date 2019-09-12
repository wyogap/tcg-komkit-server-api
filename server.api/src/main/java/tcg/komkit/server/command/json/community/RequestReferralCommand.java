package tcg.komkit.server.command.json.community;

import com.fasterxml.jackson.annotation.JsonProperty;

import tcg.komkit.server.command.json.JsonCommand;
import tcg.komkit.server.command.json.JsonRequest;
import tcg.komkit.server.command.json.JsonResponse;

public abstract class RequestReferralCommand extends JsonCommand {
	static private final String DESCRIPTION = "Request a referral code to join a community.";
	static private final String COMMAND = "request-referral";

	public RequestReferralCommand() {
		this.moduleName = CommunityModule.MODULE;
		this.commandName = COMMAND;
		this.description = DESCRIPTION;
	}

	static public class Request extends JsonRequest {

		public Request() {
			this.module = CommunityModule.MODULE;
			this.command = COMMAND;
		}

		//@JsonProperty
		//public String userName = null;

		@JsonProperty
		public int communityId = 0;

		@JsonProperty
		public String verifierUserId = null;

		@JsonProperty
		public String message = null;
	}

	static public class Response extends JsonResponse {

		@JsonProperty
		public String referral = null;
	}


	@Override
	public Class getRequestClass() {
		return Request.class;
	}

	@Override
	public Class getResponseClass() {
		return Response.class;
	}

}
