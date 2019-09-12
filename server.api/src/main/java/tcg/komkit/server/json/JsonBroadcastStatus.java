package tcg.komkit.server.json;

import com.fasterxml.jackson.annotation.JsonProperty;

public class JsonBroadcastStatus {

	@JsonProperty
	public int id = 0;
	
	@JsonProperty
	public int communityId = 0;

	@JsonProperty
	public int structureId = 0;
	
	@JsonProperty
	public int totalMessages = 0;

	@JsonProperty
	public int totalDelivered = 0;

	@JsonProperty
	public int totalFailures = 0;

	@JsonProperty
	public int totalPendings = 0;
	
	@JsonProperty
	public int totalAcknowledged = 0;

	@JsonProperty
	public int totalApproved = 0;

	@JsonProperty
	public int totalRejected = 0;
		
	public JsonBroadcastStatus() {
		//default ctor
	}
	
	public JsonBroadcastStatus(JsonBroadcast broadcast) {
		this.id = broadcast.id;
		this.communityId = broadcast.communityId;
		this.structureId = broadcast.structureId;
	}
}
