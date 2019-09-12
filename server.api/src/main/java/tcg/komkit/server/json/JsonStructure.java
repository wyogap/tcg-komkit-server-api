package tcg.komkit.server.json;

import com.fasterxml.jackson.annotation.JsonProperty;

public class JsonStructure extends JsonStructureInfo {

	@JsonProperty
	public String bossUserId = null;

	@JsonProperty
	public ECommunityFrequency adsenseFrequency = ECommunityFrequency.HOURS;

	@JsonProperty
	public int adsenseFrequencyValue = 1;

	@JsonProperty
	public int memberCount = 0;
	
}
