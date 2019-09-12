package tcg.komkit.server.json;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.util.List;

public class JsonStoreItem {
    @JsonProperty
    public int id = 0;

    @JsonProperty
    public String title = null;

    @JsonProperty
    public String code;

    @JsonProperty
    public String description = null;

    @JsonProperty
    public double price = 0;

    @JsonProperty
    public int stockCount = 0;

    @JsonProperty
    public String category = null;

    @JsonProperty
    public Date publishedDate;

    @JsonProperty
    public Date stockCountDate;

    @JsonProperty
    public String url;

    @JsonProperty
    public List<String> images;     //Note: images will be sent as attachments
}
