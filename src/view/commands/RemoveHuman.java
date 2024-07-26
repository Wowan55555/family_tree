package view.commands;


import view.ConsoleUI;

public class RemoveHuman extends Command {
    public RemoveHuman(ConsoleUI consoleUI) {
        super("Устранить человека.", consoleUI);
    }

    @Override
    public void execute() {
        getConsoleUI().removeHuman();
    }
}