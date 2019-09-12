package tcg.komkit.server.json;

import com.fasterxml.jackson.annotation.JsonProperty;

public class JsonMembership {

	@JsonProperty
	public String userId = "";

	@JsonProperty
	public String name = "";

	@JsonProperty
	public int communityId = 0;

//	@JsonProperty
//	public int CommunityStructureId = 0;

	@JsonProperty
	public String communityName = null;

	@JsonProperty
	public String communityOwner = null;

	@JsonProperty
	public Boolean requirePassword = false;

	@JsonProperty
	public int userRank = 0;

	@JsonProperty
	public int userStructureId = 0;

	@JsonProperty
	public int userStructureName = 0;

	@JsonProperty
	public boolean isBoss = false;
	
}
