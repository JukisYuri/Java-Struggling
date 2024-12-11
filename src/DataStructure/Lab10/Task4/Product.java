package DataStructure.Lab10.Task4;

public class Product {
    private Long pid;
    private String name;
    private String category;
    private double price;

    public Product(Long pid, String name, String category, double price) {
        this.pid = pid;
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public Long getPid() {
        return pid;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "pid=" + pid +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                '}';
    }
}
