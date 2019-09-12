package tcg.komkit.server.json;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

public class JsonNotification {

	@JsonProperty
	public int id = 0;

	@JsonProperty
	public int communityId;

	@JsonProperty
	public String userId;

	@JsonProperty
	public String destUserId;
	
	@JsonProperty
	public EBroadcastType type = EBroadcastType.APPROVAL;

	@JsonProperty
	public String message;	

	@JsonProperty
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
	public Date expiryDate;
	
	@JsonProperty
	public int broadcastId;

	@JsonProperty
	public int workflowId;

	@JsonProperty
	public int workflowInstanceId;

	@JsonProperty
	public int workflowStepId;

	@JsonProperty
	public String workflowClass;
	
	@JsonProperty
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
	public Date deliveredDate = null;

	@JsonProperty
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
	public Date failureDate = null;

	@JsonProperty
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
	public Date acknowledgedDate = null;

	@JsonProperty
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
	public Date approvedDate = null;

	@JsonProperty
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
	public Date rejectedDate = null;
	
}
