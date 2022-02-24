package Intro;

public class DigitDegree {

    int solution(int n) { return digitDegreeHelp(0, n); }

    private int digitDegreeHelp(int times, int digits) {
        if (digits < 10) return times; // base case
        times++;

        String dString = Integer.toString(digits);
        int sum = 0;
        for (char ch : dString.toCharArray()) {
            sum += Integer.parseInt(Character.toString(ch));
        }
        return digitDegreeHelp(times, sum);
    }
}
