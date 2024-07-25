
//метод printAnswer не описан на стороне view.
// Нужно создать отдельный пакет под команды.
// В 18 строчке Сервис не должно быть приведения типа.
// Других замечаний нет


import view.ConsoleUI;
import view.View;

public class Main {
    public static void main(String[] args) {
        View view;
        view = new ConsoleUI();
        view.startWork();



    }
}


