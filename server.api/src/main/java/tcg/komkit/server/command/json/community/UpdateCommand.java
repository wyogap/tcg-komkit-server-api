package tcg.komkit.server.command.json.community;

import com.fasterxml.jackson.annotation.JsonProperty;

import tcg.komkit.server.command.json.JsonCommand;
import tcg.komkit.server.command.json.JsonRequest;
import tcg.komkit.server.command.json.JsonResponse;
import tcg.komkit.server.json.ECommunityFrequency;

public abstract class UpdateCommand extends JsonCommand {
	static private final String DESCRIPTION = "Update community setting and information.";
	static private final String COMMAND = "update";

	public UpdateCommand() {
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
		public String communityName = null;

		@JsonProperty
		public ECommunityFrequency adsenseFrequency = ECommunityFrequency.DAYS;

		@JsonProperty
		public int adsenseFrequencyValue = 1;
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
