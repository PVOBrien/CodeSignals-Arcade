package TheCore.WellOfIntegration;

import java.util.Arrays;

public class SwitchLights { // todo: research https://app.codesignal.com/arcade/code-arcade/well-of-integration/x3ix7CY93z2bwKDtG/solutions?solutionId=egy3Qsv2YxsLZ666r

    int[] solution(int[] a) {

        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1) {
                int[] copyArr = Arrays.copyOf(a, i+1);
                copyArr = litSwitch(copyArr);
                System.arraycopy(copyArr, 0, a, 0, i+1);
            }
        }
        return a;
    }

    private int[] litSwitch(int[] swap) {
        System.out.println("Before: " + Arrays.toString(swap));
        for (int i = 0; i < swap.length; i++) {
            if (swap[i] == 0) {
                swap[i] = 1;
            } else {
                swap[i] = 0;
            }
        }
        return swap;
    }
}
