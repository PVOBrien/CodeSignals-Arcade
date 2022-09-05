package Intro;

public class BishopandPawn {

    boolean solution(String bishop, String pawn) {
        char bx = bishop.charAt(0);
        char by = bishop.charAt(1);
        char px = pawn.charAt(0);
        char py = pawn.charAt(1);

        return Math.abs(by - py) == Math.abs(bx - px);
    }
}
