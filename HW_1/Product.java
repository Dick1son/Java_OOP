package HW_1;

public class Product {
    private String name;
    private int cost;
    private int quantity;
    private String measure;

    protected Product(String name, int cost, int quantity, String measure){
        this.name = name;
        this.cost = cost;
        this.quantity = quantity;
        this.measure = measure;
    }

    public String getName(){
        return this.name;
    }

    public int getCost(){
        return this.cost;
    }

    public int getQuantity(){
        return this.quantity;
    }

    public String getMeasure(){
        return this.measure;
    }

    @Override
    public String toString(){
        return String.format("Название: %s; Цена: %d; Количество: %d; Единица измерения: %s;", this.name,this.cost,this.quantity,this.measure);
    }
}
