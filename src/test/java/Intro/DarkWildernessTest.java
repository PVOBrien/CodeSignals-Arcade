package Intro;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Nested
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
}
