package Intro;

public class ValidTime {

    boolean solution(String time) {
        String[] timeArr = time.split(":");
        if (Integer.parseInt(timeArr[0]) == 24 && Integer.parseInt(timeArr[1]) == 0) return false;
        if (Integer.parseInt(timeArr[0]) == 0 && Integer.parseInt(timeArr[1]) == 0) return true;

        return Integer.parseInt(timeArr[0]) < 24 && Integer.parseInt(timeArr[1]) < 60;
    }

}
