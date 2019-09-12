package tcg.komkit.server.json;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Detail information about a community. Only used by registered member to get updated information
 */
public class JsonCommunity extends JsonCommunityInfo {

	@JsonProperty
	public ECommunityFrequency adsenseFrequency = ECommunityFrequency.HOURS;

	@JsonProperty
	public int adsenseFrequencyValue = 1;
	
	@JsonProperty
	public boolean requirePassword = false;
	
	@JsonProperty
	public String owner = null;

	@JsonProperty
	public int structureId = 0;

	@JsonProperty
	public int memberCount = 0;

}
