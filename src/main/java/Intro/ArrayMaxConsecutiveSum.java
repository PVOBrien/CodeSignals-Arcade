package Intro;

import java.util.Arrays;

public class ArrayMaxConsecutiveSum {

    int solution(int[] inputArray, int k) {
        int result = Integer.MIN_VALUE;
        for (int i = 0; i < inputArray.length-k + 1; i++) {
            int[] subArr = Arrays.copyOfRange(inputArray, i, i+k);
            result = Math.max(result, Arrays.stream(subArr).sum());
        }
        return result;
    }

}
