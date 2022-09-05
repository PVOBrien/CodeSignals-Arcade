package TheCore.BookMarket;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BookMarketTests {

    @Nested
    @DisplayName("Enclose in Brackets Tests")
    public class EncloseInBracketsTests {

        EncloseInBrackets eIB = new EncloseInBrackets();

        @Test
        public void eIBTest1() {
            String test = "abacaba";
            assertEquals("(abacaba)", eIB.solution(test));
        }

        @Test
        public void eIBTest2() {
            String test = "abcdef";
            assertEquals("(abcdef)", eIB.solution(test));
        }

        @Test
        public void eIBTest3() {
            String test = "aaad";
            assertEquals("(aaad)", eIB.solution(test));
        }

        @Test
        public void eIBTest4() {
            String test = "if";
            assertEquals("(if)", eIB.solution(test));
        }

        @Test
        public void eIBTest5() {
            String test = "it";

            assertEquals("(it)", eIB.solution(test));
        }

        @Test
        public void eIBTest6() {
            String test = "doesnt";
            assertEquals("(doesnt)", eIB.solution(test));
        }

        @Test
        public void eIBTest7() {
            String test = "challenge";
            assertEquals("(challenge)", eIB.solution(test));
        }

        @Test
        public void eIBTest8() {
            String test = "you";
            assertEquals("(you)", eIB.solution(test));
        }

        @Test
        public void eIBTest9() {
            String test = "itt";
            assertEquals("(itt)", eIB.solution(test));
        }

        @Test
        public void eIBTest10() {
            String test = "wont";
            assertEquals("(wont)", eIB.solution(test));
        }
    }
}