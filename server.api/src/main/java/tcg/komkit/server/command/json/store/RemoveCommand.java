package tcg.komkit.server.command.json.store;

import com.fasterxml.jackson.annotation.JsonProperty;

import tcg.komkit.server.command.json.JsonCommand;
import tcg.komkit.server.command.json.JsonRequest;
import tcg.komkit.server.command.json.JsonResponse;

public abstract class RemoveCommand extends JsonCommand {
	static private final String DESCRIPTION = "Remove a store item.";
	static private final String COMMAND = "remove";

	public RemoveCommand() {
		this.moduleName = StoreModule.MODULE;
		this.commandName = COMMAND;
		this.description = DESCRIPTION;
	}

	static public class Request extends JsonRequest {

		public Request() {
			this.module = StoreModule.MODULE;
			this.command = COMMAND;
		}

		@JsonProperty
		public int communityId = 0;

		@JsonProperty
		public int itemId = 0;	

	}

	static public class Response extends JsonResponse {}

	@Override
	public Class<Request> getRequestClass() {
		return Request.class;
	}

	@Override
	public Class<Response> getResponseClass() {
		return Response.class;
	}
}
