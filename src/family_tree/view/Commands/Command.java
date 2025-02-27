package familyTree.src.family_tree.view.Commands;
import familyTree.src.family_tree.view.ConsoleUI;
public abstract class Command {
    String description;
    ConsoleUI consoleUI;

    public Command(ConsoleUI consoleUI) {
        this.consoleUI = consoleUI;
    }

    public String getDescription() {
        return description;
    }

    public abstract void execute();
}

