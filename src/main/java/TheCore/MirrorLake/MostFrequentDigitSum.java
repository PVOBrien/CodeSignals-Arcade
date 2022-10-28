package TheCore.MirrorLake;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class MostFrequentDigitSum {
    int solution(int n) {
        if (n == 0) return 0;
        HashMap<Integer, Integer> sumSet = new HashMap<>();
        int nEnd = n;

        while (n > 0) {
            int nSum = 0;
            while (n > 0) {
                nSum += n % 10;
                n /= 10;
            }
            sumSet.computeIfPresent(nSum, (k, v) -> v + 1) ;
            sumSet.putIfAbsent(nSum, 1);
            nEnd -= nSum;
            n = nEnd;
        }

        Stream<Map.Entry<Integer, Integer>> sortedStream = sumSet.entrySet()
                        .stream()
                        .sorted(Map.Entry.comparingByValue());

        Stream<Map.Entry<Integer, Integer>> anotherStream = sumSet.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue());

        int test = Math.toIntExact(anotherStream.count() - 1);
        System.out.println("tst: " + test);
        return sortedStream.skip(1).findFirst().map(Map.Entry::getKey).orElse(0);
    }

    int correctSolution(int n) {
        if (n == 0) return 0;
        HashMap<Integer, Integer> sumSet = new HashMap<>();
        int nEnd = n;

        while (n > 0) {
            int nSum = 0;
            while (n > 0) {
                nSum += n % 10;
                n /= 10;
            }
            sumSet.computeIfPresent(nSum, (k, v) -> v + 1) ;
            sumSet.putIfAbsent(nSum, 1);
            nEnd -= nSum;
            n = nEnd;
        }

        int endKey = -1;
        int highValue = 0;

        for (Map.Entry<Integer, Integer> sets : sumSet.entrySet()) {
            if (sets.getValue() >= highValue) {
                System.out.println(sets);
                int newKey = sets.getKey();
                if (highValue == sets.getValue() && newKey > endKey) {
                    endKey = sets.getKey();
                } else {
                    endKey = newKey;
                }
                highValue = sets.getValue();
            }
        }

        return endKey;
    }

}
