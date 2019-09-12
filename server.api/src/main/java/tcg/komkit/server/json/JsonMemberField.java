package tcg.komkit.server.json;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class JsonMemberField {

	@JsonIgnore
	public int id;

	@JsonIgnore
	public int communityId = 0;

	@JsonIgnore
	public String userId;

	@JsonProperty
	public String name;

	@JsonProperty
	public String value;
	
	@JsonProperty
	public Boolean isMandatory = false;

	@JsonProperty
	public Boolean isValidated = false;

	@JsonProperty
	public String validatedBy = null;
	
	@JsonProperty
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
	public Date validatedDate = null;

}
