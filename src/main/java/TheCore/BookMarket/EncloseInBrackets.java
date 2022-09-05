package TheCore.BookMarket;

public class EncloseInBrackets {

    String solution(String inputString) {
        return new StringBuilder(inputString)
                .insert(0, "(")
                .append(')')
                .toString();
    }
}