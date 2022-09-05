package Intro;

public class IsLucky {

    boolean solution(int n) {

        int half = Integer.toString(n).length()/2;
        String[] firstHalf = Integer.toString(n).subSequence(0, half).toString().split("");
        String[] secondHalf = Integer.toString(n).substring(half).split("");

        int firstHalfSum = 0;
        for (String s: firstHalf) { firstHalfSum += Integer.parseInt(s); }

        int secondHalfSum = 0;
        for (String s: secondHalf) { secondHalfSum += Integer.parseInt(s); }

        return firstHalfSum == secondHalfSum;
    }

}
