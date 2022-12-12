package ProductAndOrders;

import java.io.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class OrdersService implements Serializable {
    private List<Order> orders = new ArrayList<>();

    public OrdersService() {
        try (BufferedReader ois = new BufferedReader(new FileReader("C:\\Users\\lenya\\IdeaProjects\\Main\\src\\ProductAndOrders\\Products.txt"))) {
            String string = ois.readLine();
            DateFormat dateFormat = new SimpleDateFormat("yyyy,MM,dd,HH,mm,ss");
            while(string != null) {
                String[] array = string.split(";");
                Order order = new Order(dateFormat.parse(array[0]), Integer.parseInt(array[1]), dateFormat.parse(array[2]));
                for(int j = 3; j < array.length; j += 4) {
                    try {
                        Product product = new Product(array[j], array[j + 1], Integer.parseInt(array[j + 2]), Double.parseDouble(array[j + 3]));
                        order.add(product);
                    } catch (Exception ex1) {
                        System.out.println("Неверный формат добавления продукта или заказа");
                    }
                }
                orders.add(order);
                string = ois.readLine();
            }
        } catch (IOException ex) {
//            ex.printStackTrace();
            System.out.println("Файл не найден");
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public void getOrder(int id) {
        Order order = orders.stream()
                .filter(i -> i.getId() == id)
                .findFirst()
                .orElse(null);
        if(order == null) {
            System.out.println("Такого заказа нет в списке заказов!");
        } else {
            System.out.println(order);
        }
    }

    public boolean isEmpty() {
        return orders.isEmpty();
    }

    @Override
    public String toString() {
        return "Заказы:" +  orders;
    }

    public List<Order> getUnpaidOrders() {
        return orders.stream()
                .filter(i -> i.getOrderPaymentDay() == null )
                .collect(Collectors.toList());
    }

//    public List<Order> getOrdersBetween(Date dateFrom, Date dateTill) {
//        return orders.stream()
//                .filter(i -> dateFrom.after(i.getOrderPaymentDay()) &&  i.getOrderPaymentDay().before(dateTill)) // Если дата начала после даты* и дата после даты конца
//                .collect(Collectors.toList());
//    }

    private void sale() {
         orders.stream()
                .filter(i -> i.getOrderPrice() > 1000)
                .forEach(i -> i.setPrice(i.getOrderPrice() * 0.95));
    }

//    private void top() {
//
//    }
}