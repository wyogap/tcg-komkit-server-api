package tcg.komkit.server.command.json.content;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

import tcg.komkit.server.command.json.JsonCommand;
import tcg.komkit.server.command.json.JsonRequest;
import tcg.komkit.server.command.json.JsonResponse;
import tcg.komkit.server.json.JsonContentItem;

public abstract class GetItemsCommand extends JsonCommand {
	static private final String DESCRIPTION = "Get list of content items.";
	static private final String COMMAND = "items";

	public GetItemsCommand() {
		this.moduleName = ContentModule.MODULE;
		this.commandName = COMMAND;
		this.description = DESCRIPTION;
	}

	static public class Request extends JsonRequest {

		public Request() {
			this.module = ContentModule.MODULE;
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
		public List<JsonContentItem> items = null;
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
