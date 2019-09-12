package tcg.komkit.server.command.json;

import java.util.List;

public interface IJsonCommand {

	abstract public String handleJsonCommand(String userId, String command, List<JsonAttachment> attachments);
	
	abstract public String help();

	abstract public String getRequestSchema();

	abstract public String getResponseSchema();

	abstract public String module();

	abstract public String command();

	abstract public String description();
}
