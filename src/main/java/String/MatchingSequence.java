package String;

import java.util.HashMap;
import java.util.Map;

public class MatchingSequence {
    public static void main(String[] args) {
        System.out.println(sequence(new String[]{"a", "bb", "acd", "ace"}));
    }

    private static int sequence(String[] words) {
        int count = 0;
        Map<String, Integer> map = new HashMap<>();
        for (String s : words) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        char[] ch = "abcde".toCharArray();

        for(String s : map.keySet()) {
            char[] temp = s.toCharArray();

            int i = 0;
            int j = 0;

            while(i < ch.length && j < temp.length) {
                if(ch[i] == temp[j]) {
                    i++;
                    j++;
                } else {
                    i++;
                }
            }
            if(j == temp.length) {
                count += map.get(s);
            }
        }
        return count;
    }
}
