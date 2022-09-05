package Intro;

import java.util.HashMap;

public class IsBeautifulString {

    boolean solution(String inputString) {
        HashMap<Integer, Integer> count = new HashMap<>();
        char[] isCharArr = inputString.toCharArray();
        int lastChar = 0;

        for (int ch : isCharArr) {
            if (count.containsKey(ch)) {
                int value = count.get(ch);
                count.put(ch, value+1);
            } else {
                count.put(ch, 1);
                if (ch > lastChar) lastChar = ch;
            }
        }

        int baseCount = count.getOrDefault(97, 0);
        for (int i = 98; i < lastChar+1; i++) {
            if (!count.containsKey(i)) return false;
            if (count.containsKey(i) && count.get(i) > baseCount) {
                return false;
            } else if (count.containsKey(i) && count.get(i) <= baseCount){
                baseCount = count.get(i);
            }
        }

        return true;

    }
}
