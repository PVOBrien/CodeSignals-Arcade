package Intro;

public class ArrayChange {

    int solution(int[] inputArray) {
        int movesCount = 0;
        for (int i = 1; i < inputArray.length; i++ ) {
            if (inputArray[i] <= inputArray[i-1]) {
                int moves = (inputArray[i-1] - inputArray[i]) + 1;
                inputArray[i] += moves;
                movesCount += moves;
            }
        }
        return movesCount;
    }
}
