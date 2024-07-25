package view;



public class SortById extends Command {

    public SortById(ConsoleUI consoleUI) {
        super(" упорядочить людей по ID.", consoleUI);
    }

    @Override
    public void execute() {
        getConsoleUI().sortById();
        getConsoleUI().getHumanListInfo();
    }

}