package tcg.komkit.server.json;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class JsonMemberInfo {
    @JsonIgnore
    public int id = 0;

    @JsonProperty
    public int communityId = 0;

    @JsonProperty
    public String userId = "";

    @JsonProperty
    public String name = "";

    @JsonProperty
    public int rank = 0;

    @JsonProperty
    public String rankTitle = "";

    @JsonProperty
    public int structureId = 0;

    @JsonProperty
    public int structureLevel = 0;

    @JsonProperty
    public String structureName = "";

    @JsonProperty
    public boolean isBoss = false;

    @JsonProperty
    public boolean isBanned = false;

    @JsonProperty
    public boolean isValidated = false;

    @JsonProperty
    public boolean isQuarantined = false;

    @JsonProperty
    public String imageFile = null;

    @JsonProperty
    public String imagePath = null;

}
