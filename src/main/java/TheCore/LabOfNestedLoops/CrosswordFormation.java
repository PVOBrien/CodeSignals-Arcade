package TheCore.LabOfNestedLoops;

import java.util.HashMap;
import java.util.stream.IntStream;

public class CrosswordFormation {

    public int solution(String[] words) { // taken from https://app.codesignal.com/arcade/code-arcade/labyrinth-of-nested-loops/W5Sq7taLSzNHh8GiF/solutions?solutionId=bks4QSiZSKyGNRDe5 because I took a 3 month sabbatical, and I had little memory of my code. However, looking at their solution x mine, mine was close; "half way" - in the sense that I was getting half the words correctly, and I was aiming for a very similar solution, albeit where this one was going after every single permutation of the words together, I was trying to do a couple steps less brute force, by hashmapping them, then only going down a path if there was one available. Alas, didn't work out. This shall be a #whitewhale.

        int t = 0;
        for (int i = 0; i < words.length; i++)
            for (int j = 0; j < words.length; j++)
                for (int k = 0; k < words.length; k++)
                    for (int l = 0; l < words.length; l++)
                        if (i != j && i != k && i != l &&
                                j != k && j != l && k != l)
                            t+=check(words[i],words[j],words[k],words[l]);
        return t;
    }

    int check (String a, String b, String c, String d) {
        int t = 0;
        for (int a1 = 0; a1 < a.length(); a1++)
            for (int a2 = a1+2; a2 < a.length(); a2++)
                for (int b1 = 0; b1 < b.length(); b1++)
                    for (int b2 = b1+2; b2 < b.length(); b2++)
                        for (int c1 = 0; c1 < c.length(); c1++)
                            for (int d1 = 0; d1 < d.length(); d1++) {
                                int c2 = c1 + (a2-a1);
                                int d2 = d1 + (b2-b1);
                                if (c2 < c.length() && d2 < d.length()) {
                                    if (a.charAt(a1)==b.charAt(b1)
                                            && a.charAt(a2)==d.charAt(d1)
                                            && c.charAt(c1)==b.charAt(b2)
                                            && c.charAt(c2)==d.charAt(d2))
                                        t++;
                                }
                            }
        return t;
    }

/*    public int solution(String[] words) {
        int result = 0;

        HashMap<Integer, Character>[] wordMaps = new HashMap[words.length];
        for (int i = 0; i < words.length; i++) { // put words to HashMap for speed and ease.
            final String theWord = words[i];
            HashMap<Integer, Character> wordMap = new HashMap<>(); // not yet using this effectively.
            IntStream.range(0, words[i].length()).forEach(num -> wordMap.put(num, theWord.charAt(num)));
            wordMaps[i] = wordMap;
        }

        for (int i = 0; i < wordMaps.length; i++) { // TOPWORD
            for (int j = 0; j < wordMaps.length; j++) { // RIGHTWORD
                if (j != i) {
                    for (int rWLetter = 0; rWLetter < wordMaps[j].size(); rWLetter++) {
                        for (int tWLetter = 2; tWLetter < wordMaps[i].size(); tWLetter++) { // TopLetter
                            if (wordMaps[j].get(rWLetter).equals(wordMaps[i].get(tWLetter))) {
                                for (int l = 0; l < wordMaps.length; l++) { // BOTTOMWORD
                                    if (l != i && l != j) {
                                        for (int bWLetter = wordMaps[l].size() - 1; bWLetter > 1; bWLetter--) {
                                            for (int matchRWLetter = rWLetter + 2; matchRWLetter < wordMaps[j].size(); matchRWLetter++) {
                                                if (wordMaps[l].get(bWLetter).equals(wordMaps[j].get(matchRWLetter))) {
                                                    for (int m = 0; m < words.length; m++) {
                                                        if (m != i && m != j && m != l) { // LEFTWORD
                                                            boolean hit = finalCheck(tWLetter, wordMaps[i], wordMaps[l], bWLetter, wordMaps[m], matchRWLetter - rWLetter);
                                                            if (hit) {
                                                                result++;
                                                                System.out.println("hit", );
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return result;
    }

    public boolean finalCheck(int topWLetter, HashMap<Integer, Character> topWord, HashMap<Integer, Character> bottomWord, int bottomWLetter, HashMap leftWord, int wordSpaceDiff) {
        for (int countDown = 2; ; countDown++) { // going down topWord and bottomWord.
            if (topWLetter - countDown == -1 || bottomWLetter - countDown == -1) break;
            for (int leftWBottomL = wordSpaceDiff; leftWBottomL < leftWord.size(); leftWBottomL++) {  // tracking the letters of the left word
                if (leftWord.get(leftWBottomL).equals(bottomWord.get(bottomWLetter - countDown)) &&
                        leftWord.get(leftWBottomL - wordSpaceDiff).equals(topWord.get(bottomWLetter - countDown)))
                    return true;
            }
        }
        return false;
    } */
}