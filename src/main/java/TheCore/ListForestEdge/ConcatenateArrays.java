package TheCore.ListForestEdge;

public class ConcatenateArrays {

    int[] solution(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];

        for (int i = 0; i < a.length; i++) { // I know that System.arraycopy exists now, see below. Leaving it in as a reference lesson.
            result[i] = a[i];
        }

        for (int i = a.length; i < result.length; i++) {
            result[i] = b[i - a.length];
        }

        return result;
    }

    int[] solutionSaC(int[] a, int[] b) {
        int[] out = new int[a.length + b.length];
        System.arraycopy(a, 0, out, 0, a.length);
        System.arraycopy(b, 0, out, a.length, b.length);
        return out;
    }
}