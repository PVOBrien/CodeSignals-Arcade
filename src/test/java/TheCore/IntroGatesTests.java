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

    @Nested
    @DisplayName("MaxMultiple")
    public class MaxMultipleTest {

        MaxMultiple mM = new MaxMultiple();

        @Test
        public void mMTest1() {
            assertEquals(9, mM.solution(3,10));
        }

        @Test
        public void mMTest2() {
            assertEquals(6, mM.solution(2,7));
        }

        @Test
        public void mMTest3() {
            assertEquals(50, mM.solution(10,50));
        }

        @Test
        public void mMTest4() {
            assertEquals(98, mM.solution(7,100));
        }

        @Test
        public void mMTest5() {
            assertEquals(14, mM.solution(7,20));
        }

        @Test
        public void mMTest6() {
            assertEquals(10, mM.solution(5,13));
        }

        @Test
        public void mMTest7() {
            assertEquals(88, mM.solution(8,88));
        }

        @Test
        public void mMTest8() {
            assertEquals(100, mM.solution(10,100));
        }

        @Test
        public void mMTest9() {
            assertEquals(4, mM.solution(2,5));
        }

        @Test
        public void mMTest10() {
            assertEquals(3, mM.solution(3,5));
        }

        @Test
        public void mMTest11() {
            assertEquals(9, mM.solution(9,11));
        }

        @Test
        public void mMTest12() {
            assertEquals(8, mM.solution(8,15));
        }

        @Test
        public void mMTest13() {
            assertEquals(54, mM.solution(9,60));
        }
    }

    @Nested
    @DisplayName("Circle of Numbers")
    public class CircleOfNumbersTest {

        CircleofNumbers cON = new CircleofNumbers();

        @Test
        public void cONTest1(){
            assertEquals(7, cON.solution(10,2));
        }

        @Test
        public void cONTest2(){
            assertEquals(2, cON.solution(10,7));
        }

        @Test
        public void cONTest3(){
            assertEquals(3, cON.solution(4,1));
        }

        @Test
        public void cONTest4(){
            assertEquals(0, cON.solution(6,3));
        }

        @Test
        public void cONTest5(){
            assertEquals(15, cON.solution(18,6));
        }

        @Test
        public void cONTest6(){
            assertEquals(4, cON.solution(12,10));
        }

        @Test
        public void cONTest7(){
            assertEquals(14, cON.solution(18,5));
        }

    }

    @Nested
    @DisplayName("Late Ride")
    public class LateRideTest {

        LateRide lR = new LateRide();

        @Test
        public void lRTest1() {
            assertEquals(4, lR.solution(240));
        }

        @Test
        public void lRTest2() {
            assertEquals(14, lR.solution(808));
        }

        @Test
        public void lRTest3() {
            assertEquals(19, lR.solution(1439));
        }

        @Test
        public void lRTest4() {
            assertEquals(0, lR.solution(0));
        }

        @Test
        public void lRTest5() {
            assertEquals(5, lR.solution(23));
        }

        @Test
        public void lRTest6() {
            assertEquals(8, lR.solution(8));
        }

    }

    @Nested
    @DisplayName("Phone Call")
    public class PhoneCallTest {

        PhoneCall pC = new PhoneCall();

        @Test
        public void pCTest1() {
            assertEquals(14, pC.solution(3,1,2,20));
        }

        @Test
        public void pCTest2() {
            assertEquals(1, pC.solution(2,2,1,2));
        }

        @Test
        public void pCTest3() {
            assertEquals(11, pC.solution(10,1,2,22));
        }

        @Test
        public void pCTest4() {
            assertEquals(14, pC.solution(2,2,1,24));
        }

        @Test
        public void pCTest5() {
            assertEquals(3, pC.solution(1,2,1,6));
        }

        @Test
        public void pCTest6() {
            assertEquals(0, pC.solution(10,10,10,8));
        }

    }
}
