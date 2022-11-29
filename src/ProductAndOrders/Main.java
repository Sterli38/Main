package ProductAndOrders;

import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
OrdersService o = new OrdersService();
//        System.out.println(o.getOrders());
        System.out.println(o.getOrdersBetween(new Date(2019,11,20),new Date(2021,11,20)));
    }
}
