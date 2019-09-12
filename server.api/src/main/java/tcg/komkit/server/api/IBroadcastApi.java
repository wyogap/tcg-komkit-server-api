package tcg.komkit.server.api;

import java.util.Date;
import java.util.List;

import tcg.komkit.server.command.json.EStatusCode;
import tcg.komkit.server.json.EBroadcastType;
import tcg.komkit.server.json.JsonBroadcast;
import tcg.komkit.server.json.JsonBroadcastStatus;

public interface IBroadcastApi extends IServerApi {

	/**
	 * Send a broadcast into a structure.
	 *
	 * @param communityId
	 * @param structureId
	 * @param message
	 * @param type
	 * @param expiryDate
	 * @return
	 */
	public abstract EStatusCode send(String userId, int communityId, int structureId, String message,
							EBroadcastType type, Date expiryDate) ;

	/**
	 * Send a broadcast into a structure.
	 *
	 * @param communityId
	 * @param structureId
	 * @param message
	 * @param type
	 * @param expiryDate
	 * @param acknowledgeString
	 * @param approveString
	 * @param rejectString
	 * @return
	 */
	public abstract EStatusCode send(String userId, int communityId, int structureId, String message,
							EBroadcastType type, Date expiryDate,
							String acknowledgeString, String approveString, String rejectString) ;
		
	/**
	 * Get broadcast info
	 *
	 * @param communityId
	 * @param broadcastId
	 * @return - broadcast detail info
	 */
	public abstract JsonBroadcast getInfo(String userId, int communityId, int broadcastId);

	/**
	 * Get broadcast status
	 *
	 * @param communityId
	 * @param broadcastId
	 * @return - broadcast status
	 */
	public abstract JsonBroadcastStatus getStatus(String userId, int communityId, int broadcastId);

	/**
	 * Get list of usernames of acknowledged broadcast
	 *
	 * On error, LastErrorCode and LastErrorMessage is set accordingly.
	 *
	 * @param communityId
	 * @param broadcastId
	 * @return List of usernames if successful, null if failures
	 */
	public abstract List<String> getAcknowledged(String userId, int communityId, int broadcastId);

	/**
	 * Get list of usernames of approved broadcast
	 *
	 * On error, LastErrorCode and LastErrorMessage is set accordingly.
	 *
	 * @param communityId
	 * @param broadcastId
	 * @return List of usernames if successful, null if failures
	 */
	public abstract List<String> getApproved(String userId, int communityId, int broadcastId);

	/**
	 * Get the list of usernames of broadcast failures
	 * 
	 * On error, LastErrorCode and LastErrorMessage is set accordingly.
	 *
	 * @param communityId
	 * @param broadcastId
	 * @return List of usernames if successful, null if failures
	 */
	public abstract List<String> getFailures(String userId, int communityId, int broadcastId);

	/**
	 * Get list of usernames of rejected broadcast
	 *
	 * On error, LastErrorCode and LastErrorMessage is set accordingly.
	 *
	 * @param communityId
	 * @param broadcastId
	 * @return List of usernames if successful, null if failures
	 */
	public abstract List<String> getRejected(String userId, int communityId, int broadcastId);
}
