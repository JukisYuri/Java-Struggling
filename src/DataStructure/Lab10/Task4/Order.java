package DataStructure.Lab10.Task4;

import java.util.*;
import java.util.stream.Collectors;

public class Order {
    private Long oid;
    private String status;
    private Date orderDate;
    private Customer customer;
    private List<OrderItem> items;

    public Order(Long oid, String status, Date orderDate, Customer customer, List<OrderItem> items) {
        this.oid = oid;
        this.status = status;
        this.orderDate = orderDate;
        this.customer = customer;
        this.items = items;
    }

    public Long getOid() {
        return oid;
    }

    public String getStatus() {
        return status;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    List<Product> getAllProductsBaseOnCategory(String supposeCategory, int supposePrice) {
        return items.stream()
                .map(OrderItem::getP)
                .filter(p -> p.getCategory().equals(supposeCategory) && p.getPrice() > supposePrice)
                .collect(Collectors.toList());
    }

    List<Product> getAllProductsAndDecreasePrice10Percent(String supposeCategory){
        return items.stream()
                .map(OrderItem::getP)
                .filter(p -> p.getCategory().equals(supposeCategory))
                .peek(p -> p.setPrice(p.getPrice() * 0.9))
                .collect(Collectors.toList());
    }

    OptionalDouble getCheapestProduct(String supposeCategory){
        return items.stream()
                .map(OrderItem::getP)
                .filter(p -> p.getCategory().equals(supposeCategory))
                .mapToDouble(Product::getPrice)
                .min();
    }

    @Override
    public String toString() {
        return "Order{" +
                "oid=" + oid +
                ", status='" + status + '\'' +
                ", orderDate=" + orderDate +
                ", customer=" + customer +
                ", items=" + items +
                '}';
    }
}
