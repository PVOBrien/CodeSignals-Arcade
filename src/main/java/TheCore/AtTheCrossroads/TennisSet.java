package TheCore.AtTheCrossroads;

public class TennisSet {

    boolean solution(int score1, int score2) {
        int high = Math.max(score1, score2);
        int low = Math.min(score1, score2);
        if (high == 7 && low > 4 && low < 7 ) return true;
        if (high == 7 && low < 5) return false;
        if (high > 7) return false;
        return high > 5 && low < 5;
    }

}
