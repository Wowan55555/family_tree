package view.commands;


import view.ConsoleUI;

public class FinishWork extends Command {

    public FinishWork(ConsoleUI consoleUI) {
        super("Выход из программы.", consoleUI);
    }

    @Override
    public void execute() {
        getConsoleUI().finishWork();
    }

}