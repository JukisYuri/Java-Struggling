package DataStructure.Lab3_Task2;

public class Product implements Comparable<Product> {
    private String id;
    private String name;
    private double price;
    private String type;

    public Product(String id, String name, double price, String type) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }

    // Implement compareTo to allow comparisons between products
    @Override
    public int compareTo(Product other) {
        return this.name.compareTo(other.name); // Compare products by name
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", type='" + type + '\'' +
                '}';
    }
}
