package Intro;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Island of Knowledge")
public class IslandOfKnowledgeTest {

    @Nested
    @DisplayName("Are Equally Strong")
    public class AreEquallyStrongTest {

        AreEquallyStrong aES = new AreEquallyStrong();

        @Test
        public void aESTest1() {
            assertTrue(aES.solution(10, 15, 15, 10));
        }

        @Test
        public void aESTest2() {
            assertTrue(aES.solution(15, 10, 15, 10));
        }

        @Test
        public void aESTest3() {
            assertFalse(aES.solution(15, 10, 15, 9));
        }

        @Test
        public void aESTest4() {
            assertTrue(aES.solution(10, 5, 5, 10));
        }

        @Test
        public void aESTest5() {
            assertFalse(aES.solution(10, 15, 5, 20));
        }

        @Test
        public void aESTest6() {
            assertTrue(aES.solution(10, 20, 10, 20));
        }

        @Test
        public void aESTest7() {
            assertTrue(aES.solution(5, 20, 20, 5));
        }

        @Test
        public void aESTest8() {
            assertFalse(aES.solution(20, 15, 5, 20));
        }

        @Test
        public void aESTest9() {
            assertTrue(aES.solution(5, 10, 5, 10));
        }

        @Test
        public void aESTest10() {
            assertFalse(aES.solution(1, 10, 10, 0));
        }

        @Test
        public void aESTest11() {
            assertFalse(aES.solution(5, 5, 10, 10));
        }

        @Test
        public void aESTest12() {
            assertFalse(aES.solution(5, 10, 5, 6));
        }

        @Test
        public void aESTest13() {
            assertTrue(aES.solution(1, 1, 1, 1));
        }

        @Test
        public void aESTest14() {
            assertTrue(aES.solution(0, 10, 10, 0));
        }

    }

    @Nested
    @DisplayName("Array Maximal Adjacent Difference")
    public class ArrayMaximalAdjacentDifferenceTest {

        ArrayMaximalAdjacentDifference aMAD = new ArrayMaximalAdjacentDifference();

        @Test
        public void aMADTest1() {
            assertEquals(3, aMAD.solution(new int[]{2, 4, 1, 0}));
        }

        @Test
        public void aMADTest2() {
            assertEquals(0, aMAD.solution(new int[]{1, 1, 1, 1}));
        }

        @Test
        public void aMADTest3() {
            assertEquals(7, aMAD.solution(new int[]{-1, 4, 10, 3, -2}));
        }

        @Test
        public void aMADTest4() {
            assertEquals(2, aMAD.solution(new int[]{10, 11, 13}));
        }

        @Test
        public void aMADTest5() {
            assertEquals(0, aMAD.solution(new int[]{-2, -2, -2, -2, -2}));
        }

        @Test
        public void aMADTest6() {
            assertEquals(4, aMAD.solution(new int[]{-1, 1, -3, -4}));
        }

        @Test
        public void aMADTest7() {
            assertEquals(30, aMAD.solution(new int[]{-14, 15, -15}));
        }

    }

    @Nested
    @DisplayName("Is IPv4 Address")
    public class ISIPv4AddressTest {

        ISIPv4Address iIPA = new ISIPv4Address();

        @Test
        public void iIPATest1() {
            assertTrue(iIPA.solution("172.16.254.1"));
        }

        @Test
        public void iIPATest2() {
            assertFalse(iIPA.solution("172.316.254.1"));
        }

        @Test
        public void iIPATest3() {
            assertFalse(iIPA.solution(".254.255.0"));
        }

        @Test
        public void iIPATest4() {
            assertFalse(iIPA.solution("1.1.1.1a"));
        }

        @Test
        public void iIPATest5() {
            assertFalse(iIPA.solution("1"));
        }

        @Test
        public void iIPATest6() {
            assertTrue(iIPA.solution("0.254.255.0"));
        }

        @Test
        public void iIPATest7() {
            assertFalse(iIPA.solution("1.23.256.255."));
        }

        @Test
        public void iIPATest8() {
            assertFalse(iIPA.solution("1.23.256.."));
        }

        @Test
        public void iIPATest9() {
            assertFalse(iIPA.solution("0..1.0"));
        }

        @Test
        public void iIPATest10() {
            assertFalse(iIPA.solution("64.233.161.00"));
        }

        @Test
        public void iIPATest11() {
            assertFalse(iIPA.solution("64.00.161.131"));
        }

        @Test
        public void iIPATest12() {
            assertFalse(iIPA.solution("01.233.161.131"));
        }

        @Test
        public void iIPATest13() {
            assertFalse(iIPA.solution("35..36.9.9.0"));
        }

        @Test
        public void iIPATest14() {
            assertFalse(iIPA.solution("1.1.1.1.1"));
        }

        @Test
        public void iIPATest15() {
            assertFalse(iIPA.solution("1.256.1.1"));
        }

        @Test
        public void iIPATest16() {
            assertFalse(iIPA.solution("a0.1.1.1"));
        }

        @Test
        public void iIPATest17() {
            assertFalse(iIPA.solution("0.1.1.256"));
        }

        @Test
        public void iIPATest18() {
            assertFalse(iIPA.solution("129380129831213981.255.255.255"));
        }

        @Test
        public void iIPATest19() {
            assertFalse(iIPA.solution("255.255.255.255abcdekjhf"));
        }

        @Test
        public void iIPATest20() {
            assertFalse(iIPA.solution("7283728"));
        }

