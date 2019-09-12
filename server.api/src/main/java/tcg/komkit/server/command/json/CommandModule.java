package tcg.komkit.server.command.json;

import java.util.HashMap;
import java.util.Map;

public class CommandModule implements ICommandModule {

    protected final Map<String, IJsonCommand> commands = new HashMap<String, IJsonCommand>();
    protected String description = "";
    protected String moduleName = null;

    @Override
    public String module() {
        return moduleName;
    }

    @Override
    public String description() {
        return description;
    }

    @Override
    public IJsonCommand getCommand(String name) {
        return commands.get(name);
    }

    protected void addCommand(String name, IJsonCommand command) {
        commands.put(name, command);
    }

    public final Map<String, IJsonCommand> getCommands() { return commands; }
}
