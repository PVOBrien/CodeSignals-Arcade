package TheCore.ListForestEdge;

public class IsSmooth {

    boolean solution(int[] arr) {
        int middle = arr.length % 2 == 1 ? arr[arr.length/2] : arr[arr.length/2] + (arr[arr.length/2-1]);
        return arr[0] == arr[arr.length - 1] && arr[0] == middle;
    }

}
