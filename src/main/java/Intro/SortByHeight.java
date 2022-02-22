package Intro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortByHeight {

    int[] solution(int[] a) {
        List<Integer> heights = new ArrayList<>();
        for (int i: a) {
            if (i != -1) heights.add(i);
        }

        Collections.sort(heights);

        for (int i = 0; i < a.length; i++) {
            if (a[i] != -1 ) {
                a[i] = heights.get(0);
                heights.remove(0);
            }
        }

        return a;
    }
}
