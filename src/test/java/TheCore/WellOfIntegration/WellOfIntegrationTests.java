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
}
