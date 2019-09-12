package tcg.komkit.server.api;

import java.util.List;
import java.util.Map;

import tcg.komkit.server.command.json.EStatusCode;
import tcg.komkit.server.json.ECommunityFrequency;
import tcg.komkit.server.json.EReferralType;
import tcg.komkit.server.json.JsonCommunity;
import tcg.komkit.server.json.JsonLevelMapping;
import tcg.komkit.server.json.JsonMember;
import tcg.komkit.server.json.JsonMemberField;
import tcg.komkit.server.json.JsonMemberInfo;
import tcg.komkit.server.json.JsonMemberList;
import tcg.komkit.server.json.JsonModuleInfo;
import tcg.komkit.server.json.JsonRankMapping;
import tcg.komkit.server.json.JsonReferralCode;
import tcg.komkit.server.json.JsonUserField;

public interface ICommunityApi extends IServerApi {

	/**
	 * Get detail information about a referral code
	 * @param referralCode - referral code
	 * @return - detail info on the referral code
	 */
	public abstract JsonReferralCode getReferralCode (String userId, int communityId, String referralCode);

	/**
	 * Join a community using a referral code
	 * @param referralCode - the referral code. the community is retrieved from this referral code
	 * @param userFullName - user full jobClass for this community
	 * @param profile - user profile for this community
	 * @return - status of operation
	 */
	public abstract EStatusCode join(String userId, int communityId, String referralCode, String userFullName, Map<String, String> profile, String avatarPath);

	/**
	 * Get user field requirement (member profile) for this community
	 * @param communityId - community id
	 * @return - list of fields (mandatory and optional) for each user in this community
	 */
	public abstract List<JsonUserField> getUserFields(String userId, int communityId);

	/**
	 * Quit from a community
	 * @param communityId
	 * @return - status of operation
	 */
	public abstract EStatusCode quit(String userId, int communityId);

	public abstract EStatusCode addAdministrator(String userId, int communityId, String adminUserId);

	public abstract String generateReferral(String userId, int communityId, int structureId,
											String targetUserId, EReferralType type);

	public abstract List<JsonMemberInfo> getAdministrators(String userId, int communityId);

	public abstract JsonCommunity getInfo(String userId, int communityId);

	/**
	 * Get user info of a user. Must be in the same community.
	 * 
	 * Possible Failure Code: - Invalid username. Must register/join first. -
	 * Invalid community id - Invalid target username. Must be in the community
	 * 
	 * @param userId
	 * @param communityId
	 * @param targetUserId
	 * @return
	 */
	public abstract JsonMemberInfo getMemberInfo(String userId, int communityId, String targetUserId);

	/**
	 * Get user info of a user. Must be in the same community.
	 *
	 * Possible Failure Code: - Invalid username. Must register/join first. -
	 * Invalid community id - Invalid target username. Must be in the community
	 *
	 * @param userId
	 * @param communityId
	 * @param targetUserId
	 * @return
	 */
	public abstract JsonMember getMember(String userId, int communityId, String targetUserId);

	/**
	 * Get user profile. Must be in the same community
	 * 
	 * Possible Failure Code: - Invalid username. Must register/join first. -
	 * Invalid community id - Invalid target username. Must be in the community
	 * 
	 * @param userId
	 * @param communityId
	 * @param targetUserId
	 * @return
	 */
	public abstract List<JsonMemberField> getMemberProfile(String userId, int communityId, String targetUserId);

	/**
	 * Get list of members for this community, page by page. If PageNumber=0 and
	 * PageSize=-1, all members are retrieved at once.
	 * 
	 * @param userId
	 * @param communityId
	 * @param pageNumber
	 * @param pageSize
	 * @param userIds
	 * @return - list of members
	 */
	public abstract JsonMemberList getMembers(String userId, int communityId, int pageNumber, int pageSize,
											  List<String> userIds);

	//public abstract int getTotalMemberCount(int communityId);

	public abstract EStatusCode removeAdministrator(String userId, int communityId, String adminUserId);

	public abstract String requestReferral(String userId, int communityId, String verifierUserId, String message);

	public abstract EStatusCode resetMemberProfile(String userId, int communityId, String targetUserId);

	public abstract JsonMemberList searchMembers(String userId, int communityId, int pageNumber, int pageSize,
												String searchString);

	//public abstract int getTotalSearchResult(int communityId, String searchString);

	public abstract EStatusCode update(String userId, int communityId, String name,
									   ECommunityFrequency adsenseFrequency, int adsenseFrequencyValue);

	public abstract EStatusCode updateMember(String userId, int communityId, String userFullName, Map<String, String> profile);

	public abstract EStatusCode validateMemberProfile(String userId, int communityId, String targetUserId, List<String> fieldNames);

	public abstract EStatusCode verifyReferral(String userId, int communityId, String referral);

	public abstract List<JsonModuleInfo> getDefaultModules(String userId, int communityId);

	public abstract String getConfiguration(String userId, int communityId, String key);

	public abstract Map<Integer, String> getRankMapping(String userId, int communityId);

	public abstract List<JsonLevelMapping> getStructureLevelMapping(String userId, int communityId);
}
