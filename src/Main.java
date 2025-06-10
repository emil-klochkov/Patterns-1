import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UndoManager undoManager = UndoManager.getInstance();
        boolean running = true;

        while (running) {
            System.out.println("\nOptions:");
            System.out.println("1. Add command");
            System.out.println("2. Remove last command");
            System.out.println("3. View command history");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            String option = scanner.nextLine();

            switch (option) {
                case "1":
                    System.out.print("Enter command: ");
                    String command = scanner.nextLine();
                    undoManager.addCommand(command);
                    break;
                case "2":
                    undoManager.removeLastCommand();
                    break;
                case "3":
                    undoManager.listCommands();
                    break;
                case "4":
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        }

        scanner.close();
    }
}