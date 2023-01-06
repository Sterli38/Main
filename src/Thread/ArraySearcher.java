package Thread;

public class ArraySearcher extends Thread {
    public int doWithSingleThreadMaxElement(int[] array) {
        Array array1 = new Array(array);
        int max = 0;
        for(int i = 0; i < array1.getLength(); i++) {
            if(array1.get(i) > max) {
                max = array1.get(i);
            }
        }
        return max;
    }

//    public boolean doWithSingleThreadFindElement(int[] array) {
//        int element = 0;
//        for(int i = 0; i < array.length; i++) {
//            if(array[i] == element) {
//                return true;
//            }
//        }
//        return false;
//    }


    public void doWithMultithread(int threadCount, int[] array) {
        if(array.length < threadCount) {
            throw new RuntimeException("Длина массива меньше количества потоков");
        }
        int step = array.length/threadCount;
        int currentIndex = 0;
        MyThread[] threads = new MyThread[threadCount];
        for(int i = 0; i < threadCount - 1; i++) {
            int startIndex = currentIndex;
            currentIndex+= step;
            int endIndex = currentIndex - 1;
            threads[i] = new MyThread(startIndex,endIndex, new Array(array));
        }
        int reside = array.length % threadCount;
        int startIndex = currentIndex;
        currentIndex = array.length - 1;
        int endIndex = currentIndex;
        threads[threadCount - 1] = new MyThread(startIndex, endIndex, new Array(array));

        for(int i = 0; i < threads.length; i++) {
            threads[i].start();
        }
        for(int i = 0; i < threads.length; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        int max = threads[0].getResult();
        for(int i = 0; i < threads.length; i++) {
            int result = threads[i].getResult();
            if(result > max) {
                max = result;
            }
        }

//        System.out.println(step);

//        for(int i = 0; i <= threadCount; i++) {
//        MyThread myThread = new MyThread(i);
//        myThread.start();
//            try {
//                myThread.join();
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
    }
}
