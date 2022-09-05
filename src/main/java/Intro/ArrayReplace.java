package Intro;

import java.util.Arrays;

public class ArrayReplace {

    int[] solution(int[] inputArray, int elemToReplace, int substitutionElem) {
        return Arrays.stream(inputArray)
                .map(i -> i == elemToReplace ? substitutionElem : i)
                .toArray();

    }
}
