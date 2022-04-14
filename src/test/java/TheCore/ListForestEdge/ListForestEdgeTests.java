package TheCore.ListForestEdge;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ListForestEdgeTests {

    @Nested
    @DisplayName("List Forest Edge")
    public class CreateArrayTests {

        CreateArray nCA = new CreateArray();

        @Test
        public void nCATest1() {
            int[] tArray = {1, 1, 1, 1};
            assertArrayEquals(tArray, nCA.solution(4));
        }

        @Test
        public void nCATest2() {
            int[] tArray = {1, 1, 1, 1};
            assertArrayEquals(tArray, nCA.solution(4));
        }

        @Test
        public void nCATest3() {
            int[] tArray = {1};
            assertArrayEquals(tArray, nCA.solution(1));
        }

        @Test
        public void nCATest4() {
            int[] tArray = {1,1,1,1,1};
            assertArrayEquals(tArray, nCA.solution(5));
        }

        @Test
        public void nCATest5() {
            int[] tArray = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
            assertArrayEquals(tArray, nCA.solution(49));
        }

    }

    @Nested
    @DisplayName("Array Replace")
    public class ArrayReplaceTests {

        ArrayReplace aR = new ArrayReplace();

        @Test
        public void aRTest1() {
            int[] tArray = {3,2,3};
            assertArrayEquals(tArray, aR.solution(new int[]{1,2,1}, 1,3));
        }

        @Test
        public void aRTest2() {
            int[] tArray = {1, 2, 0, 4, 5};
            assertArrayEquals(tArray, aR.solution(new int[]{1, 2, 0, 4, 5}, 3,0));
        }

        @Test
        public void aRTest3() {
            int[] tArray = {10,10,10};
            assertArrayEquals(tArray, aR.solution(new int[]{1,1,1}, 1,10));
        }

        @Test
        public void aRTest4() {
            int[] tArray = {1, 1, 1, 1, 1};
            assertArrayEquals(tArray, aR.solution(new int[]{1, 2, 1, 2, 1}, 2,1));
        }

        @Test
        public void aRTest5() {
            int[] tArray = {1, 2, 1, 2, 1};
            assertArrayEquals(tArray, aR.solution(new int[]{1, 2, 1, 2, 1}, 2,2));
        }

        @Test
        public void aRTest6() {
            int[] tArray = {9,1};
            assertArrayEquals(tArray, aR.solution(new int[]{3,1}, 3,9));
        }

        @Test
        public void aRTest7() {
            int[] tArray = {10,10};
            assertArrayEquals(tArray, aR.solution(new int[]{10,10}, 0,9));
        }

        @Test
        public void aRTest8() {
            int[] tArray = {2,1};
            assertArrayEquals(tArray, aR.solution(new int[]{2,1}, 3,9));
        }

    }

    @Nested
    @DisplayName("First Reverse Try")
    public class FirstReverseTryTests {

        FirstReverseTry fRT = new FirstReverseTry();

        @Test
        public void fRTTest1() {
            int[] rArray = {5, 2, 3, 4, 1};
            assertArrayEquals(rArray, fRT.solution(new int[]{1, 2, 3, 4, 5}));
        }

        @Test
        public void fRTTest2() {
            int[] rArray = {};
            assertArrayEquals(rArray, fRT.solution(new int[]{}));
        }

        @Test
        public void fRTTest3() {
            int[] rArray = {239};
            assertArrayEquals(rArray, fRT.solution(new int[]{239}));
        }

        @Test
        public void fRTTest4() {
            int[] rArray = {324, 54, 12, 3, 4, 56, 23, 12, 5, 23};
            assertArrayEquals(rArray, fRT.solution(new int[]{23, 54, 12, 3, 4, 56, 23, 12, 5, 324}));
        }

        @Test
        public void fRTTest5() {
            int[] rArray = {1, -1};
            assertArrayEquals(rArray, fRT.solution(new int[]{-1, 1}));
        }

        @Test
        public void fRTTest6() {
            int[] rArray = {543, -101, -310, 818, 747, -888, -183, -687, -723, 188, -611, 677, -597, 293, -295, -162, -265, 368, 346, 81, -831, 198, -94, 685, -434, -241, -566, -397, 501, -183, 366, -669, 96, -592, 358, 598, 444, -929, 769, -361, -754, 218, -464, 332, 893, 422, -192, -287, -850, 88};
            assertArrayEquals(rArray, fRT.solution(new int[]{88, -101, -310, 818, 747, -888, -183, -687, -723, 188, -611, 677, -597, 293, -295, -162, -265, 368, 346, 81, -831, 198, -94, 685, -434, -241, -566, -397, 501, -183, 366, -669, 96, -592, 358, 598, 444, -929, 769, -361, -754, 218, -464, 332, 893, 422, -192, -287, -850, 543}));
        }

    }

    @Nested
    @DisplayName("Concatenate Arrays")
    public class ConcatenateArraysTests {

        ConcatenateArrays cA = new ConcatenateArrays();

        @Test
        public void cATest1() {
            int[] eO = {2, 2, 1, 10, 11};
            assertArrayEquals(eO, cA.solution(new int[]{2,2,1}, new int[]{10,11}));
        }

        @Test
        public void cATest2() {
            int[] eO = {1, 2, 3, 1, 2};
            assertArrayEquals(eO, cA.solution(new int[]{1,2}, new int[]{3,1,2}));
        }

        @Test
        public void cATest3() {
            int[] eO = {1};
            assertArrayEquals(eO, cA.solution(new int[]{1}, new int[]{}));
        }

        @Test
        public void cATest4() {
            int[] eO = {2, 10, 3, 9, 5, 11, 11, 4, 8, 1, 13, 3, 1, 14};
            assertArrayEquals(eO, cA.solution(new int[]{2, 10, 3, 9, 5, 11, 11}, new int[]{4, 8, 1, 13, 3, 1, 14}));
        }

        @Test
        public void cATest5() {
            int[] eO = {9, 6, 6, 9, 8, 14, 3, 2, 2, 5, 3, 11, 12, 9, 7, 7};
            assertArrayEquals(eO, cA.solution(new int[]{9, 6, 6, 9, 8, 14}, new int[]{3, 2, 2, 5, 3, 11, 12, 9, 7, 7}));
        }

    }
}