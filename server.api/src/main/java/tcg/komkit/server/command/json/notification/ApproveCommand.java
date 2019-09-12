package tcg.komkit.server.command.json.notification;

import com.fasterxml.jackson.annotation.JsonProperty;

import tcg.komkit.server.command.json.JsonCommand;
import tcg.komkit.server.command.json.JsonRequest;
import tcg.komkit.server.command.json.JsonResponse;

public abstract class ApproveCommand extends JsonCommand {
	static private final String DESCRIPTION = "Approve a notification.";
	static private final String COMMAND = "approve";

	public ApproveCommand() {
		this.moduleName = NotificationModule.MODULE;
		this.commandName = COMMAND;
		this.description = DESCRIPTION;
	}

	static public class Request extends JsonRequest {

		public Request() {
			this.module = NotificationModule.MODULE;
			this.command = COMMAND;
		}

		@JsonProperty
		public int communityId = 0;

		@JsonProperty
		public int notificationId = 0;
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
