package HashMap;

import javax.swing.*;
import java.util.*;

public class Main {
    public static void main (String[] args) {



        // task
        String word = "HELLO,Ö";
        Map<Character, Integer> map = new HashMap<>();

        map.put('A', 1);
        map.put('B', 3);
        map.put('C', 3);
        map.put('D', 2);
        map.put('E', 1);
        map.put('F', 4);
        map.put('G', 2);
        map.put('H', 4);
        map.put('I', 1);
        map.put('J', 8);
        map.put('K', 5);
        map.put('L', 1);
        map.put('M', 3);
        map.put('N', 1);
        map.put('O', 1);
        map.put('P', 3);
        map.put('Q', 10);
        map.put('R', 1);
        map.put('S', 1);
        map.put('T', 1);
        map.put('U', 1);
        map.put('V', 4);
        map.put('W', 4);
        map.put('X', 8);
        map.put('Y', 4);
        map.put('Z', 10);

        int sum = 0;
        for(int i = 0; i < word.length(); i++) {
            try {
                sum += map.get(word.charAt(i));
            } catch (NullPointerException ignore) {

            }

//            if(Character.isAlphabetic(word.charAt(i))) {
//               sum += map.getOrDefault(word.charAt(i), 0);
//            }
        }

//        System.out.println(sum);

//        char a = ',';
//
//        if(a )

        //task 1
        String [] words ="abc abcde abcdef abcdefg abc abc nunquers nunabcdedg abcde abcde abc fuel fuel fueal man men".split(" ");
        Map<String, Integer> hashMap = new HashMap<>();
        for(int i = 0; i < words.length; i++) {
            if (hashMap.containsKey(words[i])) {
                hashMap.put(words[i], hashMap.get(words[i]) + 1);
            } else {
                hashMap.put(words[i], 1);
            }
        }
//        System.out.println(hashMap);
//
        Map<String, Integer> hashMap1 = new LinkedHashMap<>();

        List<String> key = new ArrayList<>();
        for(String string : hashMap.keySet()) {
            key.add(string);
        }

        List<Integer> values = new ArrayList<>();
        for(Integer integer : hashMap.values()) {
            values.add(integer);
        }
        Collections.reverse(key);
        Collections.reverse(values);

        for(int i = 0; i < values.size(); i++) {
            hashMap1.put(key.get(i),values.get(i));
        }

        System.out.println(hashMap1);
        //task 2
//        String [] w ="abc abcde abcdef abcdefg abc abc nunquers nunabcdedg abcde abcde abc fuel fuel fueal man men".split(" ");
//        Map<String, Integer> hMap = new HashMap<>();
//        for(int i = 0; i < w.length; i++) {
//            if (hashMap.containsKey(w[i])) {
//                hMap.put(w[i], hMap.get(w[i]) + 1);
//            } else {
//                hMap.put(w[i], 1);
//            }
//        }
//
//        System.out.println(hMap);

        //task 3
//        Map<Integer , Integer> numbers = new HashMap<>();
//        int result = 1;
//        numbers.put(1 , 14);
//        numbers.put(2 , 16);
//        numbers.put(3 , 27);
//        numbers.put(4 , 124);
//        numbers.put(5 , 13);
//
//        for(Integer integer : numbers.values()) {
//            result *= integer;
//        }
//
//        System.out.println(result);

        //task 4
//        Map<Integer, Integer> numbers = new HashMap<>();
//
//        for(int i = 1; i < 11 ; i++) {
//            numbers.put(i, i * i);
//        }
//
//        System.out.println(numbers);
        //task 5

//        ArrayList<String> list = new ArrayList<>();
//        ArrayList<String> list1 = new ArrayList<>();
//
//        list.add("Первый");
//        list.add("Второй");
//        list.add("Третий");
//
//        list1.add("Одинадцатый");
//        list1.add("Двенадцатый");
//        list1.add("Тренадцатый");
//
//        Map<String, String> hashMap = new HashMap<>();
//
//        for(int i = 0; i < list.size(); i++) {
//            hashMap.put(list.get(i) , list1.get(i));
//        }
//
//        System.out.println(hashMap);

    }
    }
