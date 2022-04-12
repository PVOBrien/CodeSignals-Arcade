package TheCore.LoopTunnel;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Loop Tunnel Tests")
public class LoopTunnelTests {

    @Nested
    @DisplayName("Least Factorial")
    public class LeastFactorialTest{

        LeastFactorial lF = new LeastFactorial();

        @Test
        public void lfTest1() {
            assertEquals(24, lF.solution(17));
        }

        @Test
        public void lfTest2() {
            assertEquals(1, lF.solution(1));
        }

        @Test
        public void lfTest3() {
            assertEquals(6, lF.solution(5));
        }

        @Test
        public void lfTest4() {
            assertEquals(120, lF.solution(25));
        }

        @Test
        public void lfTest5() {
            assertEquals(24, lF.solution(18));
        }

        @Test
        public void lfTest6() {
            assertEquals(120, lF.solution(109));
        }

        @Test
        public void lfTest7() {
            assertEquals(120, lF.solution(106));
        }

        @Test
        public void lfTest8() {
            assertEquals(24, lF.solution(11));
        }

        @Test
        public void lfTest9() {
            assertEquals(120, lF.solution(55));
        }

        @Test
        public void lfTest10() {
            assertEquals(24, lF.solution(24));
        }

    }

    @Nested
    @DisplayName("CountSumTwoReps2")
    public class CountSumTwoReps2Test {

        CountSumTwoReps2 cSTRTwo = new CountSumTwoReps2();

        @Test
        public void cSTRTwo1() {
            assertEquals(2, cSTRTwo.solution(6,2,4));
        }

        @Test
        public void cSTRTwo2() {
            assertEquals(1, cSTRTwo.solution(6,3,3));
        }

        @Test
        public void cSTRTwo3() {
            assertEquals(0, cSTRTwo.solution(10,9,11));
        }

        @Test
        public void cSTRTwo4() {
            assertEquals(5, cSTRTwo.solution(24,8,16));
        }

        @Test
        public void cSTRTwo5() {
            assertEquals(1, cSTRTwo.solution(24,12,12));
        }

        @Test
        public void cSTRTwo6() {
            assertEquals(12, cSTRTwo.solution(93,24,58));
        }

    }

    @Nested
    @DisplayName("Magical Well")
    public class MagicalWellTest {

        MagicalWell mW = new MagicalWell();

        @Test
        public void mWTest1() {
            assertEquals(8, mW.solution(1,2,2));
        }

        @Test
        public void mWTest2() {
            assertEquals(1, mW.solution(1,1,1));
        }

        @Test
        public void mWTest3() {
            assertEquals(128, mW.solution(6,5,3));
        }

        @Test
        public void mWTest4() {
            assertEquals(0, mW.solution(1601,337,0));
        }

        @Test
        public void mWTest5() {
            assertEquals(0, mW.solution(1891,332,0));
        }

        @Test
        public void mWTest6() {
            assertEquals(17800540, mW.solution(1936,1835,5));
        }

        @Test
        public void mWTest7() {
            assertEquals(110113, mW.solution(957,57,2));
        }

        @Test
        public void mWTest8() {
            assertEquals(0, mW.solution(687,1337,0));
        }

        @Test
        public void mWTest9() {
            assertEquals(3060400, mW.solution(491,1552,4));
        }

        @Test
        public void mWTest10() {
            assertEquals(924738, mW.solution(1275,362,2));
        }

    }

    @Nested
    @DisplayName("Line Up")
    public class LineUpTest {

        LineUp lU = new LineUp();

        @Test
        public void lUTest1(){
            assertEquals(3, lU.solution("LLARL"));
        }

        @Test
        public void lUTest2(){
            assertEquals(1, lU.solution("RLR"));
        }

        @Test
        public void lUTest3(){
            assertEquals(0, lU.solution(""));
        }

        @Test
        public void lUTest4(){
            assertEquals(0, lU.solution("L"));
        }

        @Test
        public void lUTest5(){
            assertEquals(1, lU.solution("A"));
        }

        @Test
        public void lUTest6(){
            assertEquals(15, lU.solution("AAAAAAAAAAAAAAA"));
        }

