package tcg.komkit.server.json;

import com.fasterxml.jackson.annotation.JsonProperty;

public class JsonModuleJob {
    @JsonProperty
    public String moduleId;

    @JsonProperty
    public String id;

    @JsonProperty
    public String className;

    @JsonProperty
    public EJobType type;

    @JsonProperty
    public int interval;
}
