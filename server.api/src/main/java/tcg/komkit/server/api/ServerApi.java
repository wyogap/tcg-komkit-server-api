package tcg.komkit.server.api;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import tcg.komkit.server.api.IServerApi;
import tcg.komkit.server.command.json.EStatusCode;

public class ServerApi implements IServerApi {
    protected EStatusCode statusCode = EStatusCode.NOERROR;
    protected String statusMessage = null;

    protected final ObjectMapper mapper = new ObjectMapper();

    public ServerApi() {
        mapper.setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.ANY); // disable autodetect
        mapper.enable(SerializationFeature.WRITE_NULL_MAP_VALUES);
        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        mapper.disable(JsonGenerator.Feature.AUTO_CLOSE_TARGET);
        mapper.configure(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, true);
    }

    @Override
    public EStatusCode getStatusCode() {
        return statusCode;
    }

    @Override
    public String getStatusMessage() {
        return statusMessage;
    }
}
