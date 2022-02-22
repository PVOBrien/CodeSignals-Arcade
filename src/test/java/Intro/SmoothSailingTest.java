package Intro;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

public class SmoothSailingTest {

    @Nested
    @DisplayName("All Longest Strings")
    public class AllLongestStringsTest {

        AllLongestStrings aLS = new AllLongestStrings();

        @Test
        public void aLSTest1() {
            String[] testArr = {"aba", "aa", "ad", "vcd", "aba"};
            assertEquals(Arrays.toString(new String[]{"aba", "vcd", "aba"}), Arrays.toString(aLS.solution(testArr)));
        }

        @Test
        public void aLSTest2() {
            String[] testArr = {"aa"};
            assertEquals(Arrays.toString(new String[]{"aa"}), Arrays.toString(aLS.solution(testArr)));
        }

        @Test
        public void aLSTest3() {
            String[] testArr = {"abc", "eeee", "abcd", "dcd"};
            assertEquals(Arrays.toString(new String[]{"eeee", "abcd"}), Arrays.toString(aLS.solution(testArr)));
        }

        @Test
        public void aLSTest4() {
            String[] testArr = {"a", "abc", "cbd", "zzzzzz", "a", "abcdef", "asasa", "aaaaaa"};
            assertEquals(Arrays.toString(new String[]{"zzzzzz", "abcdef", "aaaaaa"}), Arrays.toString(aLS.solution(testArr)));
        }

        @Test
        public void aLSTest5() {
            String[] testArr = {"enyky", "benyky", "yely", "varennyky"};
            assertEquals(Arrays.toString(new String[]{"varennyky"}), Arrays.toString(aLS.solution(testArr)));
        }

        @Test
        public void aLSTest6() {
            String[] testArr = {"abacaba", "abacab", "abac", "xxxxxx"};
            assertEquals(Arrays.toString(new String[]{"abacaba"}), Arrays.toString(aLS.solution(testArr)));
        }

        @Test
        public void aLSTest7() {
            String[] testArr = {"young", "yooooooung", "hot", "or", "not", "come", "on", "fire", "water", "watermelon"};
            assertEquals(Arrays.toString(new String[]{"yooooooung", "watermelon"}), Arrays.toString(aLS.solution(testArr)));
        }

        @Test
        public void aLSTest8() {
            String[] testArr = {"onsfnib", "aokbcwthc", "jrfcw"};
            assertEquals(Arrays.toString(new String[]{"aokbcwthc"}), Arrays.toString(aLS.solution(testArr)));
        }

        @Test
        public void aLSTest9() {
            String[] testArr = {"lbgwyqkry"};
            assertEquals(Arrays.toString(new String[]{"lbgwyqkry"}), Arrays.toString(aLS.solution(testArr)));
        }

        @Test
        public void aLSTest10() {
            String[] testArr = {"i"};
            assertEquals(Arrays.toString(new String[]{"i"}), Arrays.toString(aLS.solution(testArr)));
        }

    }

    @Nested
    @DisplayName("Common Character Count")
    public class CommonCharacterCountTest {

        CommonCharacterCount ccc = new CommonCharacterCount();

        @Test
        public void cccT1() {
            assertEquals(3, ccc.solution("aabcc", "adcaa"));
        }

        @Test
        public void cccT2() {
            assertEquals(4, ccc.solution("zzzz", "zzzzzzz"));
        }

        @Test
        public void cccT3() {
            assertEquals(3, ccc.solution("abca", "xyzbac"));
        }

        @Test
        public void cccT4() {
            assertEquals(0, ccc.solution("a", "b"));
        }

        @Test
        public void cccT5() {
            assertEquals(1, ccc.solution("a", "aaa"));
        }

    }

    @Nested
    @DisplayName("is Lucky")
    public class IsLuckyTest {
        IsLucky iL = new IsLucky();

        @Test
        public void iLTest1() {
            assertTrue(iL.solution(1230));
        }

        @Test
        public void iLTest2() {
            assertFalse(iL.solution(239017));
        }

        @Test
        public void iLTest3() {
            assertTrue(iL.solution(134008));
        }

        @Test
        public void iLTest4() {
            assertFalse(iL.solution(10));
        }

        @Test
        public void iLTest5() {
            assertTrue(iL.solution(11));
        }

        @Test
        public void iLTest6() {
            assertTrue(iL.solution(1010));
        }

        @Test
        public void iLTest7() {
            assertFalse(iL.solution(261534));
        }

        @Test
        public void iLTest8() {
            assertFalse(iL.solution(100000));
        }

        @Test
        public void iLTest9() {
            assertTrue(iL.solution(999999));
        }

        @Test
        public void iLTest10() {
            assertTrue(iL.solution(123321));
        }

    }

    @Nested
    @DisplayName("Sort By Height")
    public class SortByHeightTest {

        SortByHeight sBH = new SortByHeight();

        @Test
        public void sBHTest1() {
            int[] testArr = {-1, 150, 190, 170, -1, -1, 160, 180};
            assertArrayEquals( new int[]{-1, 150, 160, 170, -1, -1, 180, 190}, sBH.solution(testArr));
        }

        @Test
        public void sBHTest2() {
            int[] testArr = {-1, -1, -1, -1, -1};
            assertArrayEquals( new int[]{-1, -1, -1, -1, -1}, sBH.solution(testArr));
        }

        @Test
        public void sBHTest3() {
            int[] testArr = {-1};
            assertArrayEquals( new int[]{-1}, sBH.solution(testArr));
        }

        @Test
        public void sBHTest4() {
            int[] testArr = {4, 2, 9, 11, 2, 16};
            assertArrayEquals( new int[]{2, 2, 4, 9, 11, 16}, sBH.solution(testArr));
        }

        @Test
        public void sBHTest5() {
            int[] testArr = {2, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 1};
            assertArrayEquals( new int[]{1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 2}, sBH.solution(testArr));
        }

        @Test
        public void sBHTest6() {
            int[] testArr = {23, 54, -1, 43, 1, -1, -1, 77, -1, -1, -1, 3};
            assertArrayEquals( new int[]{1, 3, -1, 23, 43, -1, -1, 54, -1, -1, -1, 77}, sBH.solution(testArr));
        }

    }

    @Nested
    @DisplayName("Reverse In Parentheses")
    public class ReverseInParenthesesTest {

        ReverseInParentheses rIP = new ReverseInParentheses();

        @Test
        public void rIPTest1() {
            assertEquals("rab", rIP.solution("(bar)"));
        }

        @Test
        public void rIPTest2() {
            assertEquals("foorabbaz", rIP.solution("foo(bar)baz"));
        }

        @Test
        public void rIPTest3() {
            assertEquals("foorabbazmilb", rIP.solution("foo(bar)baz(blim)"));
        }

        @Test
        public void rIPTest4() {
            assertEquals("foobazrabblim", rIP.solution("foo(bar(baz))blim"));
        }

        @Test
        public void rIPTest5() {
            assertEquals("", rIP.solution(""));
        }

        @Test
        public void rIPTest6() {
            assertEquals("()", rIP.solution("()"));
        }

        @Test
        public void rIPTest7() {
            assertEquals("cbadgfe", rIP.solution("(abc)d(efg)"));
        }

    }
}
