package HW_1;

public class Childrens_products extends Product {
    private int minAge;
    private String hypoallergenic;
    
    protected Childrens_products(String name, int cost, int quantity, String measure, int minAge, String hypoallergenic) {
        super(name, cost, quantity, measure);
        this.minAge = minAge;
        this.hypoallergenic = hypoallergenic;
    }

    public int getMinAge(){
        return this.minAge;
    }

    public String getHypoallergenic(){
        return this.hypoallergenic;
    }
}
