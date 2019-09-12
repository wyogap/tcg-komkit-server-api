package tcg.komkit.server.api;

import java.util.List;

import tcg.komkit.server.command.json.EStatusCode;
import tcg.komkit.server.json.JsonCommunity;
import tcg.komkit.server.json.JsonCommunityInfo;
import tcg.komkit.server.json.JsonCommunityList;
import tcg.komkit.server.json.JsonMemberList;
import tcg.komkit.server.json.JsonMembership;
import tcg.komkit.server.json.JsonModule;
import tcg.komkit.server.json.JsonModuleAndFiles;
import tcg.komkit.server.json.JsonModuleInfo;
import tcg.komkit.server.json.JsonModuleList;
import tcg.komkit.server.json.JsonStructureInfo;
import tcg.komkit.server.json.JsonUser;

public interface ISettingApi extends IServerApi {

	/**
	 * Get list of modules
	 *
	 * @return - list of modules
	 */
	public abstract JsonModuleList searchModules(int pageNumber, int pageSize,
												 String searchString);

	/**
	 * Get a module and its file + dependencies as attachment
	 *
	 * @return - module configuration and files
	 */
	public abstract JsonModule getModuleAndFiles(String moduleId);

	/**
	 * Get list of communities
	 *
	 * @return - list of communities
	 */
	public abstract JsonCommunityList searchCommunities(int pageNumber, int pageSize,
														 String searchString);

	/**
	 * Get a community info
	 *
	 * @return - community info
	 */
	public abstract JsonCommunityInfo getCommunityInfo(int communityId);

	public abstract List<JsonStructureInfo> getStructureHierarchies(int communityId, int structureId);

	/**
	 * Ping the server
	 *
	 * @return
	 */
	public abstract EStatusCode ping();

}
