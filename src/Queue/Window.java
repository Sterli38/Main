package Queue;

public class Window {
    private final int id = idGenerator++;
    private static int idGenerator = 1;
    private Human currentHuman; //Переменная хранит человека который обслуживается в окне(текущий человек)

    public void setCurrentHuman(Human currentHuman) { // Устанавливает *текущего человека*
        this.currentHuman = currentHuman;
    } // ???

    public Human getCurrentHuman() {
        return currentHuman;
    } // Возвращает *текущего человека* человека

    public boolean isEmpty() {
       return currentHuman == null;
    }

    public String Check() {
        if(currentHuman != null) {
            return " - Человек " + currentHuman;
        } else {
            return " - Свободно";
        }
    }

    @Override
    public String toString() {
        return "Окно номер: " + id + Check();
    }
}
