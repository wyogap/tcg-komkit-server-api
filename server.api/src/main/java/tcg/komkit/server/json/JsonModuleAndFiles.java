package tcg.komkit.server.json;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class JsonModuleAndFiles {
    @JsonProperty
    public JsonModule module;

    @JsonProperty
    public List<String> files = null;
}
