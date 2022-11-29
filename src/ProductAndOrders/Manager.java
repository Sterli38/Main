package ProductAndOrders;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Manager {
    private Products products = new Products();
    private final List<Order> orders = new ArrayList<>();

    public Manager() {
        read();
    }
    private void read() {
        List<Product> products = new ArrayList<>();
        try (BufferedReader ois = new BufferedReader(new FileReader("C:\\Users\\lenya\\Desktop\\idie\\Main\\src\\ProductAndOrders\\Products.txt"))) {
            String string = ois.readLine();
            String[] array = string.split(";");
            products.add(new Product(array[4],array[5],Integer.parseInt(array[6]),Integer.parseInt(array[7])));
            this.products.addAll(products);
        } catch (IOException ex) {
//            ex.printStackTrace();
            System.out.println("Файл не найден");
        }
    }

    public List<Product> task1() {
        List<Product> task1 = products.getProducts().stream()
                .filter(i -> "Продукты".equals(i.getProductType()))
                .filter(i -> i.getPrice() > 100)
                .collect(Collectors.toList());
        return task1;
    }

    public List<Product> task2() {
        products.getProducts().stream()
                .filter(i -> i.getProductType().equals("Товары для дома"))
                .forEach(i -> i.setPrice(i.getPrice() * 0.9));
        return (List<Product>) products;
    }

    public List<Product> task3() {
        products.getProducts().stream()
                .sorted(Comparator.comparing(Product::getName))
                .collect(Collectors.toList());
        return (List<Product>) products;
    }

    public Order createOrder() {
        Order order = new Order(null,0,null);
        orders.add(order);
        return order;
    }

    public Order findOrderById(int id) {
        return orders.stream()
                .filter(i -> i.getId() == id)
                .findFirst().orElse(null);
    }

    public void addProduct(int productId, int orderId) {
        Product product = products.getProduct(productId);
        Order order = findOrderById(orderId);
        order.add(product);
    }
}
