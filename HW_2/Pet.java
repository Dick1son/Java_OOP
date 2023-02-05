package HW_2;

public abstract class Pet extends Animal {
    private String nickname;
    private String breed;
    private String vaccinations;
    private String coat_color;
    private String birthday;

    protected Pet(int height, int weight, String eye_color, String nickname, String breed, String vaccinations, String coat_color, String birthday) {
        super(height, weight, eye_color);
        this.nickname = nickname;
        this.breed = breed;
        this.vaccinations = vaccinations;
        this.coat_color = coat_color;
        this.birthday = birthday;
    }

    protected abstract void showAffection();

    @Override
    public String getInfo() {
        return String.format("%s Кличка: %s; Порода: %s; Наличие прививок: %s; Цвет шерсти: %s; Дата рождения: %s;", super.getInfo(), this.nickname, this.breed, this.vaccinations, this.coat_color, this.birthday);
    }

}
