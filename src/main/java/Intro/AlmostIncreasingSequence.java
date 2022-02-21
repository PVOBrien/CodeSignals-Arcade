package Intro;

import java.util.Arrays;

public class AlmostIncreasingSequence {

    boolean solution(int[] sequence) {
        boolean isPulled = false;
        int slowT = 0;
        int fastTStart = 1;

        if (sequence[fastTStart] <= sequence[slowT]) {
            isPulled = true;
            slowT++;
            fastTStart++;
        }

        int floor = sequence[slowT] - 1;

        for (int fastT = fastTStart; fastT < sequence.length; fastT++) {

            if (fastT == sequence.length-1 && !isPulled) return true;
            if (sequence[fastT] <= sequence[slowT] && isPulled) return false;

            if (sequence[fastT] <= floor && !isPulled) {
                isPulled = true;
                if (sequence[fastT] > sequence[fastT-2] || sequence[fastT+1] > sequence[fastT-1]) {
                    slowT = fastT;
                    if (helperThru(Arrays.copyOfRange(sequence, fastT, sequence.length), sequence[fastT]) ||
                            helperThru(Arrays.copyOfRange(sequence, fastT - 1, sequence.length), sequence[fastT - 1])) {
                        return true;
                    }
                }
                else {
                    return false;
                }
            } else {
                floor = sequence[fastT];
                slowT++;
            }
        }
        return true;
    }

    private boolean helperThru(int[] seq, int starter) {
        for (int i = 0; i < seq.length; i++) {
            if (seq[i] >= starter) {
                return false;
            } else {
                starter = seq[i];
            }
        }
        return true;
    }

    boolean betterSolution(int[] sequence) {
        int numErr = 0; // how many were skipped. "in isolation" eg it was able to continue as there was a way to only skip 1 number in this instance.
        for (int i = 0; i < sequence.length - 1; i++) { // standard for loop. needs the index. decides to start at 0, "cut off" last index for loop condition.
            if (sequence[i] - sequence[i+1] >= 0) { // if there IS a skip to occur "ahead" because greater - lesser = positive diff.
                numErr += 1; // record initial error
                if (i - 1 >= 0 && i + 2 <= sequence.length - 1 // ensure there is array to check
                        && sequence[i] - sequence[i+2] >= 0 // is there an additional positive difference ahead?
                        && sequence[i-1] - sequence[i+1] >= 0) { // is there an additional positive difference behind?
                    return false; // if so, there are two jumps necessary, and so FALSE.
                }
            }
        }

        return numErr <= 1; // are there more than one discreet errors? if so FALSE else TRUE;
    }
}
