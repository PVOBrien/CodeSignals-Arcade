package Intro;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

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

    @Nested
    @DisplayName("File Naming")
    public class FileNamingTest {

        FileNaming fN = new FileNaming();

        @Test
        public void fNTest1() {
            String[] testArr = {"doc",
                    "doc",
                    "image",
                    "doc(1)",
                    "doc"};
            assertArrayEquals(new String[]{"doc", "doc(1)", "image", "doc(1)(1)", "doc(2)"}, (String[]) fN.solution(testArr));
        }

        @Test
        public void fNTest2() {
            String[] testArr = {"a(1)",
                    "a(6)",
                    "a",
                    "a",
                    "a",
                    "a",
                    "a",
                    "a",
                    "a",
                    "a",
                    "a",
                    "a"};
            assertArrayEquals(new String[]{"a(1)",
                    "a(6)",
                    "a",
                    "a(2)",
                    "a(3)",
                    "a(4)",
                    "a(5)",
                    "a(7)",
                    "a(8)",
                    "a(9)",
                    "a(10)",
                    "a(11)"}, (String[]) fN.solution(testArr));
        }

        @Test
        public void fNTest3() {
            String[] testArr = {"dd",
                    "dd(1)",
                    "dd(2)",
                    "dd",
                    "dd(1)",
                    "dd(1)(2)",
                    "dd(1)(1)",
                    "dd",
                    "dd(1)"};
            assertArrayEquals(new String[]{"dd",
                    "dd(1)",
                    "dd(2)",
                    "dd(3)",
                    "dd(1)(1)",
                    "dd(1)(2)",
                    "dd(1)(1)(1)",
                    "dd(4)",
                    "dd(1)(3)"}, (String[]) fN.solution(testArr));
        }

        @Test
        public void fNTest4() {
            String[] testArr = {"a",
                    "b",
                    "cd",
                    "b ",
                    "a(3)"};
            assertArrayEquals(new String[]{"a",
                    "b",
                    "cd",
                    "b ",
                    "a(3)"}, (String[]) fN.solution(testArr));
        }

        @Test
        public void fNTest5() {
            String[] testArr = {"name",
                    "name",
                    "name(1)",
                    "name(3)",
                    "name(2)",
                    "name(2)"};
            assertArrayEquals(new String[]{"name",
                    "name(1)",
                    "name(1)(1)",
                    "name(3)",
                    "name(2)",
                    "name(2)(1)"}, (String[]) fN.solution(testArr));
        }

        @Test
        public void fNTest6() {
            String[] testArr = {};
            assertArrayEquals(new String[]{}, (String[]) fN.solution(testArr));
        }

    }

    @Nested
    @DisplayName("Message From Binary Code")
    public class MessageFromBinaryCodeTest {

        MessageFromBinaryCode mFBC = new MessageFromBinaryCode();

        @Test
        public void mFBCTest1() {
            assertEquals("Hello!", mFBC.solution("010010000110010101101100011011000110111100100001"));
        }

        @Test
        public void mFBCTest2() {
            assertEquals("May the Force be with you", mFBC.solution("01001101011000010111100100100000011101000110100001100101001000000100011001101111011100100110001101100101001000000110001001100101001000000111011101101001011101000110100000100000011110010110111101110101"));
        }

        @Test
        public void mFBCTest3() {
            assertEquals("You had me at `hello.", mFBC.solution("010110010110111101110101001000000110100001100001011001000010000001101101011001010010000001100001011101000010000001100000011010000110010101101100011011000110111100101110"));
        }

        @Test
        public void mFBCTest4() {
            assertEquals("Elementary, my dear Watson!", mFBC.solution("010001010110110001100101011011010110010101101110011101000110000101110010011110010010110000100000011011010111100100100000011001000110010101100001011100100010000001010111011000010111010001110011011011110110111000100001"));
        }

        @Test
        public void mFBCTest5() {
            assertEquals("Love For All, Hatred For None.", mFBC.solution("010011000110111101110110011001010010000001000110011011110111001000100000010000010110110001101100001011000010000001001000011000010111010001110010011001010110010000100000010001100110111101110010001000000100111001101111011011100110010100101110"));
        }

        @Test
        public void mFBCTest6() {
            assertEquals("Change the world by being yourself.", mFBC.solution("0100001101101000011000010110111001100111011001010010000001110100011010000110010100100000011101110110111101110010011011000110010000100000011000100111100100100000011000100110010101101001011011100110011100100000011110010110111101110101011100100111001101100101011011000110011000101110"));
        }

        @Test
        public void mFBCTest7() {
            assertEquals("Every moment is a fresh beginning.", mFBC.solution("01000101011101100110010101110010011110010010000001101101011011110110110101100101011011100111010000100000011010010111001100100000011000010010000001100110011100100110010101110011011010000010000001100010011001010110011101101001011011100110111001101001011011100110011100101110"));
        }

        @Test
        public void mFBCTest8() {
            assertEquals("Never regret anything that made you smile.", mFBC.solution("010011100110010101110110011001010111001000100000011100100110010101100111011100100110010101110100001000000110000101101110011110010111010001101000011010010110111001100111001000000111010001101000011000010111010000100000011011010110000101100100011001010010000001111001011011110111010100100000011100110110110101101001011011000110010100101110"));
        }

        @Test
        public void mFBCTest9() {
            assertEquals("Die with memories, not dreams.", mFBC.solution("010001000110100101100101001000000111011101101001011101000110100000100000011011010110010101101101011011110111001001101001011001010111001100101100001000000110111001101111011101000010000001100100011100100110010101100001011011010111001100101110"));
        }

        @Test
        public void mFBCTest10() {
            assertEquals("Aspire to inspire before we expire.", mFBC.solution("0100000101110011011100000110100101110010011001010010000001110100011011110010000001101001011011100111001101110000011010010111001001100101001000000110001001100101011001100110111101110010011001010010000001110111011001010010000001100101011110000111000001101001011100100110010100101110"));
        }

    }

    @Nested
    @DisplayName("Spiral Numbers")
    public class SpiralNumbersTest {

        SpiralNumbers sN = new SpiralNumbers();

        @Test
        public void sNTest1() {

            int[][] result = {{1,2,3}, {8,9,4}, {7,6,5}};
            int[][] test1 = sN.solution(3);
            assertArrayEquals(result[0], test1[0]);
            assertArrayEquals(result[1], test1[1]);
            assertArrayEquals(result[2], test1[2]);
        }

    }

    @Nested
    @DisplayName("Sudoku")
    public class SudokuTest {

        Sudoku sudoku = new Sudoku();

        @Test
        public void sudokuTest1() {
            assertTrue(sudoku.solution(new int[][]{{1,3,2,5,4,6,9,8,7},
                    {4,6,5,8,7,9,3,2,1},
                    {7,9,8,2,1,3,6,5,4},
                    {9,2,1,4,3,5,8,7,6},
                    {3,5,4,7,6,8,2,1,9},
                    {6,8,7,1,9,2,5,4,3},
                    {5,7,6,9,8,1,4,3,2},
                    {2,4,3,6,5,7,1,9,8},
                    {8,1,9,3,2,4,7,6,5}}));
        }

        @Test
        public void sudokuTest2() {
            assertFalse(sudoku.solution(new int[][]{{1,3,2,5,4,6,9,2,7},
                    {4,6,5,8,7,9,3,8,1},
                    {7,9,8,2,1,3,6,5,4},
                    {9,2,1,4,3,5,8,7,6},
                    {3,5,4,7,6,8,2,1,9},
                    {6,8,7,1,9,2,5,4,3},
                    {5,7,6,9,8,1,4,3,2},
                    {2,4,3,6,5,7,1,9,8},
                    {8,1,9,3,2,4,7,6,5}}));
        }

        @Test
        public void sudokuTest3() {
            assertFalse(sudoku.solution(new int[][]{{1,2,3,4,5,6,7,8,9},
                    {1,2,3,4,5,6,7,8,9},
                    {1,2,3,4,5,6,7,8,9},
                    {1,2,3,4,5,6,7,8,9},
                    {1,2,3,4,5,6,7,8,9},
                    {1,2,3,4,5,6,7,8,9},
                    {1,2,3,4,5,6,7,8,9},
                    {1,2,3,4,5,6,7,8,9},
                    {1,2,3,4,5,6,7,8,9}}));
        }

        @Test
        public void sudokuTest4() {
            assertFalse(sudoku.solution(new int[][]{{1,3,4,2,5,6,9,8,7},
                    {4,6,8,5,7,9,3,2,1},
                    {7,9,2,8,1,3,6,5,4},
                    {9,2,3,1,4,5,8,7,6},
                    {3,5,7,4,6,8,2,1,9},
                    {6,8,1,7,9,2,5,4,3},
                    {5,7,6,9,8,1,4,3,2},
                    {2,4,5,6,3,7,1,9,8},
                    {8,1,9,3,2,4,7,6,5}}));
        }

        @Test
        public void sudokuTest5() {
            assertFalse(sudoku.solution(new int[][]{{1,3,2,5,4,6,9,8,7},
                    {4,6,5,8,7,9,3,2,1},
                    {7,9,8,2,1,3,6,5,4},
                    {9,2,1,4,3,5,8,7,6},
                    {3,5,4,7,6,8,2,1,9},
                    {6,8,7,1,9,2,5,4,3},
                    {5,4,6,9,8,1,4,3,2},
                    {2,7,3,6,5,7,1,9,8},
                    {8,1,9,3,2,4,7,6,5}}));
        }

        @Test
        public void sudokuTest6() {
            assertFalse(sudoku.solution(new int[][]{{1,2,3,4,5,6,7,8,9},
                    {4,6,5,8,7,9,3,2,1},
                    {7,9,8,2,1,3,6,5,4},
                    {1,2,3,4,5,6,7,8,9},
                    {4,6,5,8,7,9,3,2,1},
                    {7,9,8,2,1,3,6,5,4},
                    {1,2,3,4,5,6,7,8,9},
                    {4,6,5,8,7,9,3,2,1},
                    {7,9,8,2,1,3,6,5,4}}));
        }

        @Test
        public void sudokuTest7() {
            assertFalse(sudoku.solution(new int[][]{{5,3,4,6,7,8,9,1,2},
                    {6,7,2,1,9,5,3,4,8},
                    {1,9,8,3,4,2,5,6,7},
                    {8,5,9,9,6,1,4,2,3},
                    {4,2,6,8,5,3,7,9,1},
                    {7,1,3,7,2,4,8,5,6},
                    {9,6,1,5,3,7,2,8,4},
                    {2,8,7,4,1,9,6,3,5},
                    {3,4,5,2,8,6,1,7,9}}));
        }

        @Test
        public void sudokuTest8() {
            assertFalse(sudoku.solution(new int[][]{{5,5,5,5,5,5,5,5,5},
                    {5,5,5,5,5,5,5,5,5},
                    {5,5,5,5,5,5,5,5,5},
                    {5,5,5,5,5,5,5,5,5},
                    {5,5,5,5,5,5,5,5,5},
                    {5,5,5,5,5,5,5,5,5},
                    {5,5,5,5,5,5,5,5,5},
                    {5,5,5,5,5,5,5,5,5},
                    {5,5,5,5,5,5,5,5,5}}));
        }

        @Test
        public void sudokuTest9() {
            assertFalse(sudoku.solution(new int[][]{{5,3,4,6,7,8,9,1,2},
                    {6,7,2,3,9,5,3,4,8},
                    {1,9,8,1,4,2,5,6,7},
                    {8,5,9,7,6,1,4,2,3},
                    {4,2,6,8,5,3,7,9,1},
                    {7,1,3,9,2,4,8,5,6},
                    {9,6,1,5,3,7,2,8,4},
                    {2,8,7,4,1,9,6,3,5},
                    {3,4,5,2,8,6,1,7,9}}));
        }

        @Test
        public void sudokuTest10() {
            assertFalse(sudoku.solution(new int[][]{{5,3,4,6,7,8,9,1,2},
                    {6,7,2,1,9,5,3,4,8},
                    {1,9,8,3,4,2,5,6,7},
                    {8,5,9,7,6,1,4,2,3},
                    {4,2,6,8,5,3,7,9,1},
                    {7,1,3,9,2,4,8,5,6},
                    {9,6,1,5,3,7,2,8,4},
                    {2,5,7,4,1,9,6,3,5},
                    {3,4,5,2,8,6,1,7,9}}));
        }

        @Test
        public void sudokuTest11() {
            assertFalse(sudoku.solution(new int[][]{{1,2,3,4,5,6,7,8,9},
                    {4,5,6,7,8,9,1,2,3},
                    {7,8,9,1,2,3,4,5,6},
                    {2,3,4,5,6,7,8,9,1},
                    {3,4,5,6,7,8,9,1,2},
                    {5,6,7,8,9,1,2,3,4},
                    {6,7,8,9,1,2,3,4,5},
                    {8,9,1,2,3,4,5,6,7},
                    {9,1,2,3,4,5,6,7,8}}));
        }

    }
}
