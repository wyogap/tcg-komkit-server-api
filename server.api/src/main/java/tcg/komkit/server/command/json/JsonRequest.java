package tcg.komkit.server.command.json;

import com.fasterxml.jackson.annotation.JsonProperty;

public class JsonRequest {

    @JsonProperty
    public String requestId = null;

    @JsonProperty
    public String module = null;

    @JsonProperty
    public String command = null;

}
