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

}
