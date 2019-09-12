package tcg.komkit.server.json;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

public class JsonBroadcast {

	@JsonProperty
	public int id = 0;

	@JsonProperty
	public String message = null;

	@JsonProperty
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
	public Date expiryDate = null;

	@JsonProperty
	public EBroadcastType type = EBroadcastType.NOTIFICATION;
	
	@JsonProperty
	public int userId = 0;

	@JsonProperty
	public int communityId = 0;

	@JsonProperty
	public int structureId = 0;
	
}
