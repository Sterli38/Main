package Class;

public class Employee extends Person {
    private String name;
    private int age;

    Employee(String name) {
        super(name);
    }

    Employee(String name, int age) {
        super(name);
        this.age = age;

    }

}
