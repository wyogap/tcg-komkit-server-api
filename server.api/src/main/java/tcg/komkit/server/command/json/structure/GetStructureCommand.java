package tcg.komkit.server.command.json.structure;

import com.fasterxml.jackson.annotation.JsonProperty;
import tcg.komkit.server.command.json.JsonCommand;
import tcg.komkit.server.command.json.JsonRequest;
import tcg.komkit.server.command.json.JsonResponse;
import tcg.komkit.server.json.JsonStructure;

public abstract class GetStructureCommand extends JsonCommand {
	static private final String DESCRIPTION = "Get detail info of a structure.";
	static private final String COMMAND = "info";

	public GetStructureCommand() {
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

		@JsonProperty
		public int structureId = 0;
	}

	static public class Response extends JsonResponse {

		@JsonProperty
		public JsonStructure structure = null;
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
