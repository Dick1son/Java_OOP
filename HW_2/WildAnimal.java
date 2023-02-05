package HW_2;

public abstract class WildAnimal extends Animal {
    private String habitat;
    private String date_of_location;

    protected WildAnimal(int height, int weight, String eye_color, String habitat, String date_of_location) {
        super(height, weight, eye_color);
        this.habitat = habitat;
        this.date_of_location = date_of_location;
    }
    
    @Override
    public String getInfo() {
        return String.format("%s Место обитания: %s; Дата нахождения: %s;", super.getInfo(), this.habitat, this.date_of_location);
    }
}
