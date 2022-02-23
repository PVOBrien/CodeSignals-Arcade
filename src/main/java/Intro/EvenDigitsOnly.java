package Intro;

public class EvenDigitsOnly {

    boolean solution(int n) {
        String[] stringArr = Integer.toString(n).split("");
        for (int i = 0; i < stringArr.length; i++) {
            if (Integer.parseInt(stringArr[i]) % 2 == 1) return false;
        }
        return true;
    }

}
