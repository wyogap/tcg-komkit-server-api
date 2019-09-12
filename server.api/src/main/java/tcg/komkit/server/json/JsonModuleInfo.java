package tcg.komkit.server.json;

import com.fasterxml.jackson.annotation.JsonProperty;

public class JsonModuleInfo extends JsonFile {
    @JsonProperty
    public String id;

    @JsonProperty
    public String description;

    @JsonProperty
    public String author;

    @JsonProperty
    public String url;

    @JsonProperty
    public String version;

    @JsonProperty
    public String bootstrapName;
}
