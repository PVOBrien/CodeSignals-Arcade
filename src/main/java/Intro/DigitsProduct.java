package Intro;

public class DigitsProduct {

    int solution(int product) { // https://app.codesignal.com/arcade/intro/level-12/NJJhENpgheFRQbPRA/solutions?solutionId=XKfpWbXPnTEudyJPZ
        if (product == 0)
            return 10;
        if (product < 10)
            return product;

        String r = "";
        for (int d = 9; d > 1; d--)
            for (; product % d == 0; product /= d) {
                r = d + r;
            }
        return product == 1 ? Integer.parseInt(r) : -1;
    }

}
