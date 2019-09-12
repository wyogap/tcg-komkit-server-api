package tcg.komkit.server.json;

import com.fasterxml.jackson.annotation.JsonProperty;

public class JsonModule extends JsonModuleInfo {
    @JsonProperty
    public JsonModuleDependency[] deps = null;

    @JsonProperty
    public JsonModuleFragment[] fragments = null;

    @JsonProperty
    public JsonModuleMenu[] menus = null;

    @JsonProperty
    public JsonModuleJob[] jobs = null;
}
