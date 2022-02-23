package Intro;

public class AlphabeticShift {

    String solution(String inputString) {
        StringBuilder newWord = new StringBuilder();
        for (int i = 0; i < inputString.length(); i++) {
            int num = (int) inputString.charAt(i) + 1;
            if (num == 123) num = 97;
            newWord.append((char) num);
        }

        return newWord.toString();
    }

}
