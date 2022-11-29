package Works;

import Animals.Person;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

//class Main {
  //  public static void main(String[] args) {

    //}
//}



                       // **Программа по подсчёту радиуса**********

//import java.util.Scanner;
//class Main {
//    public static void main(String[] args) {
//        System.out.println("Введите радиус : ");
//
//        printMenu();
//        Scanner scanner = new Scanner(System.in);
//        int command = scanner.nextInt();
//
//        while (true) {
//            if (command == 1) {
//                System.out.println("Введите радиус : ");
//                if (Funtcion.radius < 0) {
//                    System.out.println("Радиус не может быть отрицательным в нашем приложении, введите корректный радиус .");
//
//                } else {
//                    System.out.println("Периметр круга с радиусом " + Funtcion.radius + " , по формуле HomeWork.P = 2 PI R , равен = " + Funtcion.Perimeter(Funtcion.radius));
//                    System.out.println("Пока ! %)");
//                    break;
//                }
//            } else if (command == 2) {
//                System.out.println("До новых встреч !");
//                break;
//
//            }else{
//                System.out.println("Такой команды пока нет, мы работаем над функционалом _)\nСкоро появиться много новых команд !");
//                printMenu();
//                command = scanner.nextInt();
//            }
//        }
//
//    }
//
//    public static void printMenu() {
//        System.out.println("Что вы хотите сделать ?");
//        System.out.println("1 - Посчитать периметр");
//        System.out.println("2 - Выйдти");
//    }
//}
//1
//package Stepik1;
//
//import java.util.Scanner;
//
//public class Funtcion {
//    static Scanner scanner = new Scanner(System.in);
//    public static final double PI = 3.14;
//    public static double radius = scanner.nextDouble();
//
//    public static double Perimeter(double radius) {
//        double result = 2 * PI * radius;
//        return result;
//    }
//}

                            //**SWITCH*******

//class main {
//    public static void main(String[] args) {
//        System.out.println("Введите месяц в целочисленном диапозоне\nОт 1 до 12 :");
//        Month month1 = new Month();
//        month1.month(month1.month2);
//
//    }
//}
// 1
//public class Month {
//    Scanner scanner = new Scanner(System.in);
//    int month2 = scanner.nextInt();
//    public void month(int month2) {
//
//
//        switch (month2) {
//            case 1:
//                System.out.println("Январь");
//                break;
//            case 2:
//                System.out.println("Февраль");
//                break;
//
//            case 3:
//                System.out.println("Март");
//                break;
//
//            case 4:
//                System.out.println("Апрель");
//                break;
//
//            case 5:
//                System.out.println("Май");
//                break;
//
//            case 6:
//                System.out.println("Июнь");
//                break;
//
//            case 7:
//                System.out.println("Июль");
//                break;
//
//            case 8:
//                System.out.println("Август");
//                break;
//
//            case 9:
//                System.out.println("Сентябрь");
//                break;
//
//            case 10:
//                System.out.println("Октябрь");
//                break;
//
//            case 11:
//                System.out.println("Ноябрь");
//                break;
//
//            case 12:
//                System.out.println("Декабрь");
//                break;
//            default:
//                System.out.println("Такого Месяца нет !");
//        }
//    }
//

                                    // ** Программа по работе с массивами **
