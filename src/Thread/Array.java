package Thread;

public class Array {
    private final int[] array;

    public Array(int[] array) {
        this.array = array;
    }

    public int get(int index) {
        try {
            Thread.sleep(0);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return array[index];
    }

    public int getLength() {
        return array.length;
    }

//    public boolean doWithSingleThread(int a) {
//        for(int i = 0; i < array.length; i++) {
//            if(array[i] == a) {
//                return true;
//            }
//        }
//        return false;
//    }
}
