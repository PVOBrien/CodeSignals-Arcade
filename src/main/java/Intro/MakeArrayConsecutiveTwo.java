package Intro;

import java.util.Arrays;

public class MakeArrayConsecutiveTwo {

    int solution(int[] statues) {
        int totStatues = 0;
        Arrays.sort(statues);

        for (int i = 1; i < statues.length; i++) {
            totStatues += statues[i] - statues[i-1] - 1;
        }

        return totStatues;
    }

    int solutionBetter(int[] a) { // https://app.codesignal.com/arcade/intro/level-2/bq2XnSr5kbHqpHGJC/solutions?solutionId=Tu33H45ojPNYpRWHM
        Arrays.sort(a);
        int n = a[a.length-1] - a[0];
        return n - a.length + 1;
    }

}
