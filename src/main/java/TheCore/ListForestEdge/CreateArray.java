package TheCore.ListForestEdge;

public class CreateArray {

    int[] solution(int size) {
        int[] result =  new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = 1;
        }
        return result;
    }
}
/*
int[] solution(int size) {
    int[] a = new int[size];
    Arrays.fill(a,1);
    return a;
}
*/