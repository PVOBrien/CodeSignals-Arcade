package TheCore.LabOfNestedLoops;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LabOfNestedLoopsTests {

    @Nested
    @DisplayName("Square Digits Sequence")
    public class SquareDigitsSequenceTest {

        SquareDigitsSequence sDS = new SquareDigitsSequence();

        @Test
        public void sDsTest1() {
            assertEquals(9, sDS.solution(16));
        }

        @Test
        public void sDsTest2() {
            assertEquals(4, sDS.solution(103));
        }

        @Test
        public void sDsTest3() {
            assertEquals(4, sDS.solution(103));
        }

        @Test
        public void sDsTest4() {
            assertEquals(9, sDS.solution(16));
        }

        @Test
        public void sDsTest5() {
            assertEquals(9, sDS.solution(16));
        }

        @Test
        public void sDsTest6() {
            assertEquals(9, sDS.solution(16));
        }

    }
}
