package TheCore.MirrorLake;

import java.util.HashMap;

public class CreateAnagram {

    int solution(String s, String t) { // hashmap s, iterate through t to remove all hits, return remainder
        int result = 0;
        HashMap<Character, Integer> sHash = new HashMap<>();

        s.chars().forEach(c -> {
            sHash.computeIfPresent((char) c, (Character k, Integer v) -> v + 1);
            sHash.computeIfAbsent((char) c,v -> 1);
        });
        System.out.println(sHash);


        for (int i = 0; i < t.length(); i++) {
            char tChar = t.charAt(i);
            if (sHash.containsKey(tChar) && sHash.get(tChar) == 0) sHash.remove(tChar);
            sHash.computeIfPresent(tChar, (k, v) -> v - 1);
            if (!sHash.containsKey(tChar)) result++;
        }

        return result;
    }

/*    private int[] letterCount(String string) {
        int[] letterArr = new int[26];

        for (int i = 0; i < string.length(); i++) {
            System.out.println((int) string.charAt(i)-65);
            int letter = string.charAt(i)-65;
            letterArr[letter] += 1;
        }
        return letterArr;
    }
*/

}
