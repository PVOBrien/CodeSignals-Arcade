package Intro;

import java.util.Stack;

public class ReverseInParentheses {

    String solution(String inputString) {
        if (inputString.equals("()")) return inputString;

        Stack<Integer> frontParens = new Stack<>();
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == '(') frontParens.add(i);
            if (inputString.charAt(i) == ')') {
                    int frontParen = frontParens.pop();
                    String sReverse = inputString.substring(frontParen, i+1);
                    sReverse = new StringBuilder().append(sReverse).reverse().toString();
                    inputString = inputString.replace(inputString.substring(frontParen, i+1), sReverse);
            }
        }

        inputString = inputString.replaceAll("[(]", "");
        inputString = inputString.replaceAll("[)]", "");
        return inputString;
    }

}
