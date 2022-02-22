package Intro;

import java.util.HashMap;
import java.util.Map;

public class CommonCharacterCount {

    int solution(String s1, String s2) {
        HashMap<Character, Integer> hS1 = new HashMap<>();
        HashMap<Character, Integer> hS2 = new HashMap<>();

        int finalCount = 0;

        for (Character ch: s1.toCharArray()) {
            if (hS1.containsKey(ch)) {
                int num = hS1.get(ch) + 1;
                hS1.put(ch, num);
            }
            else {
                hS1.put(ch, 1);
            }
        }

        for (Character ch: s2.toCharArray()) {
            if (hS2.containsKey(ch)) {
                int num = hS2.get(ch) + 1;
                hS2.put(ch, ++num);
            }
            else {
                hS2.put(ch, 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : hS1.entrySet()) {
            if (hS2.containsKey(entry.getKey())) {
                int hS2Num = hS2.get(entry.getKey());
                finalCount += Math.min(entry.getValue(), hS2Num);
            }
        }

        return finalCount;
    }
}
