package tcg.komkit.server.command.json;

import com.fasterxml.jackson.annotation.JsonProperty;

public class JsonResponse {
	
	@JsonProperty
	public String requestId = null;

	@JsonProperty
	public EStatusCode status = EStatusCode.NOERROR;

	@JsonProperty
	public String statusMessage = null;

}
