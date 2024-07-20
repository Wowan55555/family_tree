package view;

public class SortByName extends Command {

    public SortByName(ConsoleUI consoleUI) {
        super("Отсортировать людей по имени.", consoleUI);
    }


    public void execute() {
        getConsoleUI().sortByName();
        getConsoleUI().getHumanListInfo();
    }

}