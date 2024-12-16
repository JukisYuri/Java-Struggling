package DataStructure.Lab10.Task4;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class OrderManager {
    private List<Order> orders;

    public OrderManager(List<Order> orders) {
        this.orders = orders;
    }

    public List<Order> getOrders() {
        return orders;
    }

    Set<Product> getProductsWithGivenCategory(String supposeCategory) {
        return orders.stream()
                .flatMap(order -> order.getItems().stream()) // Truy cập từng OrderItem từ mỗi Order
                .map(OrderItem::getP) // Lấy Product từ OrderItem
                .filter(product -> product.isCategory(supposeCategory)) // Lọc các sản phẩm thuộc danh mục yêu cầu
                .collect(Collectors.toSet()); // Thu thập kết quả vào Set
    }

    Set<Product> getProductsOrdered(int tier, LocalDate from, LocalDate to) {
        return orders.stream()
                .filter(order -> order.getCustomer().getTier() == tier && order.getOrderDate().isAfter(from) && order.getOrderDate().isBefore(to))
                .flatMap(order -> order.getItems().stream())
                .map(OrderItem::getP)
                .collect(Collectors.toSet());
    }

    List<Order> get3RecentOrders() {
        return orders.stream()
                .sorted(Comparator.comparing(Order::getOrderDate).reversed()) // Vì lấy gần nhất nên phải reverse lại
                .limit(3).collect(Collectors.toList());
    }

    List<Order> getAllOrdersBySupposeDate(LocalDate supposeDate) {
        return orders.stream()
                .filter(order -> order.getOrderDate().equals(supposeDate))
                .collect(Collectors.toList());
    }

    double getTotalCostInSupposeMonth(LocalDate supposeDate) {
        return orders.stream()
                .filter(order -> order.getOrderDate().getMonth().equals(supposeDate.getMonth()) && order.getOrderDate().getYear() == supposeDate.getYear()) // getMonth trả về java.time, getYear trả về int
                .flatMap(order -> order.getItems().stream()) // Làm phẳng danh sách với các trường hợp lồng vào nhau
                .mapToDouble(item -> item.getP().getPrice())
                .sum();
    }

    double getAverageCostInSupposeDate(LocalDate supposeDate) {
        return orders.stream()
                .filter(order -> order.getOrderDate().getDayOfMonth() == supposeDate.getDayOfMonth() && order.getOrderDate().getMonth().equals(supposeDate.getMonth()) && order.getOrderDate().getYear() == supposeDate.getYear())
                .flatMap(order -> order.getItems().stream())
                .mapToDouble(item -> item.getP().getPrice())
                .average().orElse(0);
    }

    Map<Long, Integer> getNumberOfProducts() {
        return orders.stream()
                .collect(Collectors.toMap(Order::getOid, order -> order.getItems().stream().mapToInt(OrderItem::getQuantity).sum()));
    }

    Map<Long, List<Order>> getOrdersBoughtByCustomer(Customer customer){
        return orders.stream()
                .filter(order -> order.getCustomer().equals(customer))
                .collect(Collectors.groupingBy(order -> order.getCustomer().getCid())); // Nhóm các order theo cid
    }

    Map<Long, Double> getStatisticOrdersAndCost() {
        return orders.stream()
                .collect(Collectors.toMap(
                        Order::getOid, // Key là Order ID
                        order -> order.getItems().stream()
                                .mapToDouble(item -> item.getP().getPrice() * item.getQuantity())
                                .sum() // Tính tổng giá của các sản phẩm trong đơn hàng
                ));
    }

    @Override
    public String toString() {
        return "OrderManager{" +
                "orders=" + orders +
                '}';
    }
}