//import java.util.Scanner;
//
//class main {
//    public static void main(String[] args) {
//        System.out.println(" Добро пожаловать ! ");
//        printMenu();
//        int[] array = {1,2,3,4,5,6,7,8,9,0};
//        Scanner scanner = new Scanner(System.in);
//        int command = scanner.nextInt();
//
//        while (command != 0) {
//            if (command == 1) {
//                Array.task1(array);
//                System.out.println();
//                printMenu();
//                command = scanner.nextInt();
//            } else if (command == 2) {
//                Array.task2(array);
//                System.out.println();
//                printMenu();
//                command = scanner.nextInt();
//            } else if (command == 3) {
//                System.out.println(Array.task3(array));
//                printMenu();
//                command = scanner.nextInt();
//            } else if (command == 4) {
//                System.out.println(Array.task4(array));
//                printMenu();
//                command = scanner.nextInt();
//            } else if (command == 5) {
//                System.out.println(Array.task5(array));
//                printMenu();
//                command = scanner.nextInt();
//            } else if(command==6) {
//                System.out.println("Пока !");
//                break;
//            }else {
//                System.out.println("Такой команды нет !");
//                printMenu();
//                command = scanner.nextInt();
//            }
//        }
//    }
//
//    public static void printMenu () {
//        System.out.println("Что вы хотите сделать ?");
//        System.out.println("Выберите команду: ");
//        System.out.println("1 - Вывести в заданном массиве элементы в обратном порядке ");
//        System.out.println("2 - Вывести четные элементы массива в строку, а нечетные на следующей строке в столбец");
//        System.out.println("3 - В заданном массиве найти индекс максимального числа");
//        System.out.println("4 - В заданном массиве найти количество четных элементов");
//        System.out.println("5 - Определить, есть ли в заданном массиве ноль. ");
//        System.out.println("6 - Выход");
//    }
//}
//
//public class Array {
//
//    public static void task1(int[] array) {
//        for (int i = array.length - 1; i >= 0; i--) {
//            System.out.print(array[i] + " ");
//        }
//    }
//
//    public static void task2(int[] array) {
//        for (int value : array) {
//            if (value % 2 == 0) {
//                System.out.print(value + " ");
//
//            }
//        }
//
//        for (int value : array) {
//            if (value % 2 == 1) {
//                System.out.print("\n" + value);
//            }
//        }
//    }
//
//    public static int task3(int[] array) {
//        int maxIndex = 0;
//
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] > array[maxIndex]) {
//                maxIndex = i;
//            }
//        }
//
//        return maxIndex;
//    }
//
//    public static int task4(int[] array) {
//        int evenNumbers = 0;
//
//        for (int value : array) {
//            if (value % 2 == 0) {
//                evenNumbers++;
//            }
//        }
//
//        return evenNumbers;
//    }
//
//    public static boolean task5(int[] array) {
//        int searchValue = 0;
//
//        for (int j : array) {
//            if (j == searchValue) {
//                return true;
//            }
//        }
//
//        return false;
//    }
//}

//                                            ** ArrayList **

//import java.util.ArrayList;
//
//public class Praktikum {
//    public static void main (String[] args) {
//        ArrayList<Double> temperatures = new ArrayList<>();
//        temperatures.add(92.3);
//        temperatures.add(12.4);
//        temperatures.add(74.1);
//        temperatures.add(45.0);
//
//        double max = 0;
//        for ( int i = 0; i < temperatures.size(); i++) {
//            if(temperatures.get(i) > max){
//                max = temperatures.get(i) ;
//            }
//        }
//
//        System.out.println("Самая высокая температура: " + max + " °С.");
//    }
//}


//
//import java.util.ArrayList;
//
//public class Praktikum1 {
//    public static void main(String[] args) {
//
//        ArrayList<Integer> speeds = new ArrayList<>(); // Объявите список
//        speeds.add(120);
//        speeds.add(75);
//        speeds.add(42);
//        speeds.add(60);
//        speeds.add(110);
//        speeds.add(20);
//
//        int sum = 0;
//        for (Integer speed: speeds ) {
//            sum += speed ;  // Сложите все значения в списке
//        }
//
//        int averageSpeed = sum/speeds.size(); // Вычислите среднюю скорость
//        System.out.println("Средняя скорость равна " + averageSpeed + " км/ч");
//    }
//}


//import java.util.ArrayList; // это верная версия , так тоже можно , но тренажёр меня не пустил ))))(((
//public class Praktukum2 {
//    public static void main(String[] args){
//        ArrayList<String> animals = new ArrayList<>();
//        animals.add("Шиншинла");
//        animals.add("Крокодил");
//        animals.add("Лев");
//        animals.add("Медведь");
//        animals.add("Слон");
//
//
//
//        System.out.println("Сегодня в зоопарке можно увидеть кормелния " + animals.size() + " животных :");
//        System.out.println("Это будут: ");
//        System.out.println( animals.get(0));
//        System.out.println( animals.get(1));
//        System.out.println( animals.get(2));
//        System.out.println( animals.get(3));
//        System.out.println( animals.get(4));
//        System.out.println("Расписание кормлений : ");
//        System.out.println("в 9:00 - " + animals.get(1));
//        System.out.println("в 10:00 - " + animals.get(4));
//        System.out.println("в 11:00 - " + animals.get(0));
//        System.out.println("в 12:00 - " + animals.get(2));
//        System.out.println("в 13:00 - " + animals.get(3));
//
//
//
//
//
//
//
//
//        // "Сегодня в зоопарке можно увидеть кормления " + ... + " животных:"
//        // "Это будут:"
//        // "Шиншилла"
//        // "Крокодил"
//        // "Лев"
//        // "Медведь"
//        // "Слон"
//        // "Расписание кормлений:"
//        // "В 9:00 - "
//        // "В 10:00 - "
//        // "В 11:00 - "
//        // "В 12:00 - "
//        // "В 13:00 - "
//
//    }
//}


//public class Praktikum4 {
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        ArrayList<String> animals = new ArrayList<>();
//        animals.add("Шиншилла");
//        animals.add("Крокодил");
//        animals.add("Лев");
//        animals.add("Медведь");
//        animals.add("Слон");
//
//        while (true) {
//            printMenu();
//            int command = scanner.nextInt();
//            if (command == 1) {
//                System.out.println("Сейчас в зоопарке можно увидеть " + animals.size() + " животных:");
//                for (String animal : animals) {
//                    System.out.println(animal); // Напечатайте животных
//                }
//            } else if (command == 2) {
//                System.out.println("Какое животное хотите добавить?");
//                String animal = scanner.next();
//                animals.add(animal); // Добавьте животное
//            } else if (command == 3) {
//                System.out.println("Какое животное нужно удалить?");
//                String animal = scanner.next();
//                if (!animals.isEmpty()) {
//                    animals.remove(animal);
//                }// Удалите животное, если список не пуст
//            } else if (command == 4) {
//                animals.clear(); // Очистите список
//                System.out.println("Все животные перевезены в другой зоопарк. Список пуст.");
//            } else if (command == 5) {
//                System.out.println("Какое животное вы хотите увидеть в зоопарке?");
//                String animal = scanner.next();
//                if (animals.contains(animal)) {
//                    System.out.println(animal + " на месте! Приходите посмотреть.");
//                    // Допишите условия
//                } else if(!animals.contains(animal)){
//                    System.out.println(" Такого животного сейчас нет в нашем зоопарке.");
//                }
//            }else{
//                break;
//            }
//
//        }
//    }
//
//
//    public static void printMenu() {
//        System.out.println("1 - Показать список животных в зоопарке.");
//        System.out.println("2 - Добавить животное в список.");
//        System.out.println("3 - Удалить животное из списка.");
//        System.out.println("4 - Очистить список.");
//        System.out.println("5 - Проверить, есть ли в зоопарке животное.");
//        System.out.println("Любая другая цифра - Выйти из приложения.");
//    }
//}
                                               //** HASHMAP **
//public class praktikum5 {
//    public static void main(String[] args) {
//        OrdersManager ordersManager = new OrdersManager();
//
//        ordersManager.printAllOrders();
//        System.out.println("Всего заказов на сумму: " + ordersManager.getOrdersSum());
//
//        String maxOrderCustomerName = ordersManager.getMaxOrderCustomerName();
//        System.out.println("Самая большая сумма заказов у " + maxOrderCustomerName);
//        ordersManager.printCustomerOrders(maxOrderCustomerName);
//
//        ordersManager.removeUnprofitableOrders();
//    }
//}

//import java.util.ArrayList;
//        import java.util.Collection;
//        import java.util.HashMap;
//
//public class OrdersManager {
//    HashMap<String, ArrayList<Double>> customersOrders;
//
//    public OrdersManager() {
//        customersOrders = new HashMap<>();
//        ArrayList<Double> orders = new ArrayList<>();
//        orders.add(154.43);
//        orders.add(5453.98);
//        orders.add(8776.65);
//        customersOrders.put("Иван И.", orders);
//
//        orders = new ArrayList<>();
//        orders.add(25343.54);
//        orders.add(420.50);
//        customersOrders.put("Ольга С.", orders);
//
//        orders = new ArrayList<>();
//        orders.add(325.90);
//        customersOrders.put("Александр Т.", orders);
//
//        orders = new ArrayList<>();
//        orders.add(253.54);
//        orders.add(420.50);
//        customersOrders.put("Александр Р.", orders);
//
//        orders = new ArrayList<>();
//        orders.add(780.54);
//        orders.add(420.50);
//        orders.add(36343.54);
//        orders.add(2000.50);
//        customersOrders.put("Екатерина О.", orders);
//    }
//
//    void printAllOrders() {
//        for (String name : customersOrders.keySet()) { // Цикл должен пройтись по ключам
//            System.out.println("Заказы " + name + ":");
//            ArrayList<Double> value = customersOrders.get(name);
//            System.out.println(value);
//        }
//    }
//
//    double getOrdersSum() {
//        double sum = 0;
//        for (ArrayList<Double> orders : customersOrders.values()) { // Здесь должен быть обход по значениям
//            for (double orderPrice : orders) {
//                sum += orderPrice;
//            }
//        }
//        return sum;
//    }
//
//    void printCustomerOrders(String customerName) {
//        if (customersOrders.containsKey(customerName)) { // Проверьте, есть ли указанный ключ в таблице
//            System.out.println("Заказы " + customerName + ":");
//            System.out.println(customersOrders.get(customerName));
//        }
//    }
//
//    String getMaxOrderCustomerName() {
//        double maxOrder = 0;
//
//        String customerName = "";
//        for (String name : customersOrders.keySet()) {
//            ArrayList<Double> orders = customersOrders.get(name);
//            double sum = 0;
//            for (double order : orders) {
//                sum += order;
//            }
//            if (sum > maxOrder) {
//                maxOrder = sum;
//                customerName = name;
//
//            }
//        }
//        return customerName;
//    }
//
//    void removeUnprofitableOrders() {
//        ArrayList<String> names = new ArrayList<>(); // Создайте список клиентов с заказами меньше 5000
//
//        // Наполните список names
//        for (String name : customersOrders.keySet()) {
//            ArrayList<Double> orders = customersOrders.get(name);
//            double ordersSum = 0;
//            for (double order : orders) {
//                ordersSum += order;
//            }
//
//            if (ordersSum < 5000) {
//                names.add(name);
//            }
//        }
//
//        for (String name : names) { // Удалите из хеш-таблицы тех, чьи расходы не превышают 5000
//            customersOrders.remove(name);
//            System.out.println("Клиента " + name + " больше нет в таблице.");
//        }
//    }}

//    import java.util.Scanner;
//        import java.util.HashMap;// Импортируйте нужные классы
//
//public class Praktikum3 {
//    public static void main(String[] args) {
//        HashMap<String, Integer> musicGroups =new HashMap<>();// Объявите и проиницализируйте хеш-таблицу musicGroups
//        musicGroups.put("The Beatles", 1960);
//        musicGroups.put("Rammstein", 1994);
//        musicGroups.put("Queen", 1970);
//        musicGroups.put("Led Zeppelin", 1968);
//        musicGroups.put("Black Sabbath", 1968);
//        musicGroups.put("AC/DC", 1973);
//        musicGroups.put("The Rolling Stones", 1962);
//        musicGroups.put("The Who", 1964);
//        musicGroups.put("Nightwish", 1996);
//        musicGroups.put("Nirvana", 1987);
//        musicGroups.put("Guns N’ Roses", 1985);
//        musicGroups.put("Scorpions", 1965);
//        musicGroups.put("Kiss", 1973);
//        musicGroups.put("The Doors", 1965);
//
//        System.out.println("Легендарные группы, год основания которых вы можете узнать:");
//        for(String group: musicGroups.keySet()) {
//            // Распечайте список групп
//            System.out.println(group);
//        }
//        Scanner scanner = new Scanner(System.in);
//
//        while (true) {
//            System.out.println("Выберите опцию");
//            System.out.println("1 - Узнать год основания группы");
//            System.out.println("2 - Добавить любимую группу");
//            System.out.println("3 - Выйти из приложения");
//            int command = Integer.parseInt(scanner.nextLine());
//            if (command == 1) {
//                System.out.println("Введите название группы ");// "Введите название группы"
//                String keyGroup = scanner.nextLine();
//                Integer year= musicGroups.get(keyGroup);
//                System.out.println( "Год основания " + keyGroup);
//                System.out.println(year);
//
//            } else if (command == 2) {
//                System.out.println("Добавьте свою любимую групп"); // "Добавьте свою любимую группу"
//                System.out.println("Введите её название"); // "Введите её название"
//                String nameGroup=scanner.nextLine(); // nameGroup
//                System.out.println("Введите год основания"); // "Введите год основания"
//                Integer bornYear = Integer.valueOf(scanner.nextLine());// bornYear
//                System.out.println("Информация о группе " + nameGroup + " добавлена.");
//                musicGroups.put(nameGroup,bornYear);
//
//            } else if (command == 3) {
//                break;// Остановите цикл
//            } else {
//                System.out.println("Извините, такой команды пока нет.");
//            }
//        }
//    }
//}

//import java.util.HashMap;
//
//public class Praktikum2 {
//    public static void main(String[] args) {
//        HashMap<String, Double> orders = new HashMap<>();
//        orders.put("Иван И.", 4345.5);
//        orders.put("Ольга С.", 76564.43);
//        orders.put("Александр Т.", 1234.86);
//        orders.put("Александр Р.", 23432.87);
//        orders.put("Екатерина О.", 1034753.6);
//        orders.put("Ярослав В.", 450.0);
//
//        double sum = 0; // Объявите переменную, где будет сохранена общая сумма
//        for (Double sum1: orders.values()) { // Пройдитесь в цикле по значениям
//            sum += sum1;
//        }
//
//        System.out.println("Всего было совершено заказов на сумму: " + sum);
//    }
//}

//import java.util.HashMap;
//public class Praktikum1 {
//    public static  void main(String[] args){
//        HashMap<String, ArrayList<Integer>> stateHolidays = new HashMap<>();
//        ArrayList<Integer> january = new ArrayList<>();
//        january.add(1);
//        january.add(7);
//        stateHolidays.put("Январь", january);
//
//        ArrayList<Integer> february =new ArrayList<>();
//        february.add(23);
//        stateHolidays.put("Февраль",february);
//
//        ArrayList<Integer> March = new ArrayList<>();
//        March.add(8);
//        stateHolidays.put("Март",March);
//
//        ArrayList<Integer> May = new ArrayList<>();
//        May.add(1);
//        May.add(9);
//        stateHolidays.put("Май",May);
//
//        ArrayList<Integer> June = new ArrayList<>();
//        June.add(12);
//        stateHolidays.put("Июнь",June);
//
//        ArrayList<Integer> November = new ArrayList<>();
//        November.add(4);
//        stateHolidays.put("Ноябрь",November);
//
//        System.out.println(stateHolidays);
//
//
//
//    }
//}

//import java.util.ArrayList;
//        import java.util.HashMap;
//
//public class Praktikum {
//    public static void main(String[] args) {
//        HashMap<String, ArrayList<Double>> menu = new HashMap<>(); //создаём хеш-таблицу
//        ArrayList<Double> mohitoPrice = new ArrayList<>(); //создаём список с ценами для коктейля
//        mohitoPrice.add(350.0);  //добавляем в список цену в рублях
//        mohitoPrice.add(15.50);  //добавляем в список цену в долларах
//        mohitoPrice.add(13.20);  //добавляем в список цену в евро
//        menu.put("Коктейль Mojito", mohitoPrice); //добавляем коктейль и список ценами в хеш-таблицу
//
//        ArrayList<Double> tiramisuPrice = new ArrayList<>();  //создаём список с ценами для тирамису
//        tiramisuPrice.add(120.0);
//        tiramisuPrice.add(4.00);
//        tiramisuPrice.add(3.20);
//        menu.put("Тирамису", tiramisuPrice); //добавляем тирамису и список с ценами в хеш-таблицу
//
//        ArrayList<Double> ramenPrice = new ArrayList<>(); //создаём список с ценами для рамена
//        ramenPrice.add(230.0);
//        ramenPrice.add(8.50);
//        ramenPrice.add(7.00);
//        menu.put("Рамен", ramenPrice); //добавляем рамен и список с ценами в хеш-таблицу
//        System.out.println(menu);
//    }
//}





//                                             *** set ang get ***




//class Main {
//    public static void main(String[] args) {
//        Person max = new Person("Синий");
//        Person ivan = new Person();
//        max.setAge(-10);
//        max.setName("Максим");
//        System.out.println(max.getAge());
//        System.out.println(max.getColor());
//    }
//}
//
//public class Person {
//    private String name;
//    private int age;
//    private String color;
//
//    Person(String color) {
//        this.color = color;
//    }
//
//    public Person() {
//
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setAge(int age) {
//        if (age < 0) {
//            System.out.println("Возраст меньше 0");
//        }
//        this.age = age;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public String getColor() {
//        return color;
//    }
////    Person(String name1, int age1){
////        name = name1;
////        age = age1;
////
////
////    }
//}

//                              object

//public class Praktikum {
//    public static void main(String[] args) {
//        Hamster[] hamsters = new Hamster[]{
//                new Hamster("Пушок", 150.5, 2, "Белый", true, false),
//                new Hamster("Корочка", 120, 3, "Рыжий", false, false),
//                new Hamster("Шалун", 199.9, 4, "Чёрный", false, false),
//                new Hamster("Снежинка", 175.9, 4, "Рыжий", false, false),
//                new Hamster("Штучка", 199.9, 7, "Чёрный", true, true),
//                new Hamster("Баранка", 173.8, 5, "Рыже-белый", true, false),
//                new Hamster("Нидзя",168,3,"Рыже-белый",true,false)// Добавьте Ниндзю
//        };
//
//        System.out.println("В конкурсе «Рыжий хомяк года» смогут участвовать:");
//        for (int i = 0; i < hamsters.length; i++) {
//            Hamster hamster = hamsters[i];
//
//            // Составьте условие отбора с помощью дополнительных переменных
//            boolean isColor = hamster.color.equals("Рыжий") || hamster.color.equals("Рыже-белый") && hamster.isFluffy;
//            boolean isWeight = hamster.weight>=150 && hamster.weight <=200;
//            boolean isAge = hamster.age>=2;
//
//
//            if ( isColor && (isWeight || hamster.isFluffy) && isAge && !hamster.isWinner) {
//                System.out.println(" - " + hamster.name);
//            }
//        }
//    }
//}
//
//class Hamster {
//    String name;      // Имя
//    double weight;    // Вес
//    int age;          // Возраст
//    String color;     // Цвет
//    boolean isFluffy; // Пушистый
//    boolean isWinner; // Победитель прошлых конкурсов
//
//    public Hamster(
//            String hamsterName,
//            double hamsterWeight,
//            int hamsterAge,
//            String hamsterColor,
//            boolean isFluffyHamster,
//            boolean isWinnerHamster
//    ) {
//        name = hamsterName;
//        weight = hamsterWeight;
//        age = hamsterAge;
//        color = hamsterColor;
//        isFluffy = isFluffyHamster;
//        isWinner = isWinnerHamster;
//    }
//}

                                                   // ** FINAPPLICATIOM **

import java.util.ArrayList;
        import java.util.HashMap;
        import java.util.Scanner;

//public class Praktikum {
//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Сколько денег у вас осталось до зарплаты?");
//        double moneyBeforeSalary = scanner.nextDouble();
//        System.out.println("Сколько дней до зарплаты?");
//        int daysBeforeSalary = scanner.nextInt();
//
//        Converter converter = new Converter(78.5, 88.7, 0.75);
//        DinnerAdvisor dinnerAdvisor = new DinnerAdvisor();
//        ExpensesManager expensesManager = new ExpensesManager();
//
//        while (true) {
//            printMenu();
//            int command = scanner.nextInt();
//
//            if (command == 1) {
//                System.out.println("Ваши сбережения: " + moneyBeforeSalary + " RUB");
//                System.out.println("В какую валюту хотите конвертировать? Доступные варианты: 1 - USD, 2 - EUR, 3 - JPY.");
//                int currency = scanner.nextInt();
//                converter.convert(moneyBeforeSalary, currency);
//            } else if (command == 2) {
//                dinnerAdvisor.getAdvice(moneyBeforeSalary, daysBeforeSalary);
//            } else if (command == 3) {
//                System.out.println("Введите размер траты:");
//                double expense = scanner.nextDouble();
//                System.out.println("К какой категории относится трата?");
//                String category = scanner.next();
//                moneyBeforeSalary = expensesManager.saveExpense(moneyBeforeSalary, category, expense);
//            } else if (command == 4) {
//                expensesManager.printAllExpensesByCategories();
//            } else if (command == 5) {
//                System.out.println("В какой категории искать?");
//                String category = scanner.next();
//                System.out.println("Самая большая трата в категории " + category + " составила "
//                        + expensesManager.findMaxExpenseInCategory(category) + " руб.");
//            } else if (command == 6) {
//                expensesManager.removeAllExpenses();
//            } else if (command ==7) { // Допишите остальные пункты меню
//                System.out.println("Всего потрачено: " + expensesManager.getExpensesSum());
//            } else if(command ==8) {
//                System.out.println("Какую категорию вы хотите удалить?");
//                String category = scanner.next();
//                expensesManager.removeCategory(category);
//            } else if(command ==9) {
//                System.out.println("В категории " + expensesManager.getMaxCategoryName() + " вы потратили больше всего.");
//                // Напечатайте фразу "В категории ИМЯ_КАТЕГОРИИ вы потратили больше всего.");
//            } else if (command == 0) {
//                System.out.println("Выход");
//                break;
//            } else {
//                System.out.println("Извините, такой команды пока нет.");
//            }
//        }
//    }

//    public static void printMenu() {
//        System.out.println("Что вы хотите сделать? ");
//        System.out.println("1 - Конвертировать валюту");
//        System.out.println("2 - Получить совет");
//        System.out.println("3 - Ввести трату");
//        System.out.println("4 - Показать траты по категориям");
//        System.out.println("5 - Показать самую большую трату в выбранной категории");
//        System.out.println("6 - Очистить таблицу трат");
//        System.out.println("7 - Вернуть сумму всех трат");
//        System.out.println("8 - Удалить категорию");
//        System.out.println("9 - Получить имя самой дорогой категории");
//        System.out.println("0 - Выход");
//    }
//}
//
//public class Converter {
//    double rateUSD;
//    double rateEUR;
//    double rateJPY;
//
//    Converter(double usd, double eur, double jpy) {
//        rateUSD = usd;
//        rateEUR = eur;
//        rateJPY = jpy;
//    }
//
//    void convert(double rubles, int currency) {
//        if (currency == 1) {
//            System.out.println("Ваши сбережения в долларах: " + rubles / rateUSD);
//        } else if (currency == 2) {
//            System.out.println("Ваши сбережения в евро: " + rubles / rateEUR);
//        } else if (currency == 3) {
//            System.out.println("Ваши сбережения в иенах: " + rubles / rateJPY);
//        } else {
//            System.out.println("Неизвестная валюта");
//        }
//    }
//
//    import java.util.ArrayList;
//import java.util.HashMap;
//
//    public class ExpensesManager {
//        HashMap<String, ArrayList<Double>> expensesByCategories;
//
//        ExpensesManager() {
//            expensesByCategories = new HashMap<>();
//        }
//
//        double saveExpense(double moneyBeforeSalary, String category, double expense) {
//            moneyBeforeSalary = moneyBeforeSalary - expense;
//            System.out.println("Значение сохранено! Ваш текущий баланс в рублях: " + moneyBeforeSalary);
//            if (expensesByCategories.containsKey(category)) {
//                ArrayList<Double> expenses = expensesByCategories.get(category);
//                expenses.add(expense);
//            } else {
//                ArrayList<Double> expenses = new ArrayList<>();
//                expenses.add(expense);
//                expensesByCategories.put(category, expenses);
//            }
//            if (moneyBeforeSalary < 1000) {
//                System.out.println("На вашем счету осталось совсем немного. Стоит начать экономить!");
//            }
//            return moneyBeforeSalary;
//        }
//
//        void printAllExpensesByCategories() {
//            for (String category : expensesByCategories.keySet()) {
//                System.out.println(category);
//                ArrayList<Double> expenses = expensesByCategories.get(category);
//                for (Double expense : expenses) {
//                    System.out.println(expense);
//                }
//            }
//        }
//
//        double findMaxExpenseInCategory(String category) {
//            double maxExpense = 0;
//            if (expensesByCategories.containsKey(category)) {
//                ArrayList<Double> expenses = expensesByCategories.get(category);
//                for (Double expense : expenses) {
//                    if (expense > maxExpense) {
//                        maxExpense = expense;
//                    }
//                }
//            } else {
//                System.out.println("Такой категории пока нет.");
//            }
//            return maxExpense;
//        }
//
//        void removeAllExpenses() {
//            expensesByCategories.clear();
//            System.out.println("Траты удалены.");
//        }
//
//        double getExpensesSum() {
//            double result = 0;
//            for (ArrayList<Double> sum1 : expensesByCategories.values()) {
//                for (Double expenses : sum1) {
//                    result += expenses;
//                }
//            }
//            return result;
//        }
//        // Напишите метод для получения суммы всех трат
//
//        void removeCategory(String category) {
//            expensesByCategories.remove(category);
//
//        } // Напишите метод для удаления категории
//
//
//        // Напишите метод для получения категории, где размер трат больше всего
//        // Используйте эти переменные для сохранения промежуточных значений
//        double maxCategorySum = 0;
//        String maxCategoryName = "";
//
//        String getMaxCategoryName() {
//            for (String category : expensesByCategories.keySet()) {
//                ArrayList<Double> exp = expensesByCategories.get(category);
//                double sum = 0;
//                for (double exp1 : exp) {
//                    sum += exp1;
//                }
//                if (sum > maxCategorySum) {
//                    maxCategorySum = sum;
//                    maxCategoryName = category;
//                }
//            }
//            return maxCategoryName;
//        }
//    }
//
//    public class DinnerAdvisor {
//
//        void getAdvice(double moneyBeforeSalary, int daysBeforeSalary) {
//            if (moneyBeforeSalary < 3000) {
//                System.out.println("Сегодня лучше поесть дома. Экономьте - и вы дотянете до зарплаты!");
//            } else if (moneyBeforeSalary < 10000) {
//                if (daysBeforeSalary < 10) {
//                    System.out.println("Окей, пора в Макдак!");
//                } else {
//                    System.out.println("Сегодня лучше поесть дома. Экономьте - и вы дотянете до зарплаты!");
//                }
//            } else if (moneyBeforeSalary < 30000) {
//                if (daysBeforeSalary < 10) {
//                    System.out.println("Неплохо! Прикупите долларов и зайдите поужинать в классное место. :)");
//                } else {
//                    System.out.println("Окей, пора в Макдак!");
//                }
//            } else {
//                if (daysBeforeSalary < 10) {
//                    System.out.println("Отлично! Заказывайте крабов!");
//                } else {
//                    System.out.println("Неплохо! Прикупите долларов и зайдите поужинать в классное место. :)");
//                }
//            }
//        }
//    }
//
//                                      // Приложение для ввода пинкода //
// import java.util.Scanner;
//
//class main{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int counter = 0;
//        boolean pin_code_coincided = true;
//        while (true) {
//            if(counter > 4) {
//                pin_code_coincided = false;
//                break;
//            }
//            String correct = sc.nextLine();
//            String vasya = sc.nextLine();
//            counter++;
//            if(correct.equals(vasya)) {
//                System.out.println("СORRECT");
//                break;
//            }
//            System.out.println("INCORRECT " + counter);
//
//        }
//
//        if (!pin_code_coincided) {
//            System.out.println("Error");
//        }
//    }
//}

//                                                             ** Программа для определения что больше букв или чисел в строке **
//import java.util.Scanner;
//
//class Main3 {
//        public static void main(String[] args) {
//                Scanner scanner = new Scanner(System.in);
//                String string = scanner.nextLine();
//                char[] array = string.toCharArray();
////        Character[] array = new Character[string.length()];
//                int checkDigit = 0;
//                int checkLetter = 0;
//
////        for (int i = 0; i < array.length; i++) {
////            array[i] = string.charAt(i);
////        }
//
//                for (int i = 0; i < array.length; i++) {
//                        if (Character.isDigit(array[i])) {
//                                checkDigit++;
//                        } else if (Character.isAlphabetic(array[i])) {
//                                checkLetter++;
//                        }
//                }
//
//                if (checkDigit > checkLetter) {
//                        System.out.println("Digit");
//                } else if (checkDigit == checkLetter) {
//                        System.out.println("Eqauls");
//                } else {
//                        System.out.println("Letter");
//                }
//        }
//}