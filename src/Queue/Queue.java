package Queue;

import java.util.ArrayList;
import java.util.List;

public class Queue {
   private final List<Human> queue = new ArrayList<>();// Очередь

   public Human get() {
       return queue.remove(0);
   }// Удаляет и возвращает человека из очереди

   public void add(Human human) {
       queue.add(human);
   } // Добавляет человека в очередь

   public boolean isEmpty() {
       return queue.isEmpty();
   }// Проверяет пустая ли очередь

   public int size() {
       return queue.size();
   }// Возвращает размер очереди

    @Override
    public String toString() {
        return "Queue{" +
                "queue=" + queue +
                '}';
    }
}


