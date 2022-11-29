package HomeWork.P;

public class Cat extends Animal {

    public Cat(String name , int age) {
        super(name , age);

    }

    @Override
    public void voice() {
        System.out.println("Mau");
    }

    @Override
    public String toString() {
        return "Это класс: Cat наследуемый от класса -" + super.toString();
    }
}
