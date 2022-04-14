package TheCore.ListForestEdge;

public class FirstReverseTry {

    int[] solution(int[] arr) {
        if (arr.length == 0) return arr;

        int heldVal = arr[0];
        arr[0] = arr[arr.length-1];
        arr[arr.length-1] = heldVal;

        return arr;
    }

}
