package tcg.komkit.server.json;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class JsonContentItem {
    @JsonProperty
    public int id = 0;

    @JsonProperty
    public String title = null;

    @JsonProperty
    public String fileName;

    @JsonProperty
    public EContentType type = EContentType.FILE;

    @JsonProperty
    public String mimeType = null;

    @JsonProperty
    public String category = null;

    @JsonProperty
    public Date publishedDate;

    @JsonProperty
    public String url;
}
