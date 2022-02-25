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

    @Nested
    @DisplayName("Sum Up Numbers")
    public class SumUpNumbersTest {

        SumUpNumbers sUN = new SumUpNumbers();

        @Test
        public void sUNTest1() {
            assertEquals(14, sUN.solution("2 apples, 12 oranges"));
        }

        @Test
        public void sUNTest2() {
            assertEquals(123450, sUN.solution("123450"));
        }

        @Test
        public void sUNTest3() {
            assertEquals(0, sUN.solution("Your payment method is invalid"));
        }

        @Test
        public void sUNTest4() {
            assertEquals(0, sUN.solution("no digits at all"));
        }

        @Test
        public void sUNTest5() {
            assertEquals(6587, sUN.solution("there are some (12) digits 5566 in this 770 string 239"));
        }

        @Test
        public void sUNTest6() {
            assertEquals(823, sUN.solution("42+781"));
        }

        @Test
        public void sUNTest7() {
            assertEquals(4, sUN.solution("abc abc 4 abc 0 abc"));
        }

        @Test
        public void sUNTest8() {
            assertEquals(98, sUN.solution("abcdefghijklmnopqrstuvwxyz1AbCdEfGhIjKlMnOpqrstuvwxyz23,74 -"));
        }

    }

    @Nested
    @DisplayName("DifferentSquares")
    public class DifferentSquaresTest {

        DifferentSquares dS = new DifferentSquares();

        @Test
        public void dSTest1() {
            int[][] testMatrix = {{1,2,1}, {2,2,2}, {2,2,2}, {1,2,3}, {2,2,1}};
            assertEquals(6, dS.solution(testMatrix));
        }

        @Test
        public void dSTest2() {
            int[][] testMatrix = {{9,9,9,9,9}, {9,9,9,9,9}, {9,9,9,9,9}, {9,9,9,9,9}, {9,9,9,9,9}, {9,9,9,9,9}};
            assertEquals(1, dS.solution(testMatrix));
        }

        @Test
        public void dSTest3() {
            int[][] testMatrix = {{3}};
            assertEquals(0, dS.solution(testMatrix));
        }

        @Test
        public void dSTest4() {
            int[][] testMatrix = {{3,4,5,6,7,8,9}};
            assertEquals(0, dS.solution(testMatrix));
        }

        @Test
        public void dSTest5() {
            int[][] testMatrix = {{3}, {4}, {5}, {6}, {7}};
            assertEquals(0, dS.solution(testMatrix));
        }

        @Test
        public void dSTest6() {
            int[][] testMatrix = {{2,5,3,4,3,1,3,2},
                                 {4,5,4,1,2,4,1,3},
                                 {1,1,2,1,4,1,1,5},
                                 {1,3,4,2,3,4,2,4},
                                 {1,5,5,2,1,3,1,1},
                                 {1,2,3,3,5,1,2,4},
                                 {3,1,4,4,4,1,5,5},
                                 {5,1,3,3,1,5,3,5},
                                 {5,4,4,3,5,4,4,4}};
            assertEquals(54, dS.solution(testMatrix));
        }

        @Test
        public void dSTest7() {
            int[][] testMatrix = {{1,1,1,1,1,1,2,2,2,3,3,3,9,9,9,2,3,9}};
            assertEquals(0, dS.solution(testMatrix));
        }

    }

    @Nested
    @DisplayName("Digits Product")
    public class DigitsProductTest {

        DigitsProduct dP = new DigitsProduct();

        @Test
        public void dPTest1() {
            assertEquals(26, dP.solution(12));
        }

        @Test
        public void dPTest2() {
            assertEquals(-1, dP.solution(19));
        }

        @Test
        public void dPTest3() {
            assertEquals(2559, dP.solution(450));
        }

        @Test
        public void dPTest4() {
            assertEquals(10, dP.solution(0));
        }

        @Test
        public void dPTest5() {
            assertEquals(1, dP.solution(1));
        }

        @Test
        public void dPTest6() {
            assertEquals(26, dP.solution(12));
        }

        @Test
        public void dPTest7() {
            assertEquals(399, dP.solution(243));
        }

        @Test
        public void dPTest8() {
            assertEquals(889, dP.solution(576));
        }

        @Test
        public void dPTest9() {
            assertEquals(589, dP.solution(360));
        }

    }
}
