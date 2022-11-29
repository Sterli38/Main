package HomeWork.P;

public class Dog extends Animal {

    public Dog(String name, int age) {
        super(name, age);

    }

    @Override
    public void voice() {
        System.out.println("Gav");
    }

    @Override
    public String toString() {
        return " Это класс: Dog наследуемый от класса -" + super.toString();
    }
}
