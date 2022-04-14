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



}
