package Intro;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SumUpNumbers {

    int solution(String inputString) {
        String regex = "\\d+";
        int count = 0;

        Matcher matcher = Pattern.compile(regex).matcher(inputString);
        while (matcher.find()) {
            count += Integer.parseInt(matcher.group());
        }
        return count;
    }

}
