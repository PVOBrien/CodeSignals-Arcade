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

    @Nested
    @DisplayName("Proper Noun Capitalization")
    public class ProperNounCapitalizationTests {

        ProperNounCorrection pNC = new ProperNounCorrection();

        @Test
        public void pNCT1() {
            assertEquals("Paris", pNC.solution("pARiS"));
        }

        @Test
        public void pNCT2() {
            assertEquals("John", pNC.solution("John"));
        }
        @Test
        public void pNCT3() {
            assertEquals("Mary", pNC.solution("mary"));
        }
        @Test
        public void pNCT4() {
            assertEquals("A", pNC.solution("a"));
        }
        @Test
        public void pNCT5() {
            assertEquals("B", pNC.solution("B"));
        }
        @Test
        public void pNCT6() {
            assertEquals("Yfzmlgvuqp", pNC.solution("yFZMlGvUQP"));
        }
        @Test
        public void pNCT7() {
            assertEquals("Hqqrrdxuqe", pNC.solution("HQQrrDxuqe"));
        }
        @Test
        public void pNCT8() {
            assertEquals("Atdh", pNC.solution("atDh"));
        }
        @Test
        public void pNCT9() {
            assertEquals("Pjhsyvazb", pNC.solution("pJHSYVAZB"));
        }
        @Test
        public void pNCT10() {
            assertEquals("Dkrqo", pNC.solution("dKrqO"));
        }
    }

    @Nested
    @DisplayName("Is Unstable Pair?")
    public class IsUnstablePairTest {

        IsUnstablePair iUP = new IsUnstablePair();

        @Test
        public void iUPT1() {
            assertTrue(iUP.solution("aa", "AAB"));
        }

        @Test
        public void iUPT2() {
            assertFalse(iUP.solution("A", "z"));
        }

        @Test
        public void iUPT3() {
            assertFalse(iUP.solution("yyyyyy", "Azzzzzzzzz"));
        }

        @Test
        public void iUPT4() {
            assertTrue(iUP.solution("mehOu", "mehau"));
        }

        @Test
        public void iUPT5() {
            assertTrue(iUP.solution("aaZ", "AAzz"));
        }

        @Test
        public void iUPT6() {
            assertFalse(iUP.solution("fdsAs", "dzdw"));
        }

        @Test
        public void iUPT7() {
            assertTrue(iUP.solution("aaad", "aaAdd"));
        }

        @Test
        public void iUPT8() {
            assertTrue(iUP.solution("zzzzzAa123", "zzzzza"));
        }

        @Test
        public void iUPT9() {
            assertFalse(iUP.solution("123za", "123Z"));
        }

        @Test
        public void iUPT10() {
            assertTrue(iUP.solution("qwerTyu123", "qwertyu"));
        }
    }
}