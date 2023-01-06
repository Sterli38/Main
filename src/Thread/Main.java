package Thread;

public class Main {
    public static void main(String[] args) {
        ArraySearcher arraySearcher = new ArraySearcher();
        Timer timer = new Timer();
        int threadCount = 8;

//        timer.start();
//        arraySearcher.doWithSingleThreadMaxElement(new int[10]);
//        timer.stop();
//        System.out.println("Время выполнения однопоточного запуска для 10 элементов : " + timer.getTime());
//
//        timer.start();
//        arraySearcher.doWithSingleThreadMaxElement(new int[1000]);
//        timer.stop();
//        System.out.println("Время выполнения однопоточного запуска для 1000 элементов : " + timer.getTime());
//
//        timer.start();
//        arraySearcher.doWithSingleThreadMaxElement(new int[50000]);
//        timer.stop();
//        System.out.println("Время выполнения однопоточного запуска для 50000 элементов : " + timer.getTime());
//
//        timer.start();
//        arraySearcher.doWithSingleThreadMaxElement(new int[50000000]);
//        timer.stop();
//        System.out.println("Время выполнения однопоточного запуска для 50000000 элементов : " + timer.getTime());
//
//        timer.start();
//        arraySearcher.doWithMultithread(threadCount,new int[10]);
//        timer.stop();
//        System.out.println("Время выполнения многопоточного запуска для 10 элементов : " + timer.getTime());
//
//        timer.start();
//        arraySearcher.doWithMultithread(threadCount,new int[100]);
//        timer.stop();
//        System.out.println("Время выполнения многопоточного запуска для 1000 элементов : " + timer.getTime());
//
//        timer.start();
//        arraySearcher.doWithMultithread(threadCount,new int[50000]);
//        timer.stop();
//        System.out.println("Время выполнения многопоточного запуска для 50000 элементов : " + timer.getTime());

        for(int i = 1; i <= 20; i++) {
            timer.start();
            arraySearcher.doWithMultithread(i, new int[50000000]);
            timer.stop();
            System.out.println(i + " Время выполнения многопоточного запуска для 50000000 элементов : " + timer.getTime());
        }
    }
}


