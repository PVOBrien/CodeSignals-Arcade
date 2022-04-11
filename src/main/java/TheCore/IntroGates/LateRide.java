package TheCore.IntroGates;

import java.util.function.IntUnaryOperator;

public class LateRide {

    int solution(int n) {

        String hours = Integer.toString(n/60);
        String minutes = Integer.toString(n % 60);
        String hhmm = hours + minutes;
        return hhmm.chars().map(Character::getNumericValue).sum();
    }

    private final IntUnaryOperator intOp = Character::getNumericValue;
}
