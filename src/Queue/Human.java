package Queue;

public class Human {
    private final long id = idGenerator++;
    private static long idGenerator = 1;

    public Human() {}

    public long getId() {
        return id;
    }

    @Override
    public String toString() {
        return
                "Номер: " + id
                ;
    }
}


