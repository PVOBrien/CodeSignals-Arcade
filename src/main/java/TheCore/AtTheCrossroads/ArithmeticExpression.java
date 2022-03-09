package TheCore.AtTheCrossroads;

public class ArithmeticExpression {

    boolean solution(int a, int b, int c) {
        return a+b==c || a-b==c || a*b==c || (float)a/b==c;
    }

}
