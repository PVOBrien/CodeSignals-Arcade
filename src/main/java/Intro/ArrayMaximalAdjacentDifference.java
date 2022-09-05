package Intro;

public class ArrayMaximalAdjacentDifference {

    int solution(int[] arr) {
        int d = Math.abs(arr[1]-arr[0]);
        for (int i = 2; i < arr.length; i++) {
            d = Math.max(d, Math.abs(arr[i] - arr[i-1]));
        }
        return d;
    }

}
