package HW_2;

public class Cat extends Pet {
    private String wool;

    public Cat(int height, int weight, String eye_color, String nickname, String breed, String vaccinations,
            String coat_color, String birthday, String wool) {
        super(height, weight, eye_color, nickname, breed, vaccinations, coat_color, birthday);
        this.wool = wool;
    }

    @Override
    protected void showAffection() {
        System.out.println("Кошка довольна:)");
    }

    @Override
    public String getInfo() {
        return String.format("%s; %s Наличие шерсти: %s;", who(), super.getInfo(), this.wool);
    }

    @Override
    public String say() {
        return "Meow!";
    }

    @Override
    public String who() {
        return "Кошка";
    }
    
}
