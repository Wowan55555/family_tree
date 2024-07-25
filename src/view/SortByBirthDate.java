package view;



public class SortByBirthDate extends Command {

    public SortByBirthDate(ConsoleUI consoleUI) {
        super("пройти отбор .... людей по возрасту.", consoleUI);
    }

    @Override
    public void execute() {
        getConsoleUI().sortByBirthDate();
        getConsoleUI().getHumanListInfo();
    }

}