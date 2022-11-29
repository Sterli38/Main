package LinkedList;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Student st = new Student("Василий" , 3 );
        Student st1 = new Student("Мария" , 2);
        Student st2 = new Student("Алексей" , 1);
        Student st3 = new Student("Пётр" , 4);
        LinkedList<Student> students = new LinkedList<>();
        students.add(st);
        students.add(st1);
        students.add(st2);
        students.add(st3);
        //10, 16 , 17 Не получилось
        // Напишите программу на Java, чтобы добавить указанный элемент в конец связанного списка.
//        Student st5 = new Student("Ян", 3);
//        students.add(st5);
//        System.out.println(students);

        //2  Напишите Java-программу для перебора всех элементов в связанном списке.

//        for(Student student: students) {
//            System.out.println(student);
//        }

        //3 Напишите Java-программу для итерации по всем элементам в связанном списке, начиная с указанной позиции.
//        for(int i = 2; i < students.size(); i++) {
//            System.out.println(students.get(i));
//        }

        //4  Напишите Java-программу для итерации связанного списка в обратном порядке.
//       Collections.reverse(students);
//        System.out.println(students);

//        for(int i = students.size() - 1 ; i >= 0; i--) {
//            System.out.println(students.get(i));
//        }



//        5. Напишите Java-программу для вставки указанного элемента в указанную позицию в связанном списке.
//        Student st6 = new Student("Андрей" , 5 );
//        students.add(2,st6 );


//        6. Напишите программу на Java для вставки элементов в связанный список в первой и последней позиции.
//        Student st7 = new Student("Афанасий" , 1);
//        Student st8 = new Student("Марина" , 3);
//        students.addFirst(st7);
//        students.addLast(st8);
//      System.out.println(students);
//        7. Напишите Java-программу для вставки указанного элемента в начало связанного списка.
//        students.addFirst(st5);

//        8. Напишите Java-программу для вставки указанного элемента в конец связанного списка.
//        students.addLast(st3);
//        9. Напишите программу на Java для вставки некоторых элементов в указанной позиции в связанный список.
//        students.add(3,st6);
//        students.add(6,st1);

//        10. Напишите программу на Java, чтобы получить первое и последнее вхождение указанных элементов в связанный список.
        LinkedList<Integer> number = new LinkedList<>();
        number.add(4);
        number.add(5);
        number.add(6);
        number.add(7);
        number.add(8);
        number.add(5);
        number.add(7);
        int lastIndex = 0;
        int firstIndex = -1;
        int searchValue = 5;

        for(int i = 0; i < number.size(); i++) {
            if(number.get(i) == searchValue) {
                if(firstIndex == -1) {
                    firstIndex = i;
                }
                lastIndex = i;
            }
        }

        System.out.println(lastIndex);
        System.out.println(firstIndex);


//        11. Напишите Java-программу для отображения элементов и их позиций в связанном списке.
        List<String> fruit = new LinkedList<>();
        fruit.add("Абрикос");
        fruit.add("Мандарин");
        fruit.add("Яблоко");
        fruit.add("Банан");
        fruit.add("Манго");


        for(int i = 0; i < fruit.size(); i++) {
            System.out.println("Элемент : "+ fruit.get(i) + " позиция : " + i);
        }
//        12. Напишите Java-программу для удаления указанного элемента из связанного списка.
//        students.remove(st1);

//        13. Напишите программу на Java для удаления первого и последнего элемента из связанного списка.
//        students.removeFirst();
//        students.removeLast();

//        14. Напишите программу на Java, чтобы удалить все элементы из связанного списка.
//         students.clear();

//        15. Напишите программу на Java, которая поменяет два элемента в связанном списке.
        LinkedList<String> strings4 = new LinkedList<>();
        strings4.add("1");
        strings4.add("2");
        strings4.add("3");
        strings4.add("4");
        strings4.add("5");
