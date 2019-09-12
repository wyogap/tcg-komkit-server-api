package tcg.komkit.server.command.json.structure;

import com.fasterxml.jackson.annotation.JsonProperty;

import tcg.komkit.server.command.json.JsonCommand;
import tcg.komkit.server.command.json.JsonRequest;
import tcg.komkit.server.command.json.JsonResponse;

public abstract class CreateCommand extends JsonCommand {
	static private final String DESCRIPTION = "Create a new structure";
	static private final String COMMAND = "create";

	public CreateCommand() {
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
		public String structureName = null;

		@JsonProperty
		public int parentStructureId = 0;		//optional. default is user's structure
	}

	static public class Response extends JsonResponse {

		@JsonProperty
		public int structureId = 0;
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
