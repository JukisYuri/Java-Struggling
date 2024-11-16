package DataStructure.Lab3_Task2;

import java.util.Arrays;
import java.util.Comparator;

public class OrderManager {
    private Order[] order;

    public OrderManager(Order[] order) {
        this.order = order;
    }

    public void sortDescendingOrderByCost(){
        Arrays.sort(order, new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                return Double.compare(o2.cost(), o1.cost()); // So sánh chi phí giảm dần
            }
        });
    }

    // sort orders by cost (descending)
    public void sortByCost() {
        if (order == null || order.length == 0) {
            System.out.println("Danh sách đơn hàng không tồn tại");
        }
        sortDescendingOrderByCost();
        System.out.println(Arrays.toString(order));
    }

    // get top N highest orders by cost
    public Order[] topNOrders(int n) {
        if (order == null || order.length == 0 || n <= 0) {
            return new Order[0];
        }
        if (n > order.length) {
            n = order.length;
        }
        Order[] result = new Order[n];
        sortDescendingOrderByCost();
        for (int i = 0; i < n; i++) {
            result[i] = order[i];
        }
        return result;
    }
}
