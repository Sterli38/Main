package Queue;

public class QueueSimulator {

    public void simulate() {
        Queue queue = new Queue();
        Windows windows = new Windows();
        while(true) {
            if(Math.random() < ApplicationSettings.ppri) {
                    queue.add(new Human());
            }
            if(Math.random() < ApplicationSettings.pwindow) {
                    windows.free();
            }
            if(windows.hasEmpty()) {
                if(queue.size() > 0 ) {
                    Human human = queue.get();
                    windows.add(human); // Если окно пустое , и очередь > 0, то присваиваем объект очереди объекту Human и добавляем объект в окно
                }
            }
            windows.print();
            System.out.println("Размер очереди: " + queue.size());
            System.out.println("\n");
            try {
                Thread.sleep(1500);
            } catch(InterruptedException ignore) {

            }
        }
    }
}
