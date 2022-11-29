package Queue;

import java.util.ArrayList;
import java.util.List;

public class Windows {
    private final List<Window> windows = new ArrayList<>(); // Список окон

    public Windows() { // Добавляет новый объект окна в список окон
        for (int i = 0; i < ApplicationSettings.amountWindows; i++) {
            windows.add(new Window());
        }
    }

    public List<Window> getWindows() { // Возвращает окна
        return windows;
    }

    public void print() {
        for(int i = 0; i < windows.size(); i++) {
            System.out.println(windows.get(i) + "\n");
        }
        System.out.println("----------------------");
    }

    public boolean hasEmpty() { // Проверяет наличие человека к окне
        for(Window window : windows) {
            if(window.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public void add(Human human) { // Добавляет человека в окно , если оно пустое
        for (Window window : windows) {
            if (window.isEmpty()) {
                window.setCurrentHuman(human);
                break;
            }
        }
    }

    public void free() { // Освобождение окна
        int Min = 0;
        int Max = windows.size() - 1;
        int random = Min + (int) (Math.random() * ((Max - Min) + 1));
        Window window = windows.get(random);
        if (window.isEmpty()) {
            for (int i = 0; i < windows.size(); i++) {
                window = windows.get(i);
                if (!window.isEmpty()) {
                    break;
                }
            }
        }
        window.setCurrentHuman(null);
    }
}
