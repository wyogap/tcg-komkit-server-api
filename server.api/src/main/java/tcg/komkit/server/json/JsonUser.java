package tcg.komkit.server.json;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class JsonUser {

	@JsonProperty
	public String userId = "";

	@JsonProperty
	public String name = "";

	@JsonProperty
	public Boolean requirePassword = false;

	@JsonProperty
	public int selectedCommunityId = 0;
	
	@JsonProperty
	public boolean isQuarantined = false;

//	@JsonIgnore
//	public boolean password = false;
	
	
}
