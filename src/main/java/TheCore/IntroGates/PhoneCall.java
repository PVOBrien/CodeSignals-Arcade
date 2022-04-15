package TheCore.IntroGates;

public class PhoneCall {

    int solution(int min1, int min2_10, int min11, int s) {
        if (s < min1) return 0;

        int timeCount = 0;
        timeCount += 1;
        s -= min1;

        int tierTwoCount = 0;
        while (tierTwoCount < 9) {
            if (s < 1) break;
            s -= min2_10;
            timeCount++;
            tierTwoCount++;
        }

        timeCount += s / min11;
        return timeCount;
    }

}
