package TheCore;

public class LargestNumber {

    int solution(int n) { // from toprated Java entry. Lol, multiple 10 n times, minus 1. So much faster than my solution of printing each letter. MATH!!!
        return (int) Math.pow(10, n) - 1;
    }

    int solutionViaString(int n) {
        return Integer.parseInt("9".repeat(n)); // is...
                                                 /* for (int i = 0; i < n; i++) {
                                                         sB.append(9);
                                                     } */
    }
}
