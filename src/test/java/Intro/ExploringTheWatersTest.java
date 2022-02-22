package Intro;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Exploring The Waters")
public class ExploringTheWatersTest {

    @Nested
    @DisplayName("Alternating Sums")
    public class AlternatingSumsTest {

        AlternatingSums aS = new AlternatingSums();

        @Test
        public void aSTest1() {
            assertArrayEquals(new int[]{180, 105}, aS.solution(new int[]{50, 60, 60, 45, 70}));
        }

        @Test
        public void aSTest2() {
            assertArrayEquals(new int[]{100, 50}, aS.solution(new int[]{100, 50}));
        }

        @Test
        public void aSTest3() {
            assertArrayEquals(new int[]{80, 0}, aS.solution(new int[]{80}));
        }

        @Test
        public void aSTest4() {
            assertArrayEquals(new int[]{150, 150}, aS.solution(new int[]{100, 50, 50, 100}));
        }

        @Test
        public void aSTest5() {
            assertArrayEquals(new int[]{150, 151}, aS.solution(new int[]{100, 51, 50, 100}));
        }

    }
}
