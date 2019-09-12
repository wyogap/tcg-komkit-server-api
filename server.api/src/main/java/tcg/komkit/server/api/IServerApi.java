package tcg.komkit.server.api;

import tcg.komkit.server.command.json.EStatusCode;

public interface IServerApi {
    public EStatusCode getStatusCode();

    public String getStatusMessage();
}
