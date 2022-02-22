package Intro;

public class Minesweeper {

    int[][] solution(boolean[][] matrix) {
        int[][] result = new int[matrix.length][];

        for (int i = 0; i < matrix.length; i++) {
            int[] lineResult = new int[matrix[i].length];
            for (int j = 0; j < matrix[i].length; j++) {

                int mineCount = 0;
                int rowStart = -1;
                int rowRange = 2;
                //==============The *literal* edge cases==\\
                if (j == 0) {                             //
                    rowStart = 0;                         //
                }                                         //
                if (j == matrix[i].length-1) rowRange = 1;//
                //========================================//

                int lowerRowStart = rowStart;
                if (i > 0) {
                    for (; lowerRowStart < rowRange; lowerRowStart++) {
                        mineCount += matrix[i-1][j+lowerRowStart] ? 1 : 0;
                    }
                }

                if (j > 0) mineCount += matrix[i][j - 1] ? 1 : 0;
                if (j + 1 < matrix[i].length) mineCount += matrix[i][j + 1] ? 1 : 0;

                if (i + 1 < matrix.length) {
                    for (; rowStart < rowRange; rowStart++) {
                        mineCount += matrix[i+1][j+rowStart] ? 1 : 0;
                    }
                }
                lineResult[j] = mineCount;
            }
            result[i] = lineResult;
        }
        return result;
    }
}