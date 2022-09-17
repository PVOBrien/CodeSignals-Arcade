package TheCore.MirrorLake;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StringsConstruction {

    int solution(String a, String b) {
        int endCount = 0;

        Stream<Character> charStream = IntStream // https://stackoverflow.com/questions/15590675/converting-char-array-to-list-in-java
                .range(0, a.length())
                .mapToObj(a::charAt);

        List<Character> aList = charStream.collect(Collectors.toList());
        HashMap<Character, Integer> aHashSet = new HashMap<>(); // needs to be a hashmap of letter and count

        for (Character c : aList) {
            aHashSet.computeIfPresent(c, (k, v) -> v + 1);
            aHashSet.putIfAbsent(c, 1);
        }
        HashMap<Character, Integer> testSet = new HashMap<>(aHashSet);

        for (int i = 0; i < b.length(); i++) { // need to substring to the length of String a and then run this.
            char theLetter = b.charAt(i);
            if (testSet.containsKey(theLetter)) {
                if (testSet.get(theLetter) == 1) {
                    testSet.remove(theLetter);
                } else {
                    testSet.computeIfPresent(theLetter, (k, v) -> v - 1);
                }
            } else {
                testSet = new HashMap<>(aHashSet);
            }

            if (testSet.size() == 0) {
                endCount++;
                testSet = new HashMap<>(aHashSet);
            }
        }
        return endCount;
    }
}