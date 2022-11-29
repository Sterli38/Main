package HomeWork.P;

public class Main extends Object {
    public static void main(String[] args) {

        Dog dog = new Dog("Бобик", 5);
        System.out.println(dog);
        System.out.println(dog.getName());

        Cat cat = new Cat("Мурка" , 3);
        System.out.println(cat);
        dog.voice();

        Animal[] animals ={cat, dog};
//        for(int i = 0; i <= animals.length; i++) {
//            System.out.println(animals[i]);
//        }
        method(animals);

    }
    public static void method(Animal[] animals) {
        method2(animals);
    }
    public static void method2(Animal[] animals) {
        for (int i = 0; i <= 4; i++) {
          try {
              System.out.println(animals[i]);
              System.out.println(i / 0);
          } catch (ArrayIndexOutOfBoundsException exception) {
              System.out.println("Массив");
          } catch (Exception exception) {
              System.out.println("Ошибка");
          }
          /* catch (ArrayIndexOutOfBoundsException exception) {
             System.out.println("Выход за пределеы массива");
          } catch (ArithmeticException exception) {
              System.out.println("Деление на ноль");
          }*/
        }
    }
}