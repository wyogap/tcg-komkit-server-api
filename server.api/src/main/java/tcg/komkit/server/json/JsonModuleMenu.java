package tcg.komkit.server.json;

import com.fasterxml.jackson.annotation.JsonProperty;

public class JsonModuleMenu {
    @JsonProperty
    public String moduleId;

    @JsonProperty
    public String id;

    @JsonProperty
    public String title;

    @JsonProperty
    public String name;
}
