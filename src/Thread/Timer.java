package Thread;

public class Timer {
    private long start;
    private long finish;

    public void start() {
        start = System.currentTimeMillis();
    }

    public void stop() {
        finish = System.currentTimeMillis();
    }

    public long getTime() {
        if (finish == 0) {
            throw new RuntimeException("getTime started earlier than stop");
        }
        return finish - start;
    }
}
