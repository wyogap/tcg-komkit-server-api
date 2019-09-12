package tcg.komkit.server.command.json.broadcast;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

import tcg.komkit.server.command.json.JsonCommand;
import tcg.komkit.server.command.json.JsonRequest;
import tcg.komkit.server.command.json.JsonResponse;
import tcg.komkit.server.json.EBroadcastType;

public abstract class SendCommand extends JsonCommand {
	static private final String DESCRIPTION = "Broadcast a message to all community/structure members.";
	static private final String COMMAND = "send";

	public SendCommand() {
		this.moduleName = BroadcastModule.MODULE;
		this.commandName = COMMAND;
		this.description = DESCRIPTION;
	}

	static public class Request extends JsonRequest {

		public Request() {
			this.module = BroadcastModule.MODULE;
			this.command = COMMAND;
		}

		@JsonProperty
		public int communityId = 0;

		@JsonProperty
		public int structureId = 0;		//optional

		@JsonProperty
		public String message;

		@JsonProperty
		public EBroadcastType type;

		@JsonProperty
		public Date expiryDate;

		@JsonProperty
		public String acknowledgeString;

		@JsonProperty
		public String approveString;

		@JsonProperty
		public String rejectString;
	}

	static public class Response extends JsonResponse {

		@JsonProperty
		public int broadcastId = 0;
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
