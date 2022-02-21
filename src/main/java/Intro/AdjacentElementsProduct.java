package Intro;

public class AdjacentElementsProduct {
    int solution(int[] inputArray) {
        int result = inputArray[1] * inputArray[0];
        for (int i = 2; i < inputArray.length; i++) {
            result = Integer.max(result, inputArray[i] * inputArray[i-1]);
        }
        return result;
    }
}
