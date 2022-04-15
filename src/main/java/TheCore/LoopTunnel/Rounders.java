package TheCore.LoopTunnel;

public class Rounders {

    int solution(int n) {
        int result = 0,
                countUp = 0,
                numPlace = 1;

        while (n > 0) {
            int theNum = (n % 10) + countUp;
            n /= 10;
            if (n == 0) {
                result += theNum * numPlace;
            } else {
                countUp = theNum > 4 ? 1 : 0;
            }
            numPlace *= 10;
        }

        return result;
    }

    int solution2(int value) {
        int p = 1;
        while (value > 10) {
            p *= 10;
            value = (value / 10) + ((value % 10 < 5) ? 0 : 1);
        }
        return value * p;
    }
}
