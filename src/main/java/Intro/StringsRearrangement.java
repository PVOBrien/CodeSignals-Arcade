package Intro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class StringsRearrangement {

    boolean solution(String[] inputArray) {
        int[] charNum = new int[inputArray.length];
        HashMap<Integer, Integer> smash = new HashMap<>();
        int i = 0;
        for (String s: inputArray) {
            charNum[i] = s.chars().sum();
            if (smash.containsKey(charNum[i])) return false;
            smash.put(charNum[i], i);
            i++;
        }

        ArrayList<Integer> sortedSmash = new ArrayList<>(smash.keySet());
        Collections.sort(sortedSmash);

        for (int k = 0; k < inputArray.length - 1; k++) {
            Integer retrievalKeyFirst = smash.get(sortedSmash.get(k));
            Integer retrievalKeySecond = smash.get(sortedSmash.get(k+1));
            String first = inputArray[retrievalKeyFirst];
            String second = inputArray[retrievalKeySecond];
            boolean oneFlag = false;

            for (int l = 0; l < first.length(); l++) {
                boolean b = first.charAt(l) != second.charAt(l);
                if (b && oneFlag) {
                    return false;
                }
                if (b) {
                    oneFlag = true;
                }
            }
        }
        return true;
    }
}
