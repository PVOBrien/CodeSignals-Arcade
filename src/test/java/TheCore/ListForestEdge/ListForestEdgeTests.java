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

    @Nested
    @DisplayName("Remove Array Part")
    public class RemoveArrayPartTests {

        RemoveArrayPart rAP = new RemoveArrayPart();

        @Test
        public void rAPTest1() {
            int[] rArray = {2, 3, 5};
            assertArrayEquals(rArray, rAP.solution(new int[]{2, 3, 2, 3, 4, 5}, 2,4));
        }

        @Test
        public void rAPTest2() {
            int[] rArray = {1};
            assertArrayEquals(rArray, rAP.solution(new int[]{2, 4, 10, 1}, 0,2));
        }

        @Test
        public void rAPTest3() {
            int[] rArray = {5, 2, 3, 4};
            assertArrayEquals(rArray, rAP.solution(new int[]{5, 3, 2, 3, 4}, 1,1));
        }

        @Test
        public void rAPTest4() {
            int[] rArray = {};
            assertArrayEquals(rArray, rAP.solution(new int[]{1,1}, 0,1));
        }

        @Test
        public void rAPTest5() {
            int[] rArray = {0, -2, 5};
            assertArrayEquals(rArray, rAP.solution(new int[]{0, -2, 5, 6}, 3,3));
        }

        @Test
        public void rAPTest6() {
            int[] rArray = {4, 3, 4, 5};
            assertArrayEquals(rArray, rAP.solution(new int[]{4, 3, 2, 1, 3, 4, 5}, 1,3));
        }

        @Test
        public void rAPTest7() {
            int[] rArray = {24, -40, -30, 30, 80, -94, 18, -56, -31, -68, -94, 67, -28, -2, -10, -83, -41, 43, -27, 88};
            assertArrayEquals(rArray, rAP.solution(new int[]{24, -40, -30, 30, 80, -94, 18, -56, -31, -68, -94, 67, -28, -2, -10, -83, -41, 43, -27, 0, -39, -83, -76, -59, -32, 87, -31, -55, -35, 20, 67, -78, -32, -90, 72, 15, -59, 4, 69, -82, 2, 96, -99, -78, 93, -68, -39, 68, 49, -9, -49, 77, 81, -55, -16, -9, -11, 80, 29, -6, 90, 83, 16, 68, -62, -73, -5, -86, 0, -48, 88, -35, 87, 12, 92, 12, 46, 57, 71, 91, -55, -62, -24, -78, -40, 30, -97, 64, -9, 40, 93, -67, -26, 53, -81, -7, -16, 14, -70, 88}, 19,98));
        }

        @Test
        public void rAPTest8() {
            int[] rArray = {};
            assertArrayEquals(rArray, rAP.solution(new int[]{66, -94, -83, -39, -27, 50, 58, 58, -68, -85, 55, -21, 83, -89, 52, -80, 17, -89, -56, 90, 75, 23, -74, -91, 93, -36, 90, 97, 52, 8, 0, -88, -5, -34, 55, 88, 96, -29, 30, -51, -69, 57, 85, -86, -47, 85, 77, 62, 55, 11, -4, 85, 32, 96, 69, 80, 78, -79, 70, 79, 77, 98, 85, 94, -34, 21, 5, 19, 85, 54, 50, 6, 31, -100, 74, -32, 35, 38, 59, 43, 89, 89, -60, 36, 46, 78, 43, 53, 84, -76, -24, -53, -5, 91, 100, 65, 23, 87, 20, 5}, 0,99));
        }

    }

    @Nested
    @DisplayName("Is Smooth")
    public class IsSmoothTests {

        IsSmooth iS = new IsSmooth();

        @Test
        public void iSTest1() {
            assertTrue(iS.solution(new int[]{7, 2, 2, 5, 10, 7}));
        }

        @Test
        public void iSTest2() {
            assertFalse(iS.solution(new int[]{-5, -5, 10}));
        }

        @Test
        public void iSTest3() {
            assertTrue(iS.solution(new int[]{7, 2, 2, 5, 10, 7}));
        }

        @Test
        public void iSTest4() {
            assertFalse(iS.solution(new int[]{45, 23, 12, 33, 12, 453, -234, -45}));
        }

        @Test
        public void iSTest5() {
            assertTrue(iS.solution(new int[]{-12, 34, 40, -5, -12, 4, 0, 0, -12}));
        }

        @Test
        public void iSTest6() {
            assertFalse(iS.solution(new int[]{9, 0, 15, 9}));
        }

        @Test
        public void iSTest7() {
            assertFalse(iS.solution(new int[]{-6, 6, -6}));
        }

        @Test
        public void iSTest8() {
            assertFalse(iS.solution(new int[]{26, 26, -17}));
        }

        @Test
        public void iSTest9() {
            assertFalse(iS.solution(new int[]{-7, 5, 5, 10}));
        }

        @Test
        public void iSTest10() {
            assertFalse(iS.solution(new int[]{3, 4, 5}));
        }

        @Test
        public void iSTest11() {
            assertFalse(iS.solution(new int[]{-5, 3, -1, 9}));
        }

    }
}