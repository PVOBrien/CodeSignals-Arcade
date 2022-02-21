package TheJourneyBegins;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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

    @Nested
    @DisplayName("Century From Year")
    public class CenturyFromYearTest {

        CenturyFromYear cTest = new CenturyFromYear();

        @Test
        public void cFYT1() { assertEquals(20, cTest.solution(1905)); }

        @Test
        public void cFYT2() { assertEquals(17, cTest.solution(1700)); }

        @Test
        public void cFYT3() { assertEquals(20, cTest.solution(1988)); }

        @Test
        public void cFYT4() { assertEquals(20, cTest.solution(2000)); }

        @Test
        public void cFYT5() { assertEquals(21, cTest.solution(2001)); }

        @Test
        public void cFYT6() { assertEquals(2, cTest.solution(200)); }

        @Test
        public void cFYT7() { assertEquals(4, cTest.solution(374)); }

        @Test
        public void cFYT8() { assertEquals(1, cTest.solution(45)); }

        @Test
        public void cFYT9() { assertEquals(1, cTest.solution(8)); }
    }
}

