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
}
