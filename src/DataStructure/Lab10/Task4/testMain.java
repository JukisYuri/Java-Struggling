package DataStructure.Lab10.Task4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class testMain {
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
        return new Order(34L, "okay" , LocalDate.now(), customer1, listOrderItems);
    }
}
