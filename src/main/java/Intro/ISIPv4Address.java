package Intro;

public class ISIPv4Address {

    boolean solution(String inputString) {
        if (!inputString.matches("\\d{1,3}[.]\\d{1,3}[.]\\d{1,3}[.]\\d{1,3}")) return false;
        String[] ipF = inputString.split("\\.");

        for (String s : ipF) {
            if (s.matches("\\D") || s.matches("^0{2,}") || s.matches("^0.")) {
                return false;
            }
            int sInt = Integer.parseInt(s);
            if (sInt > 255 || sInt < 0 ) return false;
        }

        return true;

    }
}
