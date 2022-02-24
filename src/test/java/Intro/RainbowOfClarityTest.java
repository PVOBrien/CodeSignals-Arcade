package Intro;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Rainbow of Clarity")
public class RainbowOfClarityTest {

    @Nested
    @DisplayName("Rainbow of Clarity")
    public class IsDigitTest {

        IsDigit iD = new IsDigit();

        @Test
        public void iDTest1() {
            assertTrue(iD.solution('0'));
        }

        @Test
        public void iDTest2() {
            assertFalse(iD.solution('-'));
        }

        @Test
        public void iDTest3() {
            assertFalse(iD.solution('O'));
        }

        @Test
        public void iDTest4() {
            assertTrue(iD.solution('1'));
        }

        @Test
        public void iDTest5() {
            assertFalse(iD.solution('!'));
        }

        @Test
        public void iDTest6() {
            assertTrue(iD.solution('0'));
        }

        @Test
        public void iDTest7() {
            assertFalse(iD.solution('@'));
        }

        @Test
        public void iDTest8() {
            assertFalse(iD.solution('+'));
        }

        @Test
        public void iDTest9() {
            assertTrue(iD.solution('6'));
        }

        @Test
        public void iDTest10() {
            assertFalse(iD.solution('('));
        }

        @Test
        public void iDTest11() {
            assertFalse(iD.solution(')'));
        }

    }

}
