package tcg.komkit.server.json;

import com.fasterxml.jackson.annotation.JsonProperty;

public class JsonUserField {

	@JsonProperty
	public int id;

	@JsonProperty
	public int communityId = 0;

	@JsonProperty
	public String name;

	@JsonProperty
	public EUserFieldType type;

	@JsonProperty
	public int orderNo;
	
	@JsonProperty
	public Boolean isMandatory = false;

	@JsonProperty
	public String label = "";

	@JsonProperty
	public String hint = "";

	@JsonProperty
	public String description = "";
	
	@JsonProperty
	public int numberMin = Integer.MIN_VALUE;

	@JsonProperty
	public int numberMax = Integer.MAX_VALUE;

	@JsonProperty
	public int stringMaxLength = 1000;

	@JsonProperty
	public String dateFormat = "YYYY-MM-DD";
	
	@JsonProperty
	public String regexValidationRule = null;

	@JsonProperty
	public String optionValues = null;

}
