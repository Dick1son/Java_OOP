package HW_2;

public class Tiger extends WildAnimal {

    protected Tiger(int height, int weight, String eye_color, String habitat, String date_of_location) {
        super(height, weight, eye_color, habitat, date_of_location);
    }

    @Override
    public String say() {
        return "Roar!";
    }

    @Override
    public String who() {
        return "Тигр";
    }

    @Override
    public String getInfo() {
        return String.format("%s; %s", who(), super.getInfo());
    }
}
