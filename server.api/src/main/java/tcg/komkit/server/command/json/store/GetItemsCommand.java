package tcg.komkit.server.command.json.store;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

import tcg.komkit.server.command.json.JsonCommand;
import tcg.komkit.server.command.json.JsonRequest;
import tcg.komkit.server.command.json.JsonResponse;
import tcg.komkit.server.json.JsonStoreItem;

public abstract class GetItemsCommand extends JsonCommand {
	static private final String DESCRIPTION = "Get list of items.";
	static private final String COMMAND = "items";

	public GetItemsCommand() {
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
		public int pageNumber = 0;

		@JsonProperty
		public int pageSize = 0;

		@JsonProperty
		public String categoryName = null;	//optional

	}

	static public class Response extends JsonResponse {
		@JsonProperty
		public int totalItems = 0;

		@JsonProperty
		public int pageNumber = 0;

		@JsonProperty
		public int pageSize = 0;

		@JsonProperty
		public List<JsonStoreItem> items = null;
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
