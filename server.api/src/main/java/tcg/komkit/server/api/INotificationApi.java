package tcg.komkit.server.api;

import tcg.komkit.server.command.json.EStatusCode;

public interface INotificationApi extends IServerApi {

	/**
	 * Acknowledge a notification message
	 *
	 * @param communityId
	 * @param notificationId
	 * @return
	 */
	public abstract EStatusCode acknowledge(String userId, int communityId, int notificationId);

	/**
	 * Approve a notification message
	 *
	 * @param communityId
	 * @param notificationId
	 * @return 1 if successful, ErrorCode (<0) if failures
	 */
	public abstract EStatusCode approve(String userId, int communityId, int notificationId);

	/**
	 * Reject a notification message
	 *
	 * @param communityId
	 * @param notificationId
	 * @return 1 if successful, ErrorCode (<0) if failures
	 */
	public abstract EStatusCode reject(String userId, int communityId, int notificationId);
}
