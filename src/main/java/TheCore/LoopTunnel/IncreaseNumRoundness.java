package TheCore.LoopTunnel;

public class IncreaseNumRoundness {

    boolean solution(int n) {
        String numString = Integer.toString(n);
        boolean hasZero = false;

        for (int i = 0; i < numString.length(); i++) {
            if (hasZero && Character.digit(numString.charAt(i),10) > 0) return true;
            hasZero = numString.charAt(i) == '0'; // originally had this as hasZero = numString.charAt(i) == '0' ? true : false; need to remember: if it's not true, it's false. Yup.
        }

        return false;
    }

/*
boolean solution(int n) {
    return (n+"").matches(".*0[^0]+0*");
}
*/

}
