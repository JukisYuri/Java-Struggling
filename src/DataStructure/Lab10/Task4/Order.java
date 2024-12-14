package DataStructure.Lab10.Task4;

import java.time.LocalDate;
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
                .peek(p -> p.setPrice(p.getPrice() * 0.9)) // It's mutable
                .collect(Collectors.toList());
    }

    Product getCheapestProduct(String supposeCategory){
        return items.stream()
                .map(OrderItem::getP)
                .filter(p -> p.getCategory().equals(supposeCategory))
                .min(Comparator.comparing(Product::getPrice)).orElse(null);
    }

    Map<String, List<Product>> groupByCategory(){
        return items.stream()
                .map(OrderItem::getP)
                .collect(Collectors.groupingBy(Product::getCategory));
    }

    Map<String, Product> mostExpensiveProductByCategory(){
        return items.stream()
                .map(OrderItem::getP)
                .max(Comparator.comparing(Product::getPrice)).stream()
                .collect(Collectors.toMap(Product::getCategory, x -> x));
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
    public static void main(String[] args) {
        Order order = getOrder();
        System.out.println(order.getAllProductsBaseOnCategory("category1", 20000) + "\n" + "---------");
        System.out.println(order.getAllProductsAndDecreasePrice10Percent("category1") + "\n" + "---------");
        System.out.println(order.getCheapestProduct("category1") + "\n" + "---------");
        System.out.println(order.groupByCategory() + "\n" + "---------");
        System.out.println(order.mostExpensiveProductByCategory() + "\n" + "---------");
    }

    private static Order getOrder() {
        Customer customer1 = new Customer(32L, "A", 2);
        Product product1 = new Product(25L, "name1", "category1", 15000);
        Product product2 = new Product(28L, "name2", "category1", 30000);
        OrderItem orderItem1 = new OrderItem(30, product1);
        OrderItem orderItem2 = new OrderItem(20, product2);
        List<OrderItem> listOrderItems = new ArrayList<>();
        listOrderItems.add(orderItem1);
        listOrderItems.add(orderItem2);
        return new Order(34L, "okay" , new Date(), customer1, listOrderItems);
    }
}
