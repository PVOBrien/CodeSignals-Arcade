package TheCore.MirrorLake;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StringsConstruction {
    int solution(String a, String b) {

        Stream<Character> charStream = IntStream
                .range(0, a.length())
                .mapToObj(a::charAt);
        List<Character> aList = charStream.collect(Collectors.toList());
        HashMap<Character, Integer> aHashSet = new HashMap<>();

        for (Character c : aList) {
            aHashSet.computeIfPresent(c, (k, v) -> v + 1);
            aHashSet.putIfAbsent(c, 1);
        }

        int[] charArray = new int[26];
        for (int i = 0; i < b.length(); i++) {
            int theLetterNumber = b.charAt(i)-97;
            char theLetter = b.charAt(i);
            charArray[theLetterNumber] = aHashSet.containsKey(theLetter)
                    ? charArray[theLetterNumber] + 1
                    : charArray[theLetterNumber];
        }

        for (Map.Entry<Character, Integer> set: aHashSet.entrySet()) {
            if (charArray[set.getKey()-97] == 0 || charArray[set.getKey()-97]/set.getValue() == 0) return 0;
            charArray[set.getKey()-97] = charArray[set.getKey()-97]/set.getValue();
        }
        return Arrays.stream(charArray).filter(i -> i > 0).min().orElse(0);
    }
}