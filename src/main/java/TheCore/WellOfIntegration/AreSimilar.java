package TheCore.WellOfIntegration;

public class AreSimilar {
    public boolean solution(int[] a, int[] b) {
        boolean isOff = false;
        int offA = -1,
                offB = -1,
                offCount = 0;
        for (int i = 0; i < a.length; i++) {
            if (isOff && a[i] != b[i]) {
                if (a[i] == offB && b[i] == offA) {
                    isOff = false;
                    i++;
                    if (i >= a.length) return true;
                } else {
                    return false;
                }
            }

            if (a[i] != b[i] && !isOff) {
                if (offCount == 1) return false;
                isOff = true;
                offA = a[i];
                offB = b[i];
                offCount++;
            }
        }
        return !isOff;
    }
}
