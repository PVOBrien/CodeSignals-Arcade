package Intro;

import org.checkerframework.checker.units.qual.A;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Edge of the Ocean")
public class EdgeOfTheOceanTest {

    @Nested
    @DisplayName("Adjacent Elements Product")
    public class AdjacentElementsProductTest {

        AdjacentElementsProduct aEP = new AdjacentElementsProduct();

        @Test
        public void aEPT1() {
            int[] inputArray = new int[]{3, 6, -2, -5, 7, 3};
            assertEquals(21, aEP.solution(inputArray));
        }

        @Test
        public void aEPT2() {
            int[] inputArray = new int[]{-1, -2};
            assertEquals(2, aEP.solution(inputArray));
        }

        @Test
        public void aEPT3() {
            int[] inputArray = new int[]{5, 1, 2, 3, 1, 4};
            assertEquals(6, aEP.solution(inputArray));
        }

        @Test
        public void aEPT4() {
            int[] inputArray = new int[]{1, 2, 3, 0};
            assertEquals(6, aEP.solution(inputArray));
        }

        @Test
        public void aEPT5() {
            int[] inputArray = new int[]{9, 5, 10, 2, 24, -1, -48};
            assertEquals(50, aEP.solution(inputArray));
        }

        @Test
        public void aEPT6() {
            int[] inputArray = new int[]{5, 6, -4, 2, 3, 2, -23};
            assertEquals(30, aEP.solution(inputArray));
        }

        @Test
        public void aEPT7() {
            int[] inputArray = new int[]{4, 1, 2, 3, 1, 5};
            assertEquals(6, aEP.solution(inputArray));
        }

        @Test
        public void aEPT8() {
            int[] inputArray = new int[]{-23, 4, -3, 8, -12};
            assertEquals(-12, aEP.solution(inputArray));
        }

        @Test
        public void aEPT9() {
            int[] inputArray = new int[]{1, 0, 1, 0, 1000};
            assertEquals(0, aEP.solution(inputArray));
        }
    }

    @Nested
    @DisplayName("Shape Area")
    public class ShapeAreaTest {

        ShapeArea sAT = new ShapeArea();

        @Test
        public void sAT1() { assertEquals(5, sAT.solution(2)); }

        @Test
        public void sAT2() { assertEquals(13, sAT.solution(3)); }

        @Test
        public void sAT3() { assertEquals(1, sAT.solution(1)); }

        @Test
        public void sAT4() { assertEquals(41, sAT.solution(5)); }

        @Test
        public void sAT5() { assertEquals(97986001, sAT.solution(7000)); }

        @Test
        public void sAT6() { assertEquals(127984001, sAT.solution(8000)); }

        @Test
        public void sAT7() { assertEquals(199940005, sAT.solution(9999)); }

        @Test
        public void sAT8() { assertEquals(199900013, sAT.solution(9998)); }

        @Test
        public void sAT9() { assertEquals(161946005, sAT.solution(8999)); }

        @Test
        public void sAT10() { assertEquals(19801, sAT.solution(100)); }
    }

    @Nested
    @DisplayName("Make Array Consecutive Two")
    public class MakeArrayConsecutiveTwoTest {

        MakeArrayConsecutiveTwo mACTT = new MakeArrayConsecutiveTwo();

        @Test
        public void mACTT1() {
            int[] testArr = new int[]{6, 2, 3, 8};
            assertEquals(3, mACTT.solution(testArr));
        }

        @Test
        public void mACTT2() {
            int[] testArr = new int[]{0, 3};
            assertEquals(2, mACTT.solution(testArr));
        }

        @Test
        public void mACTT3() {
            int[] testArr = new int[]{5, 4, 6};
            assertEquals(0, mACTT.solution(testArr));
        }
        @Test
        public void mACTT4() {
            int[] testArr = new int[]{6, 3};
            assertEquals(2, mACTT.solution(testArr));
        }
        @Test
        public void mACTT5() {
            int[] testArr = new int[]{1};
            assertEquals(0, mACTT.solution(testArr));
        }
    }

    @Nested
    @DisplayName("Almost Increasing Sequence")
    public class AlmostIncreasingSequenceTest {

        AlmostIncreasingSequence aIS = new AlmostIncreasingSequence();

        @Test
        public void aIST1() {
            int[] testArr = new int[]{1, 3, 2, 1};
            assertFalse(aIS.solution(testArr));
        }

        @Test
        public void aIST2() {
            int[] testArr = new int[]{1, 3, 2};
            assertTrue(aIS.solution(testArr));
        }

        @Test
        public void aIST3() {
            int[] testArr = new int[]{1, 2, 1, 2};
            assertFalse(aIS.solution(testArr));
        }

        @Test
        public void aIST4() {
            int[] testArr = new int[]{3, 6, 5, 8, 10, 20, 15};
            assertFalse(aIS.solution(testArr));
        }

        @Test
        public void aIST5() {
            int[] testArr = new int[]{1, 1, 2, 3, 4, 4};
            assertFalse(aIS.solution(testArr));
        }

        @Test
        public void aIST6() {
            int[] testArr = new int[]{1, 4, 10, 4, 2};
            assertFalse(aIS.solution(testArr));
        }

        @Test
        public void aIST7() {
            int[] testArr = new int[]{10, 1, 2, 3, 4, 5};
            assertTrue(aIS.solution(testArr));
        }

        @Test
        public void aIST8() {
            int[] testArr = new int[]{1, 1, 1, 2, 3};
            assertFalse(aIS.solution(testArr));
        }

        @Test
        public void aIST9() {
            int[] testArr = new int[]{0, -2, 5, 6};
            assertTrue(aIS.solution(testArr));
        }

        @Test
        public void aIST10() {
            int[] testArr = new int[]{1, 2, 3, 4, 5, 3, 5, 6};
            assertFalse(aIS.solution(testArr));
        }

        @Test
        public void aIST11() {
            int[] testArr = new int[]{40, 50, 60, 10, 20, 30};
            assertFalse(aIS.solution(testArr));
        }

        @Test
        public void aIST12() {
            int[] testArr = new int[]{1, 1};
            assertTrue(aIS.solution(testArr));
        }

        @Test
        public void aIST13() {
            int[] testArr = new int[]{1, 2, 5, 3, 5};
            assertTrue(aIS.solution(testArr));
        }

        @Test
        public void aIST14() {
            int[] testArr = new int[]{1, 2, 5, 5, 5};
            assertFalse(aIS.solution(testArr));
        }

        @Test
        public void aIST15() {
            int[] testArr = new int[]{10, 1, 2, 3, 4, 5, 6, 1};
            assertFalse(aIS.solution(testArr));
        }

        @Test
        public void aIST16() {
            int[] testArr = new int[]{1, 2, 3, 4, 3, 6};
            assertTrue(aIS.solution(testArr));
        }

        @Test
        public void aIST17() {
            int[] testArr = new int[]{1, 2, 3, 4, 99, 5, 6};
            assertTrue(aIS.solution(testArr));
        }

        @Test
        public void aIST18() {
            int[] testArr = new int[]{123, -17, -5, 1, 2, 3, 12, 43, 45};
            assertTrue(aIS.solution(testArr));
        }

        @Test
        public void aIST19() {
            int[] testArr = new int[]{3, 5, 67, 98, 3};
            assertTrue(aIS.solution(testArr));
        }
    }
}
