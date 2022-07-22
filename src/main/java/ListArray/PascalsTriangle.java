package ListArray;

import java.util.*;

public class PascalsTriangle {
    public static void main(String[] args) {
        System.out.println(pascal(5));
    }
    public static List<List<Integer>> pascal(int num) {
        List<List<Integer>> allList = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            list.add(0, 1);
            for(int j = 1; j < list.size() - 1; j++) {
                list.set(j, list.get(j) + list.get(j+1));
            }
            allList.add(new ArrayList<>(list));
        }
        return allList;
    }
}
