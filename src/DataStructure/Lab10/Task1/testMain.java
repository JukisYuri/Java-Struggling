package DataStructure.Lab10.Task1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class testMain {
    public static void main(String[] args) {
        Product product1 = new Product("A", "Light Novel", 20000, LocalDate.of(2020, 10, 10));
        Product product2 = new Product("B", "Light Novel", 25000, LocalDate.of(2020, 12, 9));
        Product product3 = new Product("C", "Manga", 40000, LocalDate.of(2021, 11, 2));
        Product product4 = new Product("C", "Manga", 32000, LocalDate.of(2022, 5, 3));
        Product product5 = new Product("C", "ArtBook", 30000, LocalDate.of(2023, 7, 20));
        OrderItem orderItem1 = new OrderItem(product1, 10);
        OrderItem orderItem2 = new OrderItem(product2, 15);
        OrderItem orderItem3 = new OrderItem(product3, 50);
        OrderItem orderItem4 = new OrderItem(product4, 30);
        OrderItem orderItem5 = new OrderItem(product5, 20);
        List<OrderItem> orderListItems1 = new ArrayList<OrderItem>();
        orderListItems1.add(orderItem1);
        orderListItems1.add(orderItem2);
        orderListItems1.add(orderItem3);
        List<OrderItem> orderListItems2 = new ArrayList<OrderItem>();
        orderListItems2.add(orderItem4);
        orderListItems2.add(orderItem5);
        Order order1 = new Order("1", "KhangHangA", "EmployeeA", LocalDate.now(), orderListItems1);
        Order order2 = new Order("2", "KhangHangB", "EmployeeB", LocalDate.now(), orderListItems2);
        List<Order> listOrder = new ArrayList<Order>();
        listOrder.add(order1);
        listOrder.add(order2);
        OrderManager orderManager = new OrderManager(listOrder);

        List<Object> outputAnPham = List.of(
            orderManager.maxProduct(),
            orderManager.maxProductWithJava8(),
            orderManager.productTypeStatistics(),
            orderManager.productTypeStatisticsWithJava8(),
            orderManager.ordersByCost(),
            orderManager.ordersByCostWithJava8()
        );
        outputAnPham.forEach(System.out::println);
    }
}
