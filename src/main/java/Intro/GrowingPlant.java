package Intro;

public class GrowingPlant {
    int solution(int upSpeed, int downSpeed, int desiredHeight) {
        int totalHeight = upSpeed, time = 1;

        while (totalHeight < desiredHeight) {
            totalHeight += upSpeed;
            time ++;
            totalHeight -= downSpeed;
        }

        return time;
    }
}
