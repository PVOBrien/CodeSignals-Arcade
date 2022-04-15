package TheCore.LoopTunnel;

public class Candles {

    int solution(int candlesNumber, int makeNew) {
        int candles = candlesNumber,
                leftovers = candlesNumber;

        do {
            candles += leftovers / makeNew;
            leftovers = (leftovers / makeNew) + (leftovers % makeNew);
        } while (leftovers >= makeNew);

        return candles;
    }

    int solutionFactorial(int solutionNumber, int makeNew) {
        return solutionNumber + (solutionNumber - 1) / (makeNew - 1);
    }

}
