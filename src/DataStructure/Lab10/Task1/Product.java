package DataStructure.Lab10.Task1;

import java.time.LocalDate;

public class Product {
    private String name, type;
    private int price;
    private LocalDate expiredDate;

    public Product(String name, String type, int price, LocalDate expiredDate) {
        this.name = name;
        this.type = type;
        this.price = price;
        this.expiredDate = expiredDate;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getPrice() {
        return price;
    }

    public LocalDate getExpiredDate() {
        return expiredDate;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", expiredDate=" + expiredDate +
                '}';
    }
}
