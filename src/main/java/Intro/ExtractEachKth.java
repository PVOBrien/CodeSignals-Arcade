package Intro;

import java.util.ArrayList;
import java.util.List;

public class ExtractEachKth {

    int[] solution(int[] inputArray, int k) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < inputArray.length; i++) {
            if ((i+1) % k != 0) list.add(inputArray[i]);
        }

        return list.stream().mapToInt(i -> i).toArray();
    }
}