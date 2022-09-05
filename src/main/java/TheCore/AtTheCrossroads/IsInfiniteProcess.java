package TheCore.AtTheCrossroads;

public class IsInfiniteProcess {

    boolean solution(int a, int b) {
        if (a > b) return true;
        if (a % 2 == 1 && b % 2 == 1) return false;
        return !(a % 2 == 0 && b % 2 == 0);
    }

}
