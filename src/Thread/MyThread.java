package Thread;

public class MyThread extends Thread {
    private final int startIndex;
    private final int endIndex;
    private final Array array;
    private int result;
    public MyThread(int startIndex, int endIndex, Array array) {
        this.startIndex = startIndex;
        this.endIndex = endIndex;
        this.array = array;
    }

    public void run() {
        for(int i = startIndex; i <= endIndex; i++) {
            int element = array.get(i);
            if(element > result) {
                result = element;
            }
        }
    }

    public int getResult() {
        return result;
    }
}
