package Intro;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Land of Logic")
public class LandOfLogicTest {

    @Nested
    @DisplayName("Longest Word")
    public class LongestWordTest {

        LongestWord lW = new LongestWord();

        @Test
        public void lWTest1() {
            assertEquals("steady", lW.solution("Ready, steady, go!"));
        }

        @Test
        public void lWTest2() {
            assertEquals("steady", lW.solution("Ready[[[, steady, go!"));
        }

        @Test
        public void lWTest3() {
            assertEquals("ABCd", lW.solution("ABCd"));
        }

        @Test
        public void lWTest4() {
            assertEquals("not", lW.solution("To be or not to be"));
        }

        @Test
        public void lWTest5() {
            assertEquals("CodeFighter", lW.solution("You are the best!!!!!!!!!!!! CodeFighter ever!"));
        }

    }

    @Nested
    @DisplayName("Valid Time")
    public class ValidTimeTest {

        ValidTime vT = new ValidTime();

        @Test
        public void vTTest1() {
            assertTrue(vT.solution("13:58"));
        }

        @Test
        public void vTTest2() {
            assertFalse(vT.solution("25:51"));
        }

        @Test
        public void vTTest3() {
            assertFalse(vT.solution("02:76"));
        }

        @Test
        public void vTTest4() {
            assertFalse(vT.solution("24:00"));
        }

        @Test
        public void vTTest5() {
            assertFalse(vT.solution("02:61"));
        }

        @Test
        public void vTTest6() {
            assertFalse(vT.solution("27:00"));
        }

        @Test
        public void vTTest7() {
            assertFalse(vT.solution("19:66"));
        }

        @Test
        public void vTTest8() {
            assertTrue(vT.solution("12:31"));
        }

        @Test
        public void vTTest9() {
            assertFalse(vT.solution("25:73"));
        }

        @Test
        public void vTTest10() {
            assertTrue(vT.solution("09:56"));
        }

        @Test
        public void vTTest11() {
            assertTrue(vT.solution("03:29"));
        }

    }
}
