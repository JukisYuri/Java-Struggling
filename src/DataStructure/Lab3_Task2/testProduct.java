package DataStructure.Lab3_Task2;

import java.util.Arrays;

public class testProduct {
    public static void main(String[] args){
        Product product1 = new Product("12", "A", 2000, "Type1");
        Product product2 = new Product("15", "B", 2500, "Type2");
        Product product3 = new Product("18", "C", 3000, "Type3");
        Product product4 = new Product("12", "D", 2500, "Type2");
        OrderItem O1 = new OrderItem(product1,20);
        OrderItem O2 = new OrderItem(product2,30);
        OrderItem O3 = new OrderItem(product4,35);
        OrderItem[] listOrderItem = {O1,O2,O3};
        OrderItem[] listOrderItem2 = {O1,O3};
        OrderItem[] listOrderItem3 = {O1,O2};
        Order order1 = new Order(listOrderItem);
        Order order2 = new Order(listOrderItem2);
        Order order3 = new Order(listOrderItem3);
        Order[] listOrder = {order1, order2, order3};
        OrderManager orderManager = new OrderManager(listOrder);
        System.out.println(order1.contains(product3));
        System.out.println(Arrays.toString(order1.filter("Type2")));
        orderManager.sortByCost();
        System.out.println('\n' + "---------------------------------" + '\n');
        System.out.println(Arrays.toString(orderManager.topNOrders(2)));
    }
}
