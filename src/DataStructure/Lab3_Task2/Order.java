package DataStructure.Lab3_Task2;

import java.util.ArrayList;
import java.util.Arrays;

public class Order {
    private OrderItem[] items;

    public Order(OrderItem[] items) {
        this.items = items;
    }

    public double cost() {
        double result = 0.0;
        for(OrderItem item : items){
            result += item.helpCost();
        }
        return result;
    }

    // using binary search approach
    public boolean contains(Product p) {
        int left = 0;
        int right = items.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            OrderItem midItem = items[mid];
            if (p.compareTo(midItem.getP()) == 0) {
                return true;
            } else if (p.compareTo(midItem.getP()) < 0) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return false;
    }
        // get all products based on the given type using linear search
        public Product[] filter(String type) {
            ArrayList<Product> filteredProducts = new ArrayList<>();

            // Iterate through each OrderItem and call helpFilter
            for (OrderItem item : items) {
                Product[] products = item.helpFilter(type);
                filteredProducts.addAll(Arrays.asList(products));
            }

            // Convert the ArrayList to an array and return
            return filteredProducts.toArray(new Product[0]);
        }

    @Override
    public String toString() {
        return "Order{" +
                "items=" + Arrays.toString(items) + "\n" +
                "-> Total Order Cost=" + cost() +
                '}' + "\n\n";
    }
}
