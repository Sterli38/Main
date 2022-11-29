package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(123);
        list.add(345);
        list.add(466);
        long count = list.stream()
                .filter(i -> i % 2 == 0)
                .count();
        System.out.println(count);

        int[] array = new int[]{};
        int[] newArray = Arrays.stream(array)
                .sorted()
                .toArray();
        System.out.println(Arrays.toString(newArray));

        Arrays.stream(array)
                .dropWhile(i -> i % 2 == 0)
                .forEach(i -> System.out.println(i));

        int[] newArray1 = Arrays.stream(array)
                .distinct()
                .toArray();
        System.out.println(Arrays.toString(newArray1));

        Arrays.stream(array)
                .limit(10)
                .forEach(i -> System.out.println(i));

//        long a = Arrays.stream(array)
//                .filter(i -> i >= 100 && i < 1000)
//                .count();

//        if (a > 0) {
//            System.out.println("Yes");
//        } else {
//            System.out.println("No");
//        }
//        System.out.println(a);

        List<Integer> list1 = new ArrayList<>();
        for(int i = 0; i < 50000000; i++) {
            list.add(i);
        }

        long a1 = System.currentTimeMillis();
        list.stream()
                .filter(i -> i % 2 == 0)
                .count();
        long a2 = System.currentTimeMillis();
        System.out.println(a2 - a1);

    }
}
