package lv.rvt;

public class Product {
    private double price;
    private int quantity;
    private String name;
    private String location;
    private int weight;
    
    public Product(String initialName, double initialPrice, int initialQuantity) {
        this.name = initialName;
        this.price = initialPrice;
        this.quantity = initialQuantity;
    }
    
    public Product(String name) {
        this.name = name;
        this.location = "shelf";
        this.weight = 1;
    }

    public Product(String name, String location) {
        this.name = name;
        this.location = location;
        this.weight = 1;
    }

    public Product(String name, int weight) {
        this.name = name;
        this.location = "shelf";
        this.weight = weight;
    }

    public void printProduct() {
        System.out.println(this.name + ", price " + this.price + ", " + this.quantity + " pcs");
    }

    public String toString() {
        return this.name + " (" + this.weight + " kg) can be found from the " + this.location;
    }
}