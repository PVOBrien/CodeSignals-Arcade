package Intro;

public class ChessBoardCellColor {

    boolean solution(String cell1, String cell2) {
        int[] aOne = cell1.chars().toArray();
        int[] aTwo = cell2.chars().toArray();

        return (aOne[0] + aOne[1]) % 2 == (aTwo[0]%2 + aTwo[1]) %2;
    }
}
