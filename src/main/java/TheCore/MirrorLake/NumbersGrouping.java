package TheCore.MirrorLake;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class NumbersGrouping {

    int solution(int[] a) {
        Arrays.sort(a);
        int[] potentialPools= new int[a.length];
        double floor = 1;
        int pool = 0,
            floorCount = 1;

        for (int i = 0; i < a.length;) {
            while (i < a.length && a[i] >= floor && a[i] <= floorCount * Math.pow(10, 4)) { //  &&
                potentialPools[pool]++;
                i++;
            }
            floor = floorCount * Math.pow(10, 4);
            floorCount++;
            if (potentialPools[pool] > 0) pool++;
        }

        int poolCount = (int) Arrays.stream(potentialPools).filter(i -> i > 0).count();
        return poolCount + a.length;
    }

    int simpleSol(int[] a) { // https://app.codesignal.com/arcade/code-arcade/mirror-lake/kGeuCkJNbqczCCqgg/solutions?solutionId=fNBHSih2awGK4NYLE
        Set<Integer> groups = new HashSet<>();
        for (int num : a) {
            groups.add((num - 1) / 1000);
        }
        return a.length + groups.size();
    }

}
