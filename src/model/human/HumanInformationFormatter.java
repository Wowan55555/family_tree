package model.human;

public class HumanInformationFormatter {
    private final Human human;

    public HumanInformationFormatter(Human human) {
        this.human = human;
    }

    public String format() {
        String sb = "id: " + human.getId() +
                ", имя: " + human.getName() +
                ", пол: " + human.getGender() +
                ", возраст: " + human.getAge() +
                ", " + getSpouseInfo() +
                ", " + getMotherInfo() +
                ", " + getFatherInfo() +
                ", " + getChildrenInfo();
        return sb;
    }

    private String getSpouseInfo() {
        return "супруг(а): " + (human.getSpouse() != null ? human.getSpouse().getName() : "нет");
    }

    private String getFatherInfo() {
        return "отец: " + (human.getFather() != null ? human.getFather().getName() : "неизвестен");
    }

    private String getMotherInfo() {
        return "мать: " + (human.getMother() != null ? human.getMother().getName() : "неизвестна");
    }

    private String getChildrenInfo() {
        StringBuilder res = new StringBuilder("дети: ");
        if (!human.getChildren().isEmpty()) {
            res.append(human.getChildren().get(0).getName());
            for (int i = 1; i < human.getChildren().size(); i++) {
                res.append(", ").append(human.getChildren().get(i).getName());
            }
        } else {
            res.append("отсутствуют");
        }
        return res.toString();
    }
}