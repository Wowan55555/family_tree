package view;

public class SortByBirthDate extends Command {

    public SortByBirthDate(ConsoleUI consoleUI) {
        super("Отсортировать людей по возрасту.", consoleUI);
    }

    @Override
    public void execute() {
        getConsoleUI().sortByBirthDate();
        getConsoleUI().getHumanListInfo();
    }

}