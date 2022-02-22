package Intro;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Exploring The Waters")
public class ExploringTheWatersTest {

    @Nested
    @DisplayName("Alternating Sums")
    public class AlternatingSumsTest {

        AlternatingSums aS = new AlternatingSums();

        @Test
        public void aSTest1() {
            assertArrayEquals(new int[]{180, 105}, aS.solution(new int[]{50, 60, 60, 45, 70}));
        }

        @Test
        public void aSTest2() {
            assertArrayEquals(new int[]{100, 50}, aS.solution(new int[]{100, 50}));
        }

        @Test
        public void aSTest3() {
            assertArrayEquals(new int[]{80, 0}, aS.solution(new int[]{80}));
        }

        @Test
        public void aSTest4() {
            assertArrayEquals(new int[]{150, 150}, aS.solution(new int[]{100, 50, 50, 100}));
        }

        @Test
        public void aSTest5() {
            assertArrayEquals(new int[]{150, 151}, aS.solution(new int[]{100, 51, 50, 100}));
        }

    }

    @Nested
    @DisplayName("Add Border")
    public class AddBorderTest {

        AddBorder aB = new AddBorder();

        @Test
        public void aBTest1() {
            String[] testArr = {"abc", "ded"};
            String[] resultArr = {"*****",
                                  "*abc*",
                                  "*ded*",
                                  "*****"};
            assertEquals(Arrays.toString(resultArr), Arrays.toString(aB.solution(testArr)));
        }

        @Test
        public void aBTest2() {
            String[] testArr = {"a"};
            String[] resultArr = {"***",
                                  "*a*",
                                  "***"};
            assertEquals(Arrays.toString(resultArr), Arrays.toString(aB.solution(testArr)));
        }

        @Test
        public void aBTest3() {
            String[] testArr = {"aa", "**", "zz"};
            String[] resultArr = {"****",
                                  "*aa*",
                                  "****",
                                  "*zz*",
                                  "****"};
            assertEquals(Arrays.toString(resultArr), Arrays.toString(aB.solution(testArr)));
        }

        @Test
        public void aBTest4() {
            String[] testArr = {"abcde", "fghij", "klmno", "pqrst", "uvwxy"};
            String[] resultArr = {"*******",
                                  "*abcde*",
                                  "*fghij*",
                                  "*klmno*",
                                  "*pqrst*",
                                  "*uvwxy*",
                                  "*******"};
            assertEquals(Arrays.toString(resultArr), Arrays.toString(aB.solution(testArr)));
        }

        @Test
        public void aBTest5() {
            String[] testArr = {"wzy**"};
            String[] resultArr = {"*******",
                                  "*wzy***",
                                  "*******"};
            assertEquals(Arrays.toString(resultArr), Arrays.toString(aB.solution(testArr)));
        }

    }

    @Nested
    @DisplayName("Are Similar")
    public class AreSimilarTest {

        AreSimilar aS = new AreSimilar();

        @Test
        public void asTest1() {
            int[] arrOne = {1, 2, 3};
            int[] arrTwo = {1, 2, 3};
            assertTrue(aS.solution(arrOne, arrTwo));
        }

        @Test
        public void asTest2() {
            int[] arrOne = {1, 2, 3};
            int[] arrTwo = {2, 1, 3};
            assertTrue(aS.solution(arrOne, arrTwo));
        }

        @Test
        public void asTest3() {
            int[] arrOne = {1, 2, 2};
            int[] arrTwo = {2, 1, 1};
            assertFalse(aS.solution(arrOne, arrTwo));
        }

        @Test
        public void asTest4() {
            int[] arrOne = {1, 1, 4};
            int[] arrTwo = {1, 2, 3};
            assertFalse(aS.solution(arrOne, arrTwo));
        }

        @Test
        public void asTest5() {
            int[] arrOne = {1, 2, 3};
            int[] arrTwo = {1, 10, 2};
            assertFalse(aS.solution(arrOne, arrTwo));
        }

        @Test
        public void asTest6() {
            int[] arrOne = {2, 3, 1};
            int[] arrTwo = {1, 3, 2};
            assertTrue(aS.solution(arrOne, arrTwo));
        }

        @Test
        public void asTest7() {
            int[] arrOne = {2, 3, 9};
            int[] arrTwo = {10, 3, 2};
            assertFalse(aS.solution(arrOne, arrTwo));
        }

        @Test
        public void asTest8() {
            int[] arrOne = {4, 6, 3};
            int[] arrTwo = {3, 4, 6};
            assertFalse(aS.solution(arrOne, arrTwo));
        }

        @Test
        public void asTest9() {
            int[] arrOne = {832, 998, 148, 570, 533, 561, 894, 147, 455, 279};
            int[] arrTwo = {832, 998, 148, 570, 533, 561, 455, 147, 894, 279};
            assertTrue(aS.solution(arrOne, arrTwo));
        }

        @Test
        public void asTest10() {
            int[] arrOne = {832, 998, 148, 570, 533, 561, 894, 147, 455, 279};
            int[] arrTwo = {832, 570, 148, 998, 533, 561, 455, 147, 894, 279};
            assertFalse(aS.solution(arrOne, arrTwo));
        }

    }
}
