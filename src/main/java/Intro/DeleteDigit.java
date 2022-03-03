package Intro;

public class DeleteDigit {

    int solution(int n) {
        int solution = Integer.MIN_VALUE;
        for (int i = 0; i < Integer.toString(n).length(); i++) {
            StringBuilder intSolution = new StringBuilder().append(n);
            solution = Math.max(Integer.parseInt(intSolution.replace(i, i+1, "").toString()), solution);
        }
        return solution;
    }
}