        @Test
        public void iIPATest21() {
            assertFalse(iIPA.solution("0..1.0.0"));
        }

    }

    @Nested
    @DisplayName("Avoid Obstacles")
    public class AvoidObstaclesTest {

        AvoidObstacles aO = new AvoidObstacles();

        @Test
        public void aOTest1() {
            assertEquals(4, aO.solution(new int[]{2, 3, 6, 7, 9}));
        }

        @Test
        public void aOTest2() {
            assertEquals(4, aO.solution(new int[]{2, 3}));
        }

        @Test
        public void aOTest3() {
            assertEquals(7, aO.solution(new int[]{1, 4, 10, 6, 2}));
        }

        @Test
        public void aOTest4() {
            assertEquals(6, aO.solution(new int[]{1000, 999}));
        }

        @Test
        public void aOTest5() {
            assertEquals(3, aO.solution(new int[]{19, 32, 11, 23}));
        }

        @Test
        public void aOTest6() {
            assertEquals(6, aO.solution(new int[]{5, 8, 9, 13, 14}));
        }

    }

    @Nested
    @DisplayName("Box Blur")
    public class BoxBlurTest {

        BoxBlur bB = new BoxBlur();

        @Test
        public void bBTest1() {
            assertArrayEquals(new int[][]{{1}}, bB.solution(new int[][]{{1, 1, 1}, {1, 7, 1}, {1, 1, 1}}));
        }

        @Test
        public void bBTest2() {
            assertArrayEquals(new int[][]{{28}}, bB.solution(new int[][]{{0, 18, 9}, {27, 9, 0}, {81, 63, 45}}));
        }

        @Test
        public void bBTest3() {
            assertArrayEquals(new int[][]{{40, 30}}, bB.solution(new int[][]{{36, 0, 18, 9}, {27, 54, 9, 0}, {81, 63, 72, 45}}));
        }

        @Test
        public void bBTest4() {
            assertArrayEquals(new int[][]{{5, 4}, {4, 4}}, bB.solution(new int[][]{{7, 4, 0, 1}, {5, 6, 2, 2}, {6, 10, 7, 8}, {1, 4, 2, 0}}));
        }

        @Test
        public void bBTest5() {
            assertArrayEquals(new int[][]{{39, 30, 26, 25, 31},
                            {34, 37, 35, 32, 32},
                            {38, 41, 44, 46, 42},
                            {22, 24, 31, 39, 45},
                            {37, 34, 36, 47, 59}},
                    bB.solution(new int[][]{{36, 0, 18, 9, 9, 45, 27},
                            {27, 0, 54, 9, 0, 63, 90},
                            {81, 63, 72, 45, 18, 27, 0},
                            {0, 0, 9, 81, 27, 18, 45},
                            {45, 45, 27, 27, 90, 81, 72},
                            {45, 18, 9, 0, 9, 18, 45},
                            {27, 81, 36, 63, 63, 72, 81}}));
        }

        @Test
        public void bBTest6() {
            assertArrayEquals(new int[][]{{82, 73, 48, 25, 31},
                            {77, 80, 57, 32, 32},
                            {81, 106, 88, 68, 42},
                            {44, 96, 103, 89, 45},
                            {59, 113, 137, 126, 80}},
                    bB.solution(new int[][]{{36, 0, 18, 9, 9, 45, 27},
                            {27, 0, 254, 9, 0, 63, 90},
                            {81, 255, 72, 45, 18, 27, 0},
                            {0, 0, 9, 81, 27, 18, 45},
                            {45, 45, 227, 227, 90, 81, 72},
                            {45, 18, 9, 255, 9, 18, 45},
                            {27, 81, 36, 127, 255, 72, 81}}));
        }
    }

    @Nested
    @DisplayName("Minesweeper")
    public class MinesweeperTest {

        Minesweeper mS = new Minesweeper();

        @Test
        public void mSTest1() {
            assertArrayEquals(new int[][]{{1, 2, 1}, {2, 1, 1}, {1, 1, 1}},
                    mS.solution(new boolean[][]{{true, false, false}, {false, true, false}, {false, false, false}}));
        }

        @Test
        public void mSTest2() {
            assertArrayEquals(new int[][]{{0, 0, 0}, {0, 0, 0}}, mS.solution(new boolean[][]{{false, false, false}, {false, false, false}}));
        }

        @Test
        public void mSTest3() {
            assertArrayEquals(new int[][]{{0,2,2,1}, {3,4,3,3}, {1,2,3,1}},
                    mS.solution(new boolean[][]{{true,false,false,true},
                                                {false,false,true,false},
                                                {true,true,false,true}}));
        }

        @Test
        public void mSTest4() {
            assertArrayEquals(new int[][]{{3,5,3}, {5,8,5}, {3,5,3}},
                    mS.solution(new boolean[][]{{true,true,true},
                                                {true,true,true},
                                                {true,true,true}}));
        }

        @Test
        public void mSTest5() {
            assertArrayEquals(new int[][]{{3,3,3,2}, {2,4,5,2}, {2,3,2,2}},
                    mS.solution(new boolean[][]{{false,true,true,false},
                                                {true,true,false,true},
                                                {false,false,true,false}}));
        }

        @Test
        public void mSTest6() {
            assertArrayEquals(new int[][]{{1,2}, {2,3}, {2,1}, {1,1}, {0,0}},
                    mS.solution(new boolean[][]{{true,false},
                                                {true,false},
                                                {false,true},
                                                {false,false},
                                                {false,false}}));
        }

    }
}