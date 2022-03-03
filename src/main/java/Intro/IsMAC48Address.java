package Intro;

public class IsMAC48Address {

    boolean solution(String inputString) { // https://stackoverflow.com/questions/4260467/what-is-a-regular-expression-for-a-mac-address
        String regex = "^([0-9A-Fa-f]{2}[:-]){5}([0-9A-Fa-f]{2})$";
        return inputString.matches(regex);
    }

}
