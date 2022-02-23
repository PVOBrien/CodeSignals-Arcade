package Intro;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Nested
@DisplayName("Diving Deeper")
public class DivingDeeperTest {

    @Nested
    @DisplayName("Extract Each Kth")
    public class ExtractEachKthTest {

        ExtractEachKth eEK = new ExtractEachKth();

        @Test
        public void eEKTest1() {
            int[] inputArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            assertArrayEquals(new int[]{1, 2, 4, 5, 7, 8, 10}, eEK.solution(inputArr, 3));
        }

        @Test
        public void eEKTest2() {
            int[] inputArr = {1, 1, 1, 1, 1};
            assertArrayEquals(new int[0], eEK.solution(inputArr, 1));
        }

        @Test
        public void eEKTest3() {
            int[] inputArr = {1, 2, 1, 2, 1, 2, 1, 2};
            assertArrayEquals(new int[]{1, 1, 1, 1}, eEK.solution(inputArr, 2));
        }

        @Test
        public void eEKTest4() {
            int[] inputArr = {1, 2, 1, 2, 1, 2, 1, 2};
            assertArrayEquals(new int[]{1, 2, 1, 2, 1, 2, 1, 2}, eEK.solution(inputArr, 10));
        }

        @Test
        public void eEKTest5() {
            int[] inputArr = {2, 4, 6, 8, 10};
            assertArrayEquals(new int[]{2, 6, 10}, eEK.solution(inputArr, 2));
        }

    }

}
