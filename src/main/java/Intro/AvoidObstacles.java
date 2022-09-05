package Intro;

public class AvoidObstacles {

    int solution(int[] inputArray) {
        int jump = Integer.MAX_VALUE;
        for (int i = 1001; i > 2; i--) {
            boolean canJump = false;
            for (int num : inputArray ) {
                boolean isJump = num % i != 0;
                if (!isJump) {
                    canJump = false;
                    break;
                } else {
                    canJump = true;
                }
            }
            if (canJump) jump = i;
        }
        return jump;
    }
}
