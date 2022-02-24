package Intro;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Dark Wilderness")
public class DarkWildernessTest {

    @Nested
    @DisplayName("Growing Plant")
    public class GrowingPlantTest {

        GrowingPlant gP = new GrowingPlant();

        @Test
        public void gPTest1() {
            assertEquals(10, gP.solution(100, 10, 910));
        }

        @Test
        public void gPTest2() {
            assertEquals(1, gP.solution(10, 9, 4));
        }

        @Test
        public void gPTest3() {
            assertEquals(2, gP.solution(5, 2, 7));
        }

        @Test
        public void gPTest4() {
            assertEquals(110, gP.solution(7, 3, 443));
        }

        @Test
        public void gPTest5() {
            assertEquals(5, gP.solution(6, 5, 10));
        }

    }

    @Nested
    @DisplayName("Knapsack Light")
    public class KnapsackLightTest {

        KnapsackLight kSL = new KnapsackLight();

        @Test
        public void kSLTest1() {
            assertEquals(10, kSL.solution(10,5,6,4,8));
        }

        @Test
        public void kSLTest2() {
            assertEquals(16, kSL.solution(10,5,6,4,9));
        }

        @Test
        public void kSLTest3() {
            assertEquals(7, kSL.solution(5,3,7,4,6));
        }

        @Test
        public void kSLTest4() {
            assertEquals(0, kSL.solution(10,2,11,3,1));
        }

        @Test
        public void kSLTest5() {
            assertEquals(15, kSL.solution(15,2,20,3,2));
        }

        @Test
        public void kSLTest6() {
            assertEquals(3, kSL.solution(2,5,3,4,5));
        }

        @Test
        public void kSLTest7() {
            assertEquals(4, kSL.solution(4,3,3,4,4));
        }

        @Test
        public void kSLTest8() {
            assertEquals(3, kSL.solution(3,5,3,8,10));
        }

    }

    @Nested
    @DisplayName("Longest Digits Prefix")
    public class LongestDigitsPrefixTest {

        LongestDigitsPrefix lDP = new LongestDigitsPrefix();

        @Test
        public void lDPTest1() {
            assertEquals("123", lDP.solution("123aa1"));
        }

        @Test
        public void lDPTest2() {
            assertEquals("0123456789", lDP.solution("0123456789"));
        }

        @Test
        public void lDPTest3() {
            assertEquals("", lDP.solution("  3) always check for whitespaces"));
        }

        @Test
        public void lDPTest4() {
            assertEquals("12", lDP.solution("12abc34"));
        }

        @Test
        public void lDPTest5() {
            assertEquals("", lDP.solution("the output is 42"));
        }

        @Test
        public void lDPTest6() {
            assertEquals("", lDP.solution("aaaaaaa"));
        }

    }
}
