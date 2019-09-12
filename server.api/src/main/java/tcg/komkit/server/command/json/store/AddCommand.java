package tcg.komkit.server.command.json.store;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

import tcg.komkit.server.command.json.JsonCommand;
import tcg.komkit.server.command.json.JsonRequest;
import tcg.komkit.server.command.json.JsonResponse;

public abstract class AddCommand extends JsonCommand {
	static private final String DESCRIPTION = "Add a new store item.";
	static private final String COMMAND = "add";

	public AddCommand() {
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
		public String categoryName = null;	//optional

		@JsonProperty
		public String title = null;

		@JsonProperty
		public String description = null;

		@JsonProperty
		public String code = null;

		@JsonProperty
		public int stockCount = 0;

		@JsonProperty
		public double price = 0;

		@JsonProperty
		public List<String> images = null;		//images will be sent as attachment
	}

	static public class Response extends JsonResponse {
		@JsonProperty
		public int itemId = 0;
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
