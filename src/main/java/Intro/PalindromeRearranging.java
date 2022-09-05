package Intro;

import java.util.HashSet;

public class PalindromeRearranging {

    boolean solution(String inputString) {
        HashSet<Character> lettered= new HashSet<>();
        for (char letter : inputString.toCharArray()) {
            if (!lettered.contains(letter)) {
                lettered.add(letter);
            } else {
                lettered.remove(letter);
            }
        }
        return lettered.size() < 2;
    }

}
