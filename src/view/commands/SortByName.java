package view.commands;


import view.ConsoleUI;

public class SortByName extends Command {

    public SortByName(ConsoleUI consoleUI) {
        super("Упорядочить людей по имени.", consoleUI);
    }


    public void execute() {
        getConsoleUI().sortByName();
        getConsoleUI().getHumanListInfo();
    }

}