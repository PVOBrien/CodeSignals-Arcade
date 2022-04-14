package TheCore.ListForestEdge;

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

}