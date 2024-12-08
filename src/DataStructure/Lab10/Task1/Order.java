package DataStructure.Lab10.Task1;

import java.time.LocalDate;
import java.util.*;

public class Order {
    private String id, customer, employee;
    private LocalDate date;
    private List<OrderItem> items;

    public Order(String id, String customer, String employee, LocalDate date, List<OrderItem> items) {
        this.id = id;
        this.customer = customer;
        this.employee = employee;
        this.date = date;
        this.items = items;
    }

    public String getId() {
        return id;
    }

    public String getCustomer() {
        return customer;
    }

    public String getEmployee() {
        return employee;
    }

    public LocalDate getDate() {
        return date;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    int totalCost(){
        int total = 0;
        for (OrderItem item : items) {
            total += item.getItem().getPrice() * item.getAmount();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", customer='" + customer + '\'' +
                ", employee='" + employee + '\'' +
                ", date=" + date +
                ", items=" + items +
                '}';
    }
}
