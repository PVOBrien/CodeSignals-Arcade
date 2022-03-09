package TheCore.AtTheCrossroads;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("At The Crossroads")
public class AtTheCrossRoadsTests {

    @Nested
    @DisplayName("Reach Next Level")
    public class ReachNestLevelTests {

        ReachNextLevel rNL = new ReachNextLevel();

        @Test
        public void rNLTest1() {
            assertTrue(rNL.solution(10, 15,5));
        }

        @Test
        public void rNLTest2() {
            assertFalse(rNL.solution(10, 15,4));
        }

        @Test
        public void rNLTest3() {
            assertTrue(rNL.solution(3, 6,4));
        }

        @Test
        public void rNLTest4() {
            assertFalse(rNL.solution(84, 135,36));
        }

        @Test
        public void rNLTest5() {
            assertFalse(rNL.solution(74, 170,58));
        }

        @Test
        public void rNLTest6() {
            assertFalse(rNL.solution(80, 199,15));
        }

        @Test
        public void rNLTest7() {
            assertTrue(rNL.solution(97, 57,7));
        }

        @Test
        public void rNLTest8() {
            assertFalse(rNL.solution(235, 293,4));
        }

        @Test
        public void rNLTest9() {
            assertTrue(rNL.solution(222, 137,58));
        }

        @Test
        public void rNLTest10() {
            assertTrue(rNL.solution(16, 23,16));
        }
    }

    @Nested
    @DisplayName("Extra Number")
    public class ExtraNumberTests {

        ExtraNumber eN = new ExtraNumber();

        @Test
        public void eNTest1() {
            assertEquals(7, eN.solution(2,7,2));
        }

        @Test
        public void eNTest2() {
            assertEquals(3, eN.solution(3,2,2));
        }

        @Test
        public void eNTest3() {
            assertEquals(1, eN.solution(5,5,1));
        }

        @Test
        public void eNTest4() {
            assertEquals(3, eN.solution(500000000,3,500000000));
        }

        @Test
        public void eNTest5() {
            assertEquals(5, eN.solution(1,5,1));
        }

        @Test
        public void eNTest6() {
            assertEquals(3, eN.solution(5,5,3));
        }

        @Test
        public void eNTest7() {
            assertEquals(5, eN.solution(5,1,1));
        }

        @Test
        public void eNTest8() {
            assertEquals(3000000, eN.solution(4000000,3000000,4000000));
        }

        @Test
        public void eNTest9() {
            assertEquals(82231042, eN.solution(548442737,82231042,548442737));
        }

        @Test
        public void eNTest10() {
            assertEquals(469992838, eN.solution(469992838,66019520,66019520));
        }

    }

    @Nested
    @DisplayName("Is Infinite Process")
    public class IsInfiniteProcessTests {

        IsInfiniteProcess iIP = new IsInfiniteProcess();

        @Test
        public void iIPTest1() {
            assertFalse(iIP.solution(2,6));
        }

        @Test
        public void iIPTest2() {
            assertTrue(iIP.solution(2,3));
        }

        @Test
        public void iIPTest3() {
            assertFalse(iIP.solution(2,10));
        }

        @Test
        public void iIPTest4() {
            assertTrue(iIP.solution(0,1));
        }

        @Test
        public void iIPTest5() {
            assertTrue(iIP.solution(3,1));
        }

        @Test
        public void iIPTest6() {
            assertFalse(iIP.solution(10,10));
        }

        @Test
        public void iIPTest7() {
            assertTrue(iIP.solution(5,10));
        }

        @Test
        public void iIPTest8() {
            assertFalse(iIP.solution(6,10));
        }

        @Test
        public void iIPTest9() {
            assertTrue(iIP.solution(10,0));
        }

        @Test
        public void iIPTest10() {
            assertFalse(iIP.solution(5,5));
        }

    }
}
