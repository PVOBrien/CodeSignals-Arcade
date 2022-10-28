package TheCore.MirrorLake;

import java.util.TreeSet;

public class NumberOfClans {

    int solution(int[] divisors, int k) { // answer from https://app.codesignal.com/arcade/code-arcade/mirror-lake/BLbGNY3kEcvKjBCFC/solutions?solutionId=9F6qHfsaJiC8YYWeL
        TreeSet<String> s =new TreeSet<>();
        for(int i=1; i<=k;i++){
            String cur="";
            for (int divisor : divisors) {
                cur += (i % divisor == 0) ? 0 : 1;
            }
            s.add(cur);
        }
        return s.size();
    }

}
