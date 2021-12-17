package test.lesson2;

import java.util.*;

public class TestLesson2 {
    public static void main(String[] args) {
        int[] num = new int[3];
        num[0] = 5;
        num[1] = 6;
        num[2] = 2;
        System.out.println(num[0]);




        List<String> list = new ArrayList<>();
        list.add("str");
        list.add("str");
        list.add("str1");
        list.add("str1");
        list.add("str1");
        list.add("str1");
        list.add("str1");
        list.add("str1");
        System.out.println("List: " + list);

        Set<Integer> set = new HashSet<>();
        set.add(4);
        set.add(1);
        set.add(1);
        System.out.println("Set: " + set);


        Map<Integer, String> map = new HashMap<>();
        map.put(0, "value1");
        map.put(4, "value1");
        map.put(5, "value3");
        map.put(5, "value4");
        System.out.println("Map: " + map);
    }
}
