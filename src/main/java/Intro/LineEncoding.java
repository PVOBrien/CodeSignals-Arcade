package Intro;

public class LineEncoding {

    String solution(String s) {
        StringBuilder result = new StringBuilder();
        char letter = s.charAt(0);
        int count = 1;

        for (int i = 1; i < s.length(); i++) {
            if (letter == s.charAt(i)) count++;

            if (letter != s.charAt(i) || i+1 == s.length()) {
                if (count > 1) result.append(count);

                result.append(letter);
                letter = s.charAt(i);
                count = 1;
                if (i+1 == s.length() && s.charAt(i) != s.charAt(i-1)) result.append(letter);
            }
        }
        return result.toString();
    }

}
