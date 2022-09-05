package TheCore.IntroGates;

public class AddTwoDigits {
    int solution(int n) {
        return Integer.toString(n).chars().map(Character::getNumericValue).sum(); // OR return Integer.toString(n).chars().map(i -> Character.getNumericValue(i)).sum();
    }
}

