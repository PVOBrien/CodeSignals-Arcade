package Intro;

public class CircleOfNumbers {

    int solution(int n, int firstNumber) {
        return firstNumber + n/2 > n-1 ? firstNumber - n/2 : firstNumber + n/2;
    }

}
