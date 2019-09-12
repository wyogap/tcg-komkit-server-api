package tcg.komkit.server.api;
import java.util.List;

import tcg.komkit.server.command.json.EStatusCode;
import tcg.komkit.server.json.ECommunityFrequency;
import tcg.komkit.server.json.JsonLevelMapping;
import tcg.komkit.server.json.JsonMember;
import tcg.komkit.server.json.JsonMemberInfo;
import tcg.komkit.server.json.JsonMemberList;
import tcg.komkit.server.json.JsonStructure;
import tcg.komkit.server.json.JsonStructureInfo;

import java.util.Map;

public interface IStructureApi extends IServerApi {

	/**
	 * Take over the structure (as a boss)
	 * @param referralCode - the referral code. the structure is retrieved from this referral code
	 * @param userFullName - user full jobClass for this community
	 * @param profile - user profile for this community
	 * @return - status of operation
	 */
	public abstract EStatusCode claimBoss(String userId, String referralCode, String userFullName, Map<String, String> profile);

	public abstract EStatusCode addAdministrator(String userId, int communityId,
														  int structureId,
														  String adminUserId);

	public abstract int create(String userId, int communityId, String structureName, int parentStructureId);

	public abstract EStatusCode delete(String userId, int communityId, int structureId);

	public abstract JsonMemberList getMembers(String userId, int communityId, int structureId, int pageNumber, int pageSize);

	public abstract List<JsonMemberInfo> getDirectMembers(String userId, int communityId, int structureId);

	public abstract List<JsonMemberInfo> getAdministrators(String userId, int communityId, int structureId);

	public abstract JsonStructure getInfo(String userId, int communityId, int structureId);

	public abstract String inviteAsBoss(String userId, int communityId, int structureId, String targetUserId);

	public abstract String inviteAsMember(String userId, int communityId, int structureId, String targetUserId);

	public abstract EStatusCode removeAdministrator(String userId, int communityId, int structureId, String adminUserId);

	public abstract EStatusCode update(String userId, int communityId, int structureId, String name,
									   ECommunityFrequency adsenseFrequency, int adsenseFrequencyValue);

}
