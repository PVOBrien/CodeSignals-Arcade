package Intro;

import java.util.HashSet;

public class DifferentSquares {

    int solution(int[][] matrix) {

        HashSet<String> hSet = new HashSet<>();

        for (int i = 0; i < matrix.length-1; i++) {
            for (int j = 0; j < matrix[i].length-1; j++) {
                final String fourSet = String.valueOf(matrix[i][j]) +
                        matrix[i][j + 1] +
                        matrix[i + 1][j] +
                        matrix[i + 1][j + 1];
                hSet.add(fourSet);
            }
        }

        return hSet.size();
    }

}
