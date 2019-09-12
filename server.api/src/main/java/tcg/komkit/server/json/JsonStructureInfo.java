package tcg.komkit.server.json;

import com.fasterxml.jackson.annotation.JsonProperty;

public class JsonStructureInfo {

	@JsonProperty
	public int id;

	@JsonProperty
	public int level = 1;

	@JsonProperty
	public String levelTitle;

	@JsonProperty
	public String levelBossTitle;

	@JsonProperty
	public String name = null;
	
	@JsonProperty
	public int communityId = 0;

	@JsonProperty
	public int parentId = 0;

}
