package tcg.komkit.server.json;

import com.fasterxml.jackson.annotation.JsonProperty;

public class JsonModuleDependency extends JsonFile {
    @JsonProperty
    public String moduleId;

    @JsonProperty
    public String url;
}
