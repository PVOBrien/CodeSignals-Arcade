package Intro;

public class ChessKnight {

    int solution(String cell) {
        int x = cell.charAt(0) - 'a'+ 1;
        int xCount = 0;
        int y = Character.getNumericValue(cell.charAt(1));
        int yCount = 0;

        for (int i = 1; i < 3; i++) {
            if (x + i < 9) xCount++;
            if (x - i > 0) xCount++;
            if (y + i < 9) yCount++;
            if (y - i > 0) yCount++;
        }

        return yCount * xCount / 2;
    }

}
