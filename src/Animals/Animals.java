package Animals;

public class Animals {
    private final String name;
    private int age;
    private int weight;

    public Animals(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public static void run() {
        System.out.println("бегу , бегу , бегу");
    }
}
