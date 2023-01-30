package HW_1;

public class Food_products extends Product {
    private String date;

    protected Food_products(String name, int cost, int quantity, String measure, String date){
        super(name, cost, quantity, measure);
        this.date = date;
    }

    public String getDate(){
        return this.date;
    }
}
