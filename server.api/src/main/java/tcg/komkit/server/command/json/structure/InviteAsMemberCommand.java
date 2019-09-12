package tcg.komkit.server.command.json.structure;

import com.fasterxml.jackson.annotation.JsonProperty;
import tcg.komkit.server.command.json.JsonRequest;
import tcg.komkit.server.command.json.JsonResponse;
import tcg.komkit.server.command.json.community.GenerateReferralCommand;

public abstract class InviteAsMemberCommand extends GenerateReferralCommand {
	static private final String DESCRIPTION = "Invite a new user as member to a structure.";
	static private final String COMMAND = "invite-member";

	public InviteAsMemberCommand() {
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

		// optional
		@JsonProperty
		public int structureId = 0;

		@JsonProperty
		public String targetUserId = null;
	}

	static public class Response extends JsonResponse {

		@JsonProperty
		public String referral = null;
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
