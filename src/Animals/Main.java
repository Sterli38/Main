package Animals;

public class Main {
    public static void main(String[] args) {
Animals cat = new Animals("Мурзик");
Animals dog  = new Animals("Шарик");
Person alex = new Person("Алексей", 28);
cat.setWeight(10);
dog.setWeight(15);
System.out.println("Пёс " + dog.getName() + " весит " + dog.getWeight() + "\nА кот " + cat.getName() + " весит " + cat.getWeight());
        }
    }
