package Intro;

public class CheckPalindrome {
    boolean solution(String inputString) {
        String[] sArr = inputString.split("");

        for (int i = 0; i < sArr.length/2; i++) {
            int lastI = (sArr.length-1)-i;
            if (!sArr[i].equals(sArr[lastI])) return false;
        }
        return true;
    }
}
