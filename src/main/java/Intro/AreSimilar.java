package Intro;

public class AreSimilar {

    boolean solution(int[] a, int[] b) {
        int swapCount = 0;
        for (int i = 0; i < a.length; i++) {

            if (i == a.length - 1 && a[i] != b[i]) return false;
            if (a[i] != b[i]) {
                boolean found = false;
                for (int j = i+1; j < a.length; j++) {
                    if (b[j] == a[i] && a[j] == b[i]) {

                        int temp = a[i];
                        a[i] = a[j];
                        a[j] = temp;

                        swapCount++;
                        break;
                    }
                    if (j == a.length-1 && !found) {
                        return false;
                    }
                }
            }
        }
        return swapCount < 2;
    }
}
