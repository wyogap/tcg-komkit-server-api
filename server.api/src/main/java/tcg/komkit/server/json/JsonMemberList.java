package tcg.komkit.server.json;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class JsonMemberList {
    @JsonProperty
    public int totalCount = 0;

    @JsonProperty
    public int pageNumber = 0;

    @JsonProperty
    public int pageSize = 0;

    @JsonProperty
    public List<JsonMemberInfo> members;
}
