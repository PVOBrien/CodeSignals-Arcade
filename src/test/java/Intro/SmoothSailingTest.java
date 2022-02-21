package Intro;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

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

}
