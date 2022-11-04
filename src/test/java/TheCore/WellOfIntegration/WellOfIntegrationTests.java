package TheCore.WellOfIntegration;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Well of Integration Tests")
public class WellOfIntegrationTests {

    @Nested
    @DisplayName("Alphabet Subsequence")
    public class AlphabetSubsequenceTest{
        AlphabetSubSequence aSS = new AlphabetSubSequence();

        @Test
        public void assT1(){
            assertFalse(aSS.solution("effg"));
        }
    }

    @Nested
    @DisplayName("Switch Lights")
    public class SwitchLightsTest {
        SwitchLights sL = new SwitchLights();

        @Test
        public void sLT1() {
            int[] testInt = new int[]{1, 1, 1, 1, 1};
            int[] resultInt = new int[]{0, 1, 0, 1, 0};
            assertArrayEquals(resultInt, sL.solution(testInt));
        }
    }
}
