package Queue;

public interface ApplicationSettings {
    double ppri = 1; // Вероятность добавления человека в очередь
    double pwindow = 0.1; // Вероятность освобождения человека в окно
    int amountWindows = 2; // Колличество окон
}
