package TheCore.LoopTunnel;

public class CountSumTwoReps2 { // brute force, basically
    int solution(int n, int l, int r) {
        int count = 0;
        for (int i = l; i <= r; i++) {
            for (int j = i; j <= r; j++) {
                if (i + j == n) count++;
                if (i + j > n) break;
            }
        }
        return count;
    }

    int otherSolution(int n, int l, int r) { // from highest rated Java solution
        int t = 0;
        for (int i = l; i <= r; i++) {
            if (n-i >= i && n-i <= r) // this is the optimization. N is already known, therefore just check if n minus a number fits between l and r and...
                t++; // ...count it.
        }
        return t;
    }
}
