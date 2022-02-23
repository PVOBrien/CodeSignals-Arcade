package Intro;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FirstDigit {

    char solution(String inputString) {
        Matcher matcher = Pattern.compile("\\d").matcher(inputString);
        if (matcher.find()) return matcher.group(0).charAt(0);
        return '0';
    }
}
