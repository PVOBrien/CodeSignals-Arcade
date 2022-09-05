package TheCore.CornerOhsAndIs;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Range Bit COunt")
public class RangeBitCountTest {

    RangeBitCount rBC = new RangeBitCount();

    @Test
    public void rBCTest1() {
        assertEquals(11, rBC.solution(2,7));
    }

    @Test
    public void rBCTest2() {
        assertEquals(1, rBC.solution(0,1));
    }

    @Test
    public void rBCTest3() {
        assertEquals(17, rBC.solution(1,10));
    }

    @Test
    public void rBCTest4() {
        assertEquals(3, rBC.solution(8,9));
    }

    @Test
    public void rBCTest5() {
        assertEquals(4, rBC.solution(9,10));
    }

}
