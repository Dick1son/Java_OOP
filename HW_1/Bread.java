package HW_1;

public class Bread extends Food_products {
    private String flour;

    protected Bread(String name, int cost, int quantity, String measure, String date, String flour) {
        super(name, cost, quantity, measure, date);
        this.flour = flour;
    }

    @Override
    public String toString() {
        return String.format("Наименование: %s; Цена: %d; Количество: %d; Еденица измерения: %s; Срок годности: %s; Тип муки: %s;", super.getName(),
        super.getCost(), super.getQuantity(), super.getMeasure(), super.getDate(), this.flour);
    }
}
