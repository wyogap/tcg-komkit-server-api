package tcg.komkit.server.api;

import java.util.List;

import tcg.komkit.server.json.JsonCommunity;
import tcg.komkit.server.json.JsonMembership;
import tcg.komkit.server.json.JsonUser;

public interface IUserApi extends IServerApi {

	/**
	 * Get list of communities the user is member of
	 *
	 * @return - list of communities
	 */
	public abstract List<JsonCommunity> getCommunities(String userId);

	/**
	 * Get list of membership info from all the communities the user is member of
	 *
	 * @return - list of membership
	 */
	public abstract List<JsonMembership> getMemberships(String userId);

	/**
	 * Get detail information about the current user
	 *
	 * @param userId
	 * @return - detail user info
	 */
	public abstract JsonUser getInfo(String userId);
}
