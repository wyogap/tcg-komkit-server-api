package tcg.komkit.server.json;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class JsonContentItemList {
    @JsonProperty
    public int totalCount = 0;

    @JsonProperty
    public int pageNumber = 0;

    @JsonProperty
    public int pageSize = 0;

    @JsonProperty
    public List<JsonContentItem> items;
}
