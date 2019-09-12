package tcg.komkit.server.json;

import com.fasterxml.jackson.annotation.JsonProperty;

public class JsonFile {
    @JsonProperty
    public String file;

    @JsonProperty
    public String path;

    @JsonProperty
    public String md5;

}
