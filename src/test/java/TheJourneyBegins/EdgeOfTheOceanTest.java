package TheJourneyBegins;

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
}
