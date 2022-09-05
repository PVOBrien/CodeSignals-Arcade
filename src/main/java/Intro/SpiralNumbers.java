package Intro;

public class SpiralNumbers {

    int[][] solution(int n) { // // https://app.codesignal.com/arcade/intro/level-12/uRWu6K8E7uLi3Qtvx/solutions?solutionId=feEzAbpBdE4XdvrG2

        int[][] result = new int[n][n];

        int left = 0;
        int right = n-1;
        int top = 0;
        int bottom = n-1;

        // while (counter < n*n + 1) {
        for (int counter = 1; counter <= n*n;) {
            // TopL - TopR
            for (int x = left; x <= right; x++) {
                result[top][x] = counter++;
            }
            top++;

            // TopR - BottomR
            for (int y = top; y <= bottom; y++) {
                result[y][right] = counter++;
            }
            right--;
            //BottomR - BottomL
            for (int x = right; x >= left; x--) {
                result[bottom][x] = counter++;
            }
            bottom--;

            // BottomL - TopL
            for (int y = bottom; y >= top; y--) {
                result[y][left] = counter++;
            }
            left++;

        }
        return result;
    }
}
