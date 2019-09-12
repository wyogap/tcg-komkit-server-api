package tcg.komkit.server.json;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

public class JsonReferralCode {
	static public int DEFAULT_EXPIRY_MINUTES = 15;

//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Column(jobClass = "id", unique = true, nullable = false)
//	@JsonProperty
//	public int Id = 0;

	@JsonProperty
	public String code = null;
	
	@JsonProperty
	public int communityId = 0;

	@JsonProperty
	public Boolean communityRequirePassword = false;

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
	public EReferralType type = EReferralType.MEMBER;
	
	@JsonProperty
	public String creator = null;
	
	@JsonProperty
	public String userId = null;
	
	@JsonProperty
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
	public Date expiryDate = null;
	
	@JsonProperty
	public boolean isVerified = false;

	@JsonProperty
	public String verifier = null;

	@JsonProperty
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
	public Date verifiedDate = null;
	
}
