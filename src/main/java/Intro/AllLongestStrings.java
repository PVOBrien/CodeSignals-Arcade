package Intro;

import java.util.Arrays;

public class AllLongestStrings {

    String[] solution(String[] inputArray) {
        int greatest = 0;
        for (String i : inputArray) {
            greatest = Math.max(greatest, i.length());
        }

        final int fg = greatest;
        return Arrays.stream(inputArray)
                .filter(i -> i.length() == fg)
                .toArray(String[]::new);
    }

}
