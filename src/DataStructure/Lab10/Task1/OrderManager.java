package DataStructure.Lab10.Task1;

import java.util.*;
import java.util.stream.Collectors;

public class OrderManager {
    private List<Order> orders;

    public OrderManager(List<Order> orders) {
        this.orders = orders;
    }
    Product maxProduct() {
        if (orders.isEmpty()) {
            throw new RuntimeException("No orders found");
        } else {
            Product maxProduct = null;
            int maxPrice = 0;

            for (Order order : orders) {
                for (OrderItem item : order.getItems()) {
                    if (item.getItem().getPrice() > maxPrice) {
                        maxPrice = item.getItem().getPrice();
                        maxProduct = item.getItem();
                    }
                }
            }
            return maxProduct;
        }
    }

    Product maxProductWithJava8() {
        if (orders.isEmpty()) {
            throw new RuntimeException("No orders found");
        } else {
            return orders.stream()
                    .flatMap(order -> order.getItems().stream())
                    .map(OrderItem::getItem)
                    .max((p1, p2) -> Integer.compare(p1.getPrice(), p2.getPrice()))
                    .orElse(null);
        }
    }

    HashMap<String, Integer> productTypeStatistics() {
        HashMap<String, Integer> result = new HashMap<>();
        if (orders.isEmpty()) {
            throw new RuntimeException("No orders found");
        } else {
            for (Order order : orders) {
                for (OrderItem item : order.getItems()) {
                    String type = item.getItem().getType();
                    if (type != null && !type.isEmpty()) {
                        if (result.containsKey(type)) {
                            result.put(type, result.get(type) + item.getAmount());
                        } else {
                            result.put(type, item.getAmount());
                        }
                    }
                }
            }
        }
        return result;
    }

    Map<String, Integer> productTypeStatisticsWithJava8() {
        if (orders.isEmpty()) {
            throw new RuntimeException("No orders found");
        } else {
            return orders.stream()
                    .flatMap(order -> order.getItems().stream())
                    .filter(item -> item.getItem().getType() != null && !item.getItem().getType().isEmpty())
                    .collect(Collectors.toMap(
                            item -> item.getItem().getType(),
                            OrderItem::getAmount,
                            Integer::sum
                    ));
        }
    }

    TreeSet<Order> ordersByCost() {
        if (orders.isEmpty()) {
            throw new RuntimeException("No orders found");
        } else {

            TreeSet<Order> listTreeSet = new TreeSet<>(new Comparator<Order>() {
                @Override
                public int compare(Order o1, Order o2) {
                    int checkCost = o1.totalCost() - o2.totalCost();
                    if (checkCost == 0) {
                        return o1.getDate().compareTo(o2.getDate());
                    } else {
                        return Integer.compare(o2.totalCost(), o1.totalCost());
                    }
                }
            });
            listTreeSet.addAll(orders);
            return listTreeSet;
        }
    }

    TreeSet<Order> ordersByCostWithJava8() {
        if (orders.isEmpty()) {
            throw new RuntimeException("No orders found");
        } else {
            TreeSet<Order> listTreeSet = new TreeSet<>((o1, o2) ->
                    o1.totalCost() != o2.totalCost()
                            ? Integer.compare(o2.totalCost(), o1.totalCost())
                            : o1.getDate().compareTo(o2.getDate())
            );
            listTreeSet.addAll(orders);
            return listTreeSet;
        }
    }


    @Override
    public String toString() {
        return "OrderManager{" +
                "orders=" + orders +
                '}';
    }
}
