package tcg.komkit.server.command.json.content;

import com.fasterxml.jackson.annotation.JsonProperty;

import tcg.komkit.server.command.json.JsonCommand;
import tcg.komkit.server.command.json.JsonRequest;
import tcg.komkit.server.command.json.JsonResponse;
import tcg.komkit.server.json.EContentType;

public abstract class PublishCommand extends JsonCommand {
	static private final String DESCRIPTION = "Publish a content item.";
	static private final String COMMAND = "publish";

	public PublishCommand() {
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
		public String categoryName = null;	//optional

		@JsonProperty
		public String title = null;

		@JsonProperty
		public String fileName;

		@JsonProperty
		public EContentType type = EContentType.FILE;
	}

	static public class Response extends JsonResponse {
		@JsonProperty
		public int itemId;
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
