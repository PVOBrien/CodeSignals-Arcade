package TheCore;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Intro Gates")
public class IntroGatesTests {


    @Nested
    @DisplayName("Add Two Digits")
    public class AddTwoDigitsTest {

        AddTwoDigits aTD = new AddTwoDigits();

        @Test
        public void aTD1() {
            assertEquals(11, aTD.solution(29));
        }

        @Test
        public void aTD2() {
            assertEquals(12, aTD.solution(48));
        }

        @Test
        public void aTD3() {
            assertEquals(7, aTD.solution(25));
        }

        @Test
        public void aTD4() {
            assertEquals(18, aTD.solution(99));
        }

        @Test
        public void aTD5() {
            assertEquals(11, aTD.solution(29));
        }

        @Test
        public void aTD6() {
            assertEquals(11, aTD.solution(29));
        }

        @Test
        public void aTD7() {
            assertEquals(8, aTD.solution(44));
        }

        @Test
        public void aTD8() {
            assertEquals(12, aTD.solution(39));
        }

        @Test
        public void aTD9() {
            assertEquals(8, aTD.solution(26));
        }

        @Test
        public void aTD10() {
            assertEquals(11, aTD.solution(29));
        }

    }

    @Nested
    @DisplayName("Largest Number")
    public class LargestNumberTest {

        LargestNumber lN = new LargestNumber();

        @Test
        public void lNTest1(){
            assertEquals(99, lN.solution(2));
        }

        @Test
        public void lNTest2(){
            assertEquals(9, lN.solution(1));
        }

        @Test
        public void lNTest3(){
            assertEquals(9999999, lN.solutionViaString(7));
        }

        @Test
        public void lNTest4(){
            assertEquals(9999, lN.solutionViaString(4));
        }

        @Test
        public void lNTest5(){
            assertEquals(999, lN.solution(3));
        }

    }
}
