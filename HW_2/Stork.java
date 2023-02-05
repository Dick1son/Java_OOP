package HW_2;

public class Stork extends Bird {

    protected Stork(int height, int weight, String eye_color, int flying_height) {
        super(height, weight, eye_color, flying_height);
    }

    @Override
    public String say() {
        return "Honk - honk!";
    }

    @Override
    public String who() {
        return "Аист";
    }

    @Override
    public void fly() {
        System.out.printf("I'm flying at %d meters\n", super.getFlyingHeight());
    }

    @Override
    public String getInfo() {
        return String.format("%s; %s Высота полета: %d m;", who(), super.getInfo(), super.getFlyingHeight());
    }

}
