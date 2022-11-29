package HomeWork.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Добро пожаловать !");
//        printMenu();
        Scanner scanner = new Scanner(System.in);
        int command = 0;

        while(true) {
            printMenu();
            try {
                command = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException ex) {
                System.out.println("Вы ввели буквенное , введите цифру");
            }
        }
//        examination(scanner);

        while (true){
            if (command == 1) {
                System.out.println("Это команда под номером 1");
                break;
            } else if (command == 2) {

                System.out.println("Это команда под номером 2");
                break;
            } else if (command == 3) {

                System.out.println("Это команда под номером 3");
                break;
            } else if (command == 4) {
                System.out.println("Это команда под номером 4");
                break;
//                examination(command, scanner);
            } else if (command == 5) {
                System.out.println("До свидания");
                break;
            } else {
                System.out.println("Такой команды пока что нет ! \nВыберите команду из списка :");
                break;
            }
        }
    }

//    public static void examination(Scanner scanner) {
//        int command;
//        try {
//           command = scanner.nextInt();
//        } catch (InputMismatchException ex) {
//            System.out.println("Вы ввели буквенное , введите цифру");
//        }finally {
//            printMenu();
//        }
//    }

    public static void printMenu () {
        System.out.println();
        System.out.println("Что вы хотите сделать ?");
        System.out.println("1 - Заполнить массив чисел");
        System.out.println("2 - Заполнить массив слов");
        System.out.println("3 - Вывести массив чисел");
        System.out.println("4 - Вывести массив слов");
        System.out.println("5 - Выход");
    }
}
