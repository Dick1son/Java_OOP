package HW_2;

public abstract class Animal implements MakeSoundInterface {
    private int height;
    private int weight;
    private String eye_color;

    protected Animal(int height, int weight, String eye_color){
        this.height = height;
        this.weight = weight;
        this.eye_color = eye_color;
    }

    public abstract String who();

    @Override
    public String whoSay() {
        return this.who() + " говорит " + this.say(); 
    }
   
    public String getInfo() {
        return String.format("Рост: %d cm; Вес: %d kg; Цвет глаз: %s;", this.height, this.weight, this.eye_color);
    }
}
