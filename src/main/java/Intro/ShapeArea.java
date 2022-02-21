package Intro;

public class ShapeArea {

    int solution(int n) {
        if (n == 1) return n;

        int solution = n*2-1;

        // int side = 0;
        for (int i = solution-2; i > 0;) {
            solution += i+i;
            i -= 2;
        }

        return solution;
    }
}
