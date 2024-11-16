package DataStructure.Lab3_Task2;

import java.util.ArrayList;

public class OrderItem{
    private Product p;
    private int quantity;

    public OrderItem(Product p, int quantity) {
        this.p = p;
        this.quantity = quantity;
    }
    public double helpCost(){
        return p.getPrice() * this.quantity;
    }

    public Product getP() {
        return p;
    }

    public int getQuantity() {
        return quantity;
    }
    public Product[] helpFilter (String type){
        if(p != null && type.equals(p.getType())){
            return new Product[]{p}; // Nếu sản phẩm khớp với loại, trả về sản phẩm
        }
        return new Product[0]; // Nếu không khớp, trả về mảng rỗng
    }

    @Override
    public String toString() {
        return "OrderItem{" + "\n" +
                "p=" + p +
                ", quantity=" + quantity +
                ", Total price=" + helpCost() +
                '}';
    }
}
