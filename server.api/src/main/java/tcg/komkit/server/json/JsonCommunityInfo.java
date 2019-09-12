package tcg.komkit.server.json;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * General information about a community. Used mostly to inquiry about a community by non-member
 */
public class JsonCommunityInfo {
    @JsonProperty
    public int id = 0;

    @JsonProperty
    public String name = "";

    @JsonProperty
    public String description = "";

    @JsonProperty
    public String address = "";

    @JsonProperty
    public String ownerName = "";

    @JsonProperty
    public String serviceNumber = null;

    @JsonProperty
    public String serviceUrl = null;

    @JsonProperty
    public String imageFile = null;

    @JsonProperty
    public String imagePath = null;

    @JsonProperty
    public String textOwner = "Pemimpin";

    @JsonProperty
    public String textCommunity = "Komunitas";

    @JsonProperty
    public String textStructure = "Kelompok";

    @JsonProperty
    public String textBoss = "Boss";

    @JsonProperty
    public String textRank = "Pangkat";

    @JsonProperty
    public String textPosition = "Posisi";
}
