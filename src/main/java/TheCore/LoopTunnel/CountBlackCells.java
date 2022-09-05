package TheCore.LoopTunnel;

public class CountBlackCells {

    int solution(int n, int m) { // from https://app.codesignal.com/arcade/code-arcade/loop-tunnel/RcK4vupi8sFhakjnh/solutions?solutionId=PnxQeLmMmTXwmWx74
        int max = 1;
        for (int k = 1; k <= n; k++) {
            if (n%k == 0 && m%k == 0)
                max = k;
        }
        return n+m+max-2;
    }

}
