public class Beverage {
    private String name;
    private double price;

    public Beverage(String name, double price) {
        this.name = name;
        this.price = price;
    }
    // this is get method of name field
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}