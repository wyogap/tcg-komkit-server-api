package tcg.komkit.server.api;

import java.util.List;

import tcg.komkit.server.command.json.EStatusCode;
import tcg.komkit.server.json.JsonContentItem;
import tcg.komkit.server.json.JsonStoreItemList;

public interface IStoreApi extends IServerApi {

    public abstract JsonStoreItemList getItems(String userId, int communityId, String category);

    public abstract int add(String userId, int communityId, String category,
                                String title, String code, String description,
                                double price, int stockCount,
                                List<String> imagePaths);

    public abstract EStatusCode update(String userId, int communityId, int itemId, String category,
                            String title, String code, String description,
                            double price, int stockCount,
                            List<String> imagePaths);

    public abstract EStatusCode deleteImage(String userId, int communityId, int itemId, String imageFileName);

    public abstract EStatusCode remove(String userId, int communityId, int itemId);

}
