package TheCore.LoopTunnel;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Loop Tunnel Tests")
public class LoopTunnelTests {

    @Nested
    @DisplayName("Least Factorial")
    public class LeastFactorialTest{

        LeastFactorial lF = new LeastFactorial();

        @Test
        public void lfTest1() {
            assertEquals(24, lF.solution(17));
        }

        @Test
        public void lfTest2() {
            assertEquals(1, lF.solution(1));
        }

        @Test
        public void lfTest3() {
            assertEquals(6, lF.solution(5));
        }

        @Test
        public void lfTest4() {
            assertEquals(120, lF.solution(25));
        }

        @Test
        public void lfTest5() {
            assertEquals(24, lF.solution(18));
        }

        @Test
        public void lfTest6() {
            assertEquals(120, lF.solution(109));
        }

        @Test
        public void lfTest7() {
            assertEquals(120, lF.solution(106));
        }

        @Test
        public void lfTest8() {
            assertEquals(24, lF.solution(11));
        }

        @Test
        public void lfTest9() {
            assertEquals(120, lF.solution(55));
        }

        @Test
        public void lfTest10() {
            assertEquals(24, lF.solution(24));
        }

    }


}
