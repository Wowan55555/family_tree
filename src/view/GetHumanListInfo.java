package view;


import view.commands.Command;

public class GetHumanListInfo extends Command {

    public GetHumanListInfo(ConsoleUI consoleUI) {
        super("Хочешь? Предоставим  список людей.", consoleUI);
    }


    public void execute() {
        getConsoleUI().getHumanListInfo();
    }

}