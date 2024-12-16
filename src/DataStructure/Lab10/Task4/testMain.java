package DataStructure.Lab10.Task4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class testMain {
    public static void main(String[] args) {
        Customer customer1 = new Customer(32L, "A", 2);
        Customer customer2 = new Customer(10L, "B", 3);
        Product product1 = new Product(25L, "name1", "category1", 15000);
        Product product2 = new Product(28L, "name2", "category1", 30000);
        Product product3 = new Product(29L, "name3", "category2", 40000);
        Product product4 = new Product(35L, "name4", "category2", 35000);
        OrderItem orderItem1 = new OrderItem(30, product1);
        OrderItem orderItem2 = new OrderItem(20, product2);
        OrderItem orderItem3 = new OrderItem(15, product3);
        OrderItem orderItem4 = new OrderItem(50, product4);
        List<OrderItem> listOrderItems = new ArrayList<>();
        listOrderItems.add(orderItem1);
        listOrderItems.add(orderItem2);
        List<OrderItem> listOrderItems2 = new ArrayList<>();
        listOrderItems2.add(orderItem1);
        listOrderItems2.add(orderItem3);
        listOrderItems2.add(orderItem4);
        Order order = new Order(23L, "okay", LocalDate.now(), customer1, listOrderItems);
        Order order2 = new Order(48L, "waiting", LocalDate.now(), customer2, listOrderItems2);
        List<Object> outputOfOrders = List.of(
                order.getAllProductsBaseOnCategory("category1", 20000),
                order.getAllProductsAndDecreasePrice10Percent("category1"),
                order.getCheapestProduct("category1"),
                order.groupByCategory() + "\n" + "---------",
                order.mostExpensiveProductByCategory() + "\n" + "-".repeat(150)
        );
        List<Order> listOrder = new ArrayList<>();
        listOrder.add(order);
        listOrder.add(order2);
        OrderManager orderManager = new OrderManager(listOrder);
        List<Object> outputOfOrderManager = List.of(
                orderManager.getProductsWithGivenCategory("category1"),
                orderManager.getProductsOrdered(2, LocalDate.of(2024, 2, 1), LocalDate.of(2024, 4, 1)),
                orderManager.get3RecentOrders(),
                orderManager.getAllOrdersBySupposeDate(LocalDate.of(2024, 3, 15)),
                orderManager.getTotalCostInSupposeMonth(LocalDate.of(2024, 2, 1)),
                orderManager.getAverageCostInSupposeDate(LocalDate.of(2024, 3, 15)),
                orderManager.getNumberOfProducts(),
                orderManager.getOrdersBoughtByCustomer(customer1),
                orderManager.getStatisticOrdersAndCost()
        );
        outputOfOrders.forEach(System.out::println);
        outputOfOrderManager.forEach(System.out::println);
    }
}
