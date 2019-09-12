package tcg.komkit.server.json;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class JsonMember extends JsonMemberInfo{

	@JsonProperty
	public boolean isCommunityAdmin = false;

	@JsonProperty
	public int level1StructureId = 0;

	@JsonProperty
	public boolean level1StructureAdmin = false;

	@JsonProperty
	public int level2StructureId = 0;

	@JsonProperty
	public boolean level2StructureAdmin = false;

	@JsonProperty
	public int level3StructureId = 0;

	@JsonProperty
	public boolean level3StructureAdmin = false;

	@JsonProperty
	public int level4StructureId = 0;

	@JsonProperty
	public boolean level4StructureAdmin = false;

	@JsonProperty
	public int level5StructureId = 0;

	@JsonProperty
	public boolean level5StructureAdmin = false;

	@JsonProperty
	public int level6StructureId = 0;

	@JsonProperty
	public boolean level6StructureAdmin = false;

	@JsonProperty
	public int level7StructureId = 0;

	@JsonProperty
	public boolean level7StructureAdmin = false;

	@JsonProperty
	public int level8StructureId = 0;

	@JsonProperty
	public boolean level8StructureAdmin = false;

	@JsonProperty
	public int level9StructureId = 0;

	@JsonProperty
	public boolean level9StructureAdmin = false;

	@JsonProperty
	public int level10StructureId = 0;

	@JsonProperty
	public boolean level10StructureAdmin = false;

}
