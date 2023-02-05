package HW_2;

public class Wolf extends WildAnimal {
    private String leader;

    protected Wolf(int height, int weight, String eye_color, String habitat, String date_of_location, String leader) {
        super(height, weight, eye_color, habitat, date_of_location);
        this.leader = leader;
    }

    @Override
    public String say() {
        return "Woof woooooo!";
    }

    @Override
    public String who() {
        return "Волк";
    }
    
    @Override
    public String getInfo() {
        return String.format("%s; %s Вожак стаи: %s;", who(), super.getInfo(), this.leader);
    }
    
}
