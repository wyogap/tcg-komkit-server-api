package tcg.komkit.server.command.json;

import java.util.List;
import java.util.Map;

public interface ICommandModule {

	abstract public String module();

	abstract public String description();

	abstract public IJsonCommand getCommand(String name);

	abstract public Map<String, IJsonCommand> getCommands();

}
