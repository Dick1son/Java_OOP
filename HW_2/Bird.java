package HW_2;

public abstract class Bird extends Animal {
    private final int flying_height;

    protected Bird(int height, int weight, String eye_color, int flying_height) {
        super(height, weight, eye_color);
        this.flying_height = flying_height;
    }

    public int getFlyingHeight(){
        return this.flying_height;
    }

    public abstract void fly();
}
