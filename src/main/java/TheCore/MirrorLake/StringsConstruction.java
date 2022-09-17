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

        HashMap<Character, Integer> testSet = new HashMap<>(aHashSet); // make a copy of the hashmap, not a reference to the original
        for (int i = 0; i < b.length(); i++) { // need to substring to the length of String a and then run this.
            char theLetter = b.charAt(i);
            if (testSet.containsKey(theLetter)) {
                endCount = isMatch(b.subSequence(i, i + a.length()), testSet)
                        ? endCount + 1
                        : endCount;
            }
            testSet = new HashMap<>(aHashSet); // reset the set
        }
        return endCount;
    }
    boolean isMatch(CharSequence subS, HashMap<Character, Integer> testSet) {
        for (int i = 0; i < subS.length(); i++) {
            char theChar = subS.charAt(i);
            if (testSet.containsKey(theChar)) {
                if (testSet.get(theChar) == 1) {
                    testSet.remove(theChar);
                } else {
                    testSet.computeIfPresent(theChar, (k, v) -> v - 1);
                }
            }
        }
        return testSet.size() == 0;
    }
}