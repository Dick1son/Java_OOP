package HW_1;

public class Hygiene_items extends Product {
    private int size;

    protected Hygiene_items(String name, int cost, int quantity, String measure, int size) {
        super(name, cost, quantity, measure);
        this.size = size;
    }

    public int getSize(){
        return this.size;
    }
}
