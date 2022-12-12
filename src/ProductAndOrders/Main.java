package ProductAndOrders;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws IOException {
//        Order order = new Order(new Date(2002,10,14),10,new Date(2003,10,14));
//        System.out.println(order.getProduct(3));
//OrdersService o = new OrdersService();
//        System.out.println(o.getOrders());
        Manager manager = new Manager();
        manager.addProduct(18,2);
//        System.out.println(o.getOrders());
//        System.out.println(o.getOrdersBetween(new Date(2024,11,20),new Date(2022,11,20))); *
    }
}
