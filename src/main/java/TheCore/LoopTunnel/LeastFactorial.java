package TheCore.LoopTunnel;

public class LeastFactorial {

    int solution(int n) {
        int k = 1, counter = 1;
        do { k *= counter++; } while (k < n);
        return k;
    }

    int bestSolution(int n) { // stepped through from highest rated Java solution
        int k = 1, counter = 1;
        while (k < n) k *= counter++;
        return k;
    }
}
