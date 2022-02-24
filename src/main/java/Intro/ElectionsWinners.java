package Intro;

import java.util.Arrays;

public class ElectionsWinners {

    int solution(int[] votes, int k) {
        int max = Arrays.stream(votes).max().getAsInt();
        int runoff = 0;
        int newWinner = 0;

        for (int v : votes) {
            if (v + k > max) newWinner++;
            if (v + k == max)runoff++;
        }

        if (newWinner > 0) return newWinner;
        if (runoff > 1) return 0;
        return 1;

    }

}
