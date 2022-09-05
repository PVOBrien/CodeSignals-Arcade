package Intro;

public class AddBorder {

    String[] solution(String[] picture) {
        String[] result = new String[picture.length+2];

        StringBuilder border = new StringBuilder();
        for (int i = 0; i < picture[0].length()+2; i++) {
            border.append("*");
        }
        result[0] = border.toString();
        result[result.length-1] = border.toString();

        for (int i = 0; i < picture.length; i++) {
            result[i+1] = "*" + picture[i] + "*";
        }

        return result;
    }
}
