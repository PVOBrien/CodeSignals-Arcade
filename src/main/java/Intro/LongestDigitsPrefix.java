package Intro;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LongestDigitsPrefix {

    String solution(String inputString) {
        Matcher matcher = Pattern.compile("^\\d+").matcher(inputString);
        if (matcher.find()) return matcher.group();
        return "";
    }
}
