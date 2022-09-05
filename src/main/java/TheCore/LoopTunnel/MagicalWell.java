package TheCore.LoopTunnel;

import java.util.stream.IntStream;

public class MagicalWell {
    int solution(int a, int b, int n) {
        int t = 0;

        for (int i = 0; i < n; i++) {
            t += a++ * b++;
        }
        return t;
    }

    int solutionStream(int a, int b, int n) { // eeee! a Stream() solution. love it.
        return IntStream.range(0,n).map(i->(a+i)*(b+i)).sum();
    }

}
