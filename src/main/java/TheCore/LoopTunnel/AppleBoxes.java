package TheCore.LoopTunnel;

public class AppleBoxes {

    int solution(int k) {
        System.out.println(Math.pow(-1,k));
        int yellow = 0,
                red = 0;
        for (int i = 0; i <= k; i++) {
            if (i % 2 == 1) {
                yellow += i * i;
            } else {
                red += i * i;
            }
        }
        return red - yellow;
    }

int solution2(int k) { // from highest rated Java solution
    return ((int)Math.pow(-1,k))*k*(k+1)/2;}
}
