package tcg.komkit.server.api;

import java.util.List;

import tcg.komkit.server.command.json.EStatusCode;
import tcg.komkit.server.json.EContentType;
import tcg.komkit.server.json.JsonContentItem;
import tcg.komkit.server.json.JsonContentItemList;

public interface IContentApi extends IServerApi {

    public abstract JsonContentItemList getItems(String userId, int communityId, String category);

    public abstract int publish(String userId, int communityId, String category,
                                String title, String fileName, EContentType type,
                                String filePath);

    public abstract EStatusCode remove(String userId, int communityId, int itemId);

}
