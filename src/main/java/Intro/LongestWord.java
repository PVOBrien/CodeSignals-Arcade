package Intro;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LongestWord {

    String solution(String text) {
        String result = "";
        String regex = "[a-zA-Z]+";

        Matcher matcher = Pattern.compile(regex).matcher(text);
        while (matcher.find()) {
            result = matcher.group().length() > result.length() ? matcher.group() : result;
        }

        return result;
    }
}
