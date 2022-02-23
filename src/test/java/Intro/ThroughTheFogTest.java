package Intro;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Nested
@DisplayName("Through the Fog")
public class ThroughTheFogTest {

    @Nested
    @DisplayName("Circle of Numbers")
    public class CircleOfNumbersTest {

        CircleOfNumbers cON = new CircleOfNumbers();

        @Test
        public void cONTest1() {
            assertEquals(7, cON.solution(10, 2));
        }

        @Test
        public void cONTest2() {
            assertEquals(2, cON.solution(10, 7));
        }

        @Test
        public void cONTest3() {
            assertEquals(3, cON.solution(4, 1));
        }

        @Test
        public void cONTest4() {
            assertEquals(0, cON.solution(6, 3));
        }

        @Test
        public void cONTest5() {
            assertEquals(15, cON.solution(18, 6));
        }

        @Test
        public void cONTest6() {
            assertEquals(4, cON.solution(12, 10));
        }

        @Test
        public void cONTest7() {
            assertEquals(14, cON.solution(18, 5));
        }

    }

    @Nested
    @DisplayName("Deposit Profit")
    public class DepositProfitTest {

        DepositProfit dP = new DepositProfit();

        @Test
        public void dPTest1() {
            assertEquals(3, dP.solution(100, 20, 170));
        }

        @Test
        public void dPTest2() {
            assertEquals(1, dP.solution(100, 1, 101));
        }

        @Test
        public void dPTest3() {
            assertEquals(6, dP.solution(1, 100, 64));
        }

        @Test
        public void dPTest4() {
            assertEquals(6, dP.solution(20, 20, 50));
        }

        @Test
        public void dPTest5() {
            assertEquals(4, dP.solution(50, 25, 100));
        }

    }

    @Nested
    @DisplayName("Absolute Values Sum Minimization")
    public class AbsoluteValuesSumMinimizationTest {

        AbsoluteValuesSumMinimization aVSM = new AbsoluteValuesSumMinimization();

        @Test
        public void aVSMTest1() {
            assertEquals(4, aVSM.solution(new int[]{2, 4, 7}));
        }

        @Test
        public void aVSMTest2() {
            assertEquals(2, aVSM.solution(new int[]{2, 3}));
        }

        @Test
        public void aVSMTest3() {
            assertEquals(1, aVSM.solution(new int[]{1, 1, 3, 4}));
        }

        @Test
        public void aVSMTest4() {
            assertEquals(23, aVSM.solution(new int[]{23}));
        }

        @Test
        public void aVSMTest5() {
            assertEquals(15, aVSM.solution(new int[]{-10, -10, -10, -10, -10, -9, -9, -9, -8, -8, -7, -6, -5, -4, -3, -2, -1, 0, 0, 0, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50}));
        }

        @Test
        public void aVSMTest6() {
            assertEquals(-4, aVSM.solution(new int[]{-4, -1}));
        }

        @Test
        public void aVSMTest7() {
            assertEquals(7, aVSM.solution(new int[]{0, 7, 9}));
        }

        @Test
        public void aVSMTest8() {
            assertEquals(0, aVSM.solution(new int[]{-1000000, -10000, -10000, -1000, -100, -10, -1, 0, 1, 10, 100, 1000, 10000, 100000, 1000000}));
        }

        @Test
        public void aVSMTest9() {
            assertEquals(65, aVSM.solution(new int[]{-10,
                    -9,
                    -8,
                    -7,
                    -6,
                    -5,
                    -4,
                    -3,
                    -2,
                    -1,
                    0,
                    1,
                    2,
                    3,
                    4,
                    5,
                    6,
                    7,
                    8,
                    9,
                    10,
                    11,
                    12,
                    13,
                    14,
                    15,
                    16,
                    17,
                    18,
                    19,
                    20,
                    21,
                    22,
                    23,
                    24,
                    25,
                    26,
                    27,
                    28,
                    29,
                    30,
                    31,
                    32,
                    33,
                    34,
                    35,
                    36,
                    37,
                    38,
                    39,
                    40,
                    41,
                    42,
                    43,
                    44,
                    45,
                    46,
                    47,
                    48,
                    49,
                    50,
                    51,
                    52,
                    53,
                    54,
                    55,
                    56,
                    57,
                    58,
                    59,
                    60,
                    61,
                    62,
                    63,
                    64,
                    65,
                    66,
                    67,
                    68,
                    69,
                    70,
                    71,
                    72,
                    73,
                    74,
                    75,
                    76,
                    77,
                    78,
                    79,
                    80,
                    81,
                    82,
                    83,
                    84,
                    85,
                    86,
                    87,
                    88,
                    89,
                    90,
                    91,
                    92,
                    93,
                    94,
                    95,
                    96,
                    97,
                    98,
                    99,
                    100,
                    110,
                    111,
                    112,
                    113,
                    114,
                    115,
                    116,
                    117,
                    118,
                    119,
                    120,
                    121,
                    122,
                    123,
                    124,
                    125,
                    126,
                    127,
                    128,
                    129,
                    130,
                    131,
                    132,
                    133,
                    134,
                    135,
                    136,
                    137,
                    138,
                    139,
                    140,
                    141,
                    142,
                    143,
                    144,
                    145,
                    146,
                    147,
                    148,
                    149,
                    150}));
        }

        @Test
        public void aVSMTest10() {
            assertEquals(500, aVSM.solution(new int[]{-10,
                    100,
                    200,
                    300,
                    400,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500,
                    500}));
        }

    }

    @Nested
    @DisplayName("Strings Rearrangement")
    public class StringsRearrangementTest {

        StringsRearrangement sR = new StringsRearrangement();

        @Test
        public void sRTest1() {
            assertFalse(sR.solution(new String[]{"aba", "bbb", "bab"}));
        }

        @Test
        public void sRTest2() {
            assertTrue(sR.solution(new String[]{"ab", "bb", "aa"}));
        }

        @Test
        public void sRTest3() {
            assertFalse(sR.solution(new String[]{"q", "q"}));
        }

        @Test
        public void sRTest4() {
            assertTrue(sR.solution(new String[]{"zzzzab", "zzzzbb", "zzzzaa"}));
        }

        @Test
        public void sRTest5() {
            assertFalse(sR.solution(new String[]{"ab", "ad", "ef", "eg"}));
        }

        @Test
        public void sRTest6() {
            assertTrue(sR.solution(new String[]{"abc",
                    "bef",
                    "bcc",
                    "bec",
                    "bbc",
                    "bdc"}));
        }

        @Test
        public void sRTest7() {
            assertFalse(sR.solution(new String[]{"abc",
                    "abx",
                    "axx",
                    "abc"}));
        }

        @Test
        public void sRTest8() {
            assertTrue(sR.solution(new String[]{"abc",
                    "abx",
                    "axx",
                    "abx",
                    "abc"}));
        }

        @Test
        public void sRTest9() {
            assertTrue(sR.solution(new String[]{"f",
                    "g",
                    "a",
                    "h"}));
        }

        @Test
        public void sRTest10() {
            assertTrue(sR.solution(new String[]{"ff",
                    "gf",
                    "af",
                    "ar",
                    "hf"}));
        }

        @Test
        public void sRTest11() {
            assertTrue(sR.solution(new String[]{"a", "b", "c"}));
        }
    }
}
