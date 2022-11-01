package TheCore.WellOfIntegration;

public class AlphabetSubSequence {

    public boolean solution(String s){

        for (int i = 0; i < s.length()-1; i++) {
            char lower = s.charAt(i);
            System.out.println((int) lower);
            if (lower >= s.charAt(i+1)) return false;
        }
        return true;
    }
}
