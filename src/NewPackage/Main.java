package NewPackage;

public class Main {
    public static void main(String[] args) {

        Identifier<Integer, Integer> identifier = new Identifier<>();
        identifier.setValue(13);
        identifier.setValue1(20);
        int value1 = identifier.getValue1();
        int value = identifier.getValue();
        System.out.println(value);
        System.out.println(value1);

        Class1 class1 = new Class1();
        class1.<Integer>method(13);
    }
}
