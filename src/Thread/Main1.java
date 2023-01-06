package Thread;

public class Main1 {
    public static void main(String[] args) {
        for(int i = 0; i < 1; i++) {
            new KillerThread().start();
        }
    }
}
