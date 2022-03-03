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

    @Nested
    @DisplayName("Candies")
    public class CandiesTest {

        Candies candies = new Candies();

        @Test
        public void candiesTest1() {
            assertEquals(9, candies.solution(3,10));
        }

        @Test
        public void candiesTest2() {
            assertEquals(2, candies.solution(1,2));
        }

        @Test
        public void candiesTest3() {
            assertEquals(0, candies.solution(10,5));
        }

        @Test
        public void candiesTest4() {
            assertEquals(4, candies.solution(4,4));
        }

        @Test
        public void candiesTest5() {
            assertEquals(12, candies.solution(4,15));
        }

        @Test
        public void candiesTest6() {
            assertEquals(99, candies.solution(9,100));
        }

        @Test
        public void candiesTest7() {
            assertEquals(0, candies.solution(8,2));
        }

        @Test
        public void candiesTest8() {
            assertEquals(3, candies.solution(3,3));
        }


        @Test
        public void candiesTest9() {
            assertEquals(7, candies.solution(7,10));
        }

        @Test
        public void candiesTest10() {
            assertEquals(21, candies.solution(3,23));
        }

    }

    @Nested
    @DisplayName("Seats in Theater")
    public class SeatsInTheaterTest {

        SeatsInTheater sIT = new SeatsInTheater();

        @Test
        public void sITTest1() {
            assertEquals(96, sIT.solution(16,11,5,3));
        }

        @Test
        public void sITTest2() {
            assertEquals(0, sIT.solution(1,1,1,1));
        }

        @Test
        public void sITTest3() {
            assertEquals(18, sIT.solution(13,6,8,3));
        }

        @Test
        public void sITTest4() {
            assertEquals(99, sIT.solution(60,100,60,1));
        }

        @Test
        public void sITTest5() {
            assertEquals(0, sIT.solution(1000,1000,1000,1000));
        }

    }
}
