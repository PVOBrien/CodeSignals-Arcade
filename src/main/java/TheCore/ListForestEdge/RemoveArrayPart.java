package TheCore.ListForestEdge;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class RemoveArrayPart {

    int[] solution(int[] inputArray, int l, int r) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < inputArray.length; i++) {
            if (i < l || i > r) result.add(inputArray[i]);
        }

        return result.stream().mapToInt(i -> i).toArray();
    }

// HOW TO ITERATE THROUGH ARRAY with i (as in index)!!!
int[] solutionStream(int[] inputArray, int l, int r) {
    return IntStream.range(0, inputArray.length)
        .filter(i -> i < l || i > r)
        .map(i -> inputArray[i])
        .toArray();
}


}
