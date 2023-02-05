package HW_2;

public class Hen extends Bird {

    protected Hen(int height, int weight, String eye_color, int flying_height) {
        super(height, weight, eye_color, flying_height);
    }

    @Override
    public String say() {
        return "Cluck - cluck!";
    }

    @Override
    public String who() {
        return "Курица";
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
