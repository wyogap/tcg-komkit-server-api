package tcg.komkit.server.command.json;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.jsonschema.JsonSchema;

public abstract class JsonCommand implements IJsonCommand {
	public EStatusCode StatusCode = EStatusCode.NOERROR;
	public String ErrorMessage = "";

	protected String description = "";
	protected String moduleName = "";
	protected String commandName = "";

    protected final ObjectMapper mapper;
	
    public JsonCommand() {
        this.mapper = new ObjectMapper();
        mapper.setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.ANY); // disable autodetect
        mapper.enable(SerializationFeature.WRITE_NULL_MAP_VALUES);
        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        mapper.disable(JsonGenerator.Feature.AUTO_CLOSE_TARGET);
        mapper.configure(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, true);
    }

    public abstract String handleJsonCommand(String userId, String command, List<JsonAttachment> attachments);
	   
	public abstract Class getRequestClass();

	public abstract Class getResponseClass();

	public String getRequestSchema() {
		try {
			JsonSchema schema = mapper.generateJsonSchema(this.getRequestClass());
			return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(schema);
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public String getResponseSchema() {
		try {
			JsonSchema schema = mapper.generateJsonSchema(this.getResponseClass());
			return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(schema);
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public String module() {
		return moduleName;
	}

	public String command() {
		return commandName;
	}

	public String description() {
		return description;
	}

	public String help() { return description; }

}
