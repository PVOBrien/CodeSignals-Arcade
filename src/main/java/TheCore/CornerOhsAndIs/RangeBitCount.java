package TheCore.CornerOhsAndIs;

import java.util.Arrays;

public class RangeBitCount {

    int solution(int a, int b) {

        String[] intArr = new String[(b - a) + 1];
        for (int i = 0; i < (b - a) + 1; i++) {
            intArr[i] = Integer.toBinaryString(i + a);
        }

        return (int) Arrays.stream(intArr).flatMapToInt(String::chars).filter(ch -> ch == '1').count();
    }
}
