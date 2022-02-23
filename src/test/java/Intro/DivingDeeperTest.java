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

    @Nested
    @DisplayName("First Digit")
    public class FirstDigitTest {

        FirstDigit fD = new FirstDigit();

        @Test
        public void fdTest1() {
            assertEquals('1', fD.solution("var_1__Int"));
        }

        @Test
        public void fdTest2() {
            assertEquals('2', fD.solution("q2q-q\""));
        }

        @Test
        public void fdTest3() {
            assertEquals('0', fD.solution("0ss"));
        }

        @Test
        public void fdTest4() {
            assertEquals('2', fD.solution("_Aas_23"));
        }

        @Test
        public void fdTest5() {
            assertEquals('9', fD.solution("a a_933"));
        }

        @Test
        public void fdTest6() {
            assertEquals('0', fD.solution("ok0"));
        }

    }

}
