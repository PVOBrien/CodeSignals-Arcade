package Intro;

import java.util.Arrays;

public class MatrixElementsSum {

    int solution(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            if (i == 0) {
                sum += Arrays.stream(matrix[i]).sum();
            } else {
                int[] inArr = matrix[i];
                for (int j = 0; j < inArr.length; j ++) {
                    if (matrix[i-1][j] == 0) {
                        inArr[j] = 0;
                    }
                }
                sum += Arrays.stream(inArr).sum();
            }
        }
        return sum;
    }

    int solutionBetter(int[][] matrix) { // https://app.codesignal.com/arcade/intro/level-2/xskq4ZxLyqQMCLshr/solutions?solutionId=Np7rjJuXJu9tAKagG
        int s = 0;
        for (int c = 0; c < matrix[0].length; ++c) // c = column
            for (int r = 0; r < matrix.length; ++r) { // r = row
                if (matrix[r][c] > 0) { // if the column is greater than 0...
                    System.out.println(matrix[r][c]);
                    s+=matrix[r][c]; // count it!
                } // otherwise...
                else break; // rows dead.
            }
        return s;
    }
}
