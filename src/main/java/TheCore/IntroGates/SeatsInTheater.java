package TheCore.IntroGates;

public class SeatsInTheater {

    int solution(int nCols, int nRows, int col, int row) {
        return (nCols - col + 1) * (nRows - row);
    }

}
