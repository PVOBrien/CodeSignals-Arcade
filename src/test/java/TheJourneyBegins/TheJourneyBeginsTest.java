package TheJourneyBegins;

import org.checkerframework.checker.units.qual.A;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("The Journey Begins")
public class TheJourneyBeginsTest {

    @Nested
    @DisplayName("Add")
    public class AddTest {

        Add aT = new Add();

        @Test
        public void AddT1() {
            Add addT = new Add();
            assertEquals(3, addT.solution(1, 2));
        }

        @Test
        public void AddT2() {
            assertEquals(1000, new Add().solution(0,1000));
        }

        @Test
        public void AddT3() {
            assertEquals(-37, new Add().solution(2, -39));
        }

        @Test
        public void AddT4() {
            assertEquals(199, new Add().solution(99,100));
        }

        @Test
        public void AddT5() {
            assertEquals(0, new Add().solution(-100, 100));
        }

        @Test
        public void AddT6() {
            assertEquals(-2000, aT.solution(-1000, -1000));
        }
    }

}
