package Intro;

public class BuildPalindrome {
    String solution(String st) {
        StringBuilder sb = new StringBuilder().append(st);

        for (char ch : st.toCharArray()) {
            if (st.charAt(0) == sb.charAt(sb.length()-1) &&
                    palFinder(sb.toString())) {
                return sb.toString();
            }
            sb.insert(st.length(), ch);
        }
        return sb.toString();
    }

    public boolean palFinder (String posPal) {
        for (int i = 0; i < posPal.length()/2; i++) {
            if (posPal.charAt(i) != posPal.charAt(posPal.length()-1-i)) return false;
        }
        return true;
    }
}
