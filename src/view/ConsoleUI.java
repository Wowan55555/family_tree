package view;

import presenter.Presenter;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class ConsoleUI implements View {
    private MenuHandler menuHandler;
    private Presenter presenter = new Presenter(this);
    private InputHandler inputHandler;
    private boolean work;

    public ConsoleUI() {
        Scanner scanner = new Scanner(System.in);
        inputHandler = new InputHandler(scanner);
        menuHandler = new MenuHandler(this);
        work = true;
    }

    @Override
    public void startWork() {
        greetings();
        presenter.readTree();
        selectItemFromMenu();
    }

    @Override
    public void printAnswer(String answer) {

    }

    private void greetings() {
        System.out.println("Привет(КУ!!!) , рад видеть Вас в меню:\nВыбирайте нужный пункт");
    }

    private void selectItemFromMenu() {
        while (work) {
            System.out.println(menuHandler.getMenu());
            String choiceStr = inputHandler.getInput();
            if (inputHandler.isValidMenuChoice(choiceStr, menuHandler.size())) {
                int choice = Integer.parseInt(choiceStr);
                menuHandler.execute(choice);
            } else {
                System.out.println("Введено неверно\nНе спешите, еще раз введите номер из меню: от 1 до " + menuHandler.size());
            }
        }
    }

    public void finishWork() {
        work = false;
        System.out.println("Мы ждем Вас !!!");
        presenter.sortById();
        presenter.saveTree();
    }

    public void sortById() {
        presenter.sortById();
    }

    public void sortByBirthDate() {
        presenter.sortByBirthDate();
    }

    public void sortByName() {
        presenter.sortByName();
    }

    public void getHumanListInfo() {
        presenter.getHumanListInfo();
    }

    public void addHuman() {
        System.out.println("  Укажите пожалуйста имя человека:");
        String name = inputHandler.getInput();

        System.out.println("Будте добры  Укажите пол человека м/ж:");
        String genderStr = inputHandler.getGenderInput();

        System.out.println("Укажите дату рождения: ДД ММ Г:");
        LocalDate birthDate = inputHandler.getBirthDateInput();

        presenter.addHuman(name, genderStr, birthDate);
    }

    public void findByName() {
        System.out.println("Укажите имя человека: ");
        String name = inputHandler.getInput();
        printFoundHumans(name);
    }

    private void printFoundHumans(String name) {
        String foundHumans = presenter.findByName(name);
        if (foundHumans.isEmpty()) {
            System.out.println("Блин еще раз ... еще раз ");
        } else {
            System.out.println("Выведен список людей(найденных)");
            System.out.println(foundHumans);
        }
    }

    public void removeHuman() {
        System.out.println("Укажите имя человека :  И мы его быстро удалим!!!");
        String name = inputHandler.getInput();
        printFoundHumans(name);
        List<Integer> foundHumansId = presenter.foundHumansId(name);
        if (!foundHumansId.isEmpty()) {
            removeHumanById(name, foundHumansId);
        }
    }

    private void removeHumanById(String name, List<Integer> foundHumansId) {
        return;
    }
}
