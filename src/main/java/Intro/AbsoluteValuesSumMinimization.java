package Intro;

public class AbsoluteValuesSumMinimization {

    int solution(int[] a) {
        int iHeld = Integer.MAX_VALUE;
        int countHeld = 0;

        for (int i = 0; i < a.length; i++) {
            int second = a[i], currentCount = 0;

            for (int j = 0; j < a.length; j++) {
                int first = a[j];
                currentCount += Math.abs(first - second);
            }
            iHeld = currentCount < countHeld ? a[i] : Math.min(iHeld, a[i]);
            countHeld = currentCount;
        }

        return iHeld;
    }

}
