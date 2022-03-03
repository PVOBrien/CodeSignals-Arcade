package Intro;

public class FindEmailDomain {

    String solution(String address) {
        StringBuilder sb = new StringBuilder();
        char[] addressArr = address.toCharArray();

        for (int i = addressArr.length-1; i > 0; i-- ) {
            if (addressArr[i] == '@') break;
            sb.append(addressArr[i]);
        }

        return sb.reverse().toString();
    }

}
