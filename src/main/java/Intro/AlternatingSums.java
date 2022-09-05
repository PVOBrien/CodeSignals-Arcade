package Intro;

public class AlternatingSums {

    int[] solution(int[] a) {
        int[] result = {0, 0};

        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 0) {
                result[0] += a[i];
            } else {
                result[1] += a[i];
            }
        }
        return result;
    }

    int[] betterSolution(int[] a) { // https://app.codesignal.com/arcade/intro/level-4/cC5QuL9fqvZjXJsW9/solutions?solutionId=c9octHT2sGiQbpfEN

        int []niz = new int[2];
        for(int i=0; i<a.length; i++)
            niz[i%2]+=a[i];

        return niz;
    }

}
