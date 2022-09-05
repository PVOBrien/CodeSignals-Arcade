package Intro;

public class KnapsackLight {

    int solution(int value1, int weight1, int value2, int weight2, int maxW) {
        int result;
        if (maxW >= weight1 + weight2) {
            result = value1 + value2;
        } else if (weight1 <= maxW && weight2 <= maxW) {
            return Math.max(value1, value2);
        } else if (weight1 > maxW && weight2 > maxW) {
            return 0;
        } else {
            result = weight1 <= maxW ? value1 : value2;
        }
        return result;
    }

}
