package TheCore.IntroGates;

public class CircleofNumbers {

    int solution(int n, int firstNumber) {
        return firstNumber+n/2 < n ? firstNumber + n/2 : firstNumber - n/2;
    }

}