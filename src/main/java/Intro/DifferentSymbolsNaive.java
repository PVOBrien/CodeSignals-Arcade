package Intro;

import java.util.HashSet;

public class DifferentSymbolsNaive {

    int solution(String s) {

        HashSet<Character> hashSet = new HashSet<>();
        for (char ch : s.toCharArray()) {
            hashSet.add(ch);
        }
        return hashSet.size();

    }
}
