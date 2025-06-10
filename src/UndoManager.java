import java.util.ArrayList;

public class UndoManager {
    private static UndoManager instance;
    private ArrayList<String> commands;

    private UndoManager() {
        commands = new ArrayList<>();
    }

    public static UndoManager getInstance() {
        if (instance == null) {
            instance = new UndoManager();
        }
        return instance;
    }

    public void addCommand(String command) {
        commands.add(command);
    }

    public void removeLastCommand() {
        if (!commands.isEmpty()) {
            commands.remove(commands.size() - 1);
            System.out.println("Last command removed.");
        } else {
            System.out.println("No commands to remove.");
        }
    }

    public void listCommands() {
        if (commands.isEmpty()) {
            System.out.println("No commands saved.");
        } else {
            System.out.println("Command history:");
            for (String cmd : commands) {
                System.out.println("- " + cmd);
            }
        }
    }
}