        @Test
        public void lUTest7(){
            assertEquals(16, lU.solution("RRRRRRRRRRLLLLLLLLLRRRRLLLLLLLLLL"));
        }

        @Test
        public void lUTest8(){
            assertEquals(5, lU.solution("AALAAALARAR"));
        }

    }

    @Nested
    @DisplayName("Addition Without Carrying")
    public class AddWithoutCarryTest {

        AddWithoutCarry aWC = new AddWithoutCarry();

        @Test
        public void aWCTest1() {
            assertEquals(1180, aWC.solution(456, 1734));
        }

        @Test
        public void aWCTest2() {
            assertEquals(99999,aWC.solution(99999, 0));
        }

        @Test
        public void aWCTest3() {
            assertEquals(888,aWC.solution(999, 999));
        }

        @Test
        public void aWCTest4() {
            assertEquals(0, 0, 0);
        }

        @Test
        public void aWCTest5() {
            assertEquals(8642, 54321, 54321);
        }

        @Test
        public void aWCTest6() {
            assertEquals(0, 54321, 56789);
        }

    }

    @Nested
    @DisplayName("Apple Boxes")
    public class AppleBoxesTest {

        AppleBoxes aB = new AppleBoxes();

        @Test
        public void aBTest1() {
            assertEquals(-15, aB.solution(5));
        }

        @Test
        public void aBTest2() {
            assertEquals(-120, aB.solution(15));
        }

        @Test
        public void aBTest3() {
            assertEquals(666, aB.solution(36));
        }

        @Test
        public void aBTest4() {
            assertEquals(-1, aB.solution(1));
        }

        @Test
        public void aBTest5() {
            assertEquals(105, aB.solution(14));
        }

        @Test
        public void aBTest6() {
            assertEquals(78, aB.solution(12));
        }

        @Test
        public void aBTest7() {
            assertEquals(-45, aB.solution(9));
        }

        @Test
        public void aBTest8() {
            assertEquals(820, aB.solution(40));
        }

        @Test
        public void aBTest9() {
            assertEquals(-703, aB.solution(37));
        }

    }

    @Nested
    @DisplayName("Increase Number Roundness")
    public class IncreaseNumRoundnessTest {

        IncreaseNumRoundness iNR = new IncreaseNumRoundness();

        @Test
        public void iNRTest1() {
            assertTrue(iNR.solution(902200100));
        }

        @Test
        public void iNRTest2() {
            assertFalse(iNR.solution(11000));
        }

        @Test
        public void iNRTest3() {
            assertTrue(iNR.solution(99080));
        }

        @Test
        public void iNRTest4() {
            assertTrue(iNR.solution(1022220));
        }

        @Test
        public void iNRTest5() {
            assertTrue(iNR.solution(106611));
        }

        @Test
        public void iNRTest6() {
            assertFalse(iNR.solution(234230));
        }

        @Test
        public void iNRTest7() {
            assertFalse(iNR.solution(888));
        }

        @Test
        public void iNRTest8() {
            assertFalse(iNR.solution(100));
        }

        @Test
        public void iNRTest9() {
            assertFalse(iNR.solution(1000000000));
        }

        @Test
        public void iNRTest10() {
            assertTrue(iNR.solution(103456789));
        }

    }

    @Nested
    @DisplayName("Rounders")
    public class RoundersTest {

        Rounders rounders = new Rounders();

        @Test
        public void roundersTest1() {
            assertEquals(20, rounders.solution(15));
        }

        @Test
        public void roundersTest2() {
            assertEquals(1000, rounders.solution(1234));
        }

        @Test
        public void roundersTest3() {
            assertEquals(2000, rounders.solution(1445));
        }

        @Test
        public void roundersTest4() {
            assertEquals(10, rounders.solution(14));
        }

        @Test
        public void roundersTest5() {
            assertEquals(10, rounders.solution(10));
        }

        @Test
        public void roundersTest6() {
            assertEquals(7000, rounders.solution(7001));
        }

        @Test
        public void roundersTest7() {
            assertEquals(100, rounders.solution(99));
        }

    }
}