//        System.out.println(strings4);
//        int index1 = 1;
//        int index2 = 4;
//        String a = strings4.get(index2);
//        strings4.set(index2,strings4.get(index1));
//        strings4.set(index1,a);
//        System.out.println(strings4);
//        16. Напишите программу на Java, чтобы перемешать элементы в связанном списке.
        for(int i = 0; i < strings4.size(); i++) {
           int startIndex = (int) ((Math.random() * ((strings4.size() - 1 - 0) + 1)) + 0);
           int endIndex = (int) ((Math.random() * ((strings4.size() -1 - 0) + 1)) + 0);
           String swap = strings4.get(startIndex);
           strings4.set(startIndex,strings4.get(endIndex));
           strings4.set(endIndex, swap);
        }
        System.out.println(strings4);


//        17. Напишите программу на Java, чтобы объединить два связанных списка. +++
        List<String> strings = new LinkedList<>();
        List<String> strings1 = new LinkedList<>();
        strings.add("Привет");
        strings.add("Здравствуйте");
        strings.add("Доброго времени суток");

        strings1.add("До свидания");
        strings1.add("До новых встреч");
        strings1.add("До завтра ");

        for(String string: strings1) {
            strings.add(string);
        }

        List<String> strings5 = new LinkedList<>();

        for(String string : strings) {
            strings5.add(string);
        }

        for(String string : strings1) {
            strings5.add(string);
        }


//         strings.addAll(strings1);
//         System.out.println(strings);
//        18. Напишите программу на Java, чтобы клонировать связанный список в другой связанный список.
//        LinkedList<Student> copyStrings = new LinkedList(students);
//        System.out.println(copyStrings);
//            System.out.println(students);
//            Student student = students.get(0);
//            student.setName("Александр");
//        System.out.println(copyStrings);
//        System.out.println(students);
//
//        for(Student students1 : students) {
//            System.out.println(students1.hashCode());
//        }
//
//        for(Student student1 : copyStrings) {
//            System.out.println(student1.hashCode());
//        }
//        19. Напишите Java-программу для удаления и возврата первого элемента связанного списка.
//        System.out.println(copyStrings.pollFirst());
//        System.out.println(copyStrings);
//        20. Напишите Java-программу для извлечения, но не удаления, первого элемента связанного списка.
//        copyStrings.peekFirst();
//        System.out.println(copyStrings);
//        21. Напишите Java-программу для извлечения, но не удаления, последнего элемента связанного списка.
//        copyStrings.peekLast();
//        22. Напишите программу на Java, чтобы проверить, существует ли определенный элемент в связанном списке.
        List<String> strings3 = new LinkedList<>();
        strings3.add("Первый");
        strings3.add("Второй");
        strings3.add("Третий");

        String search = "Третий";

        boolean contains = false;
        for(String string: strings3) {
            if(string.equals(search)) {
                contains = true;
                break;
            }
        }

        if(contains) {
            System.out.println("Существует");
        } else {
            System.out.println("Не существует");
        }
//        23. Напишите программу на Java для преобразования связанного списка в список массивов.
        List<String> list = new LinkedList<>();
        list.add("Первый");
        list.add("Второй");
        list.add("Третий");

        String [] arrayStrings = new String[list.size()];
        for(int i = 0; i < list.size(); i++ ) {
            arrayStrings[i] = list.get(i);
        }

        for(String string : arrayStrings) {
            System.out.println(string);
        }

//        for(int i = 0; i < arrayStrings.length; i ++) {
//            System.out.println(arrayStrings[i]);
//        }

//        24. Напишите программу на Java для сравнения двух связанных списков.
//        if(copyStrings.equals(strings)) {
//            System.out.println("Равны");
//        } else {
//            System.out.println("Не равны");
//        }
//        25. Напишите Java-программу для проверки того, что связанный список пуст или нет.

//        LinkedList<String> strings2 = new LinkedList<>();
//        if(strings2.isEmpty()){
//            System.out.println("Список пуст");
//        } else {
//            System.out.println("В списке есть элементы ");
//        }

//        if(students.isEmpty()) {
//            System.out.println("Список пуст");
//        } else {
//            System.out.println("В списке есть элементы");
//        }
//        26. Напишите программу на Java для замены элемента в связанном списке.
//        strings.set(3,"Доброй ночи");
//        System.out.println(strings);
    }
}
