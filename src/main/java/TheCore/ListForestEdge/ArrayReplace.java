package TheCore.ListForestEdge;

public class ArrayReplace {

    int[] solution(int[] inputArray, int elemToReplace, int substitutionElem) {
        int[] result = new int[inputArray.length];

        for (int i = 0; i < result.length; i++) {
            if (inputArray[i] == elemToReplace) {
                result[i] = substitutionElem;
            } else {
                result[i] = inputArray[i];
            }
        }
        return result;
    }
}

/*
int[] solution(int[] inputArray, int elemToReplace, int substitutionElem) {
    return Arrays.stream(inputArray).map(i->i==elemToReplace?substitutionElem:i).toArray();}
*/