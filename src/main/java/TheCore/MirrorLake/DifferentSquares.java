package TheCore.MirrorLake;

import java.util.HashSet;
import java.util.Set;

public class DifferentSquares {
    int solution(int[][] matrix) {

        Set<String> combos = new HashSet<>(); // TODO: not right. should be Set<int[][]>
        for (int i = 0; i < matrix.length; i++) {
            int[] thisLine = matrix[i];
            for (int j = 0; j < matrix[i].length; j++) {

                if (j-1 > -1) { // just the line
                    String result = String.valueOf(thisLine[j-1]) + thisLine[j];
                    combos.add(result);
                }

                if (i-1 > -1) { // looking up.
                    int[] previousLine = matrix[i-1];
                    String result = String.valueOf(previousLine[j]) + thisLine[j];
                    combos.add(result);
                }
            }
        }
        return combos.size();
    }
}
