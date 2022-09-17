package TheCore.MirrorLake;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Mirror Lake Tests")
public class MirrorLakeTests {

    @Nested
    @DisplayName("Strings Construction")
    public class StringConstructionTest {

        StringsConstruction sC = new StringsConstruction();

        @Test
        public void scT1() {
            assertEquals(2, sC.solution("asd", "asddsa"));
        }

        @Test
        public void scT2() {
            assertEquals(1, sC.solution("ab", "abcbcb"));
        }

        @Test
        public void scT3() {
            assertEquals(2, sC.solution("ab", "abccba"));
        }

        @Test
        public void scT4() {
            assertEquals(2, sC.solution("c", "abccba"));
        }

        @Test
        public void scT5() {
            assertEquals(3, sC.solution("c", "abccbac"));
        }

        @Test
        public void scT6() {
            assertEquals(1, sC.solution("z", "z"));
        }

        @Test
        public void scT7() {
            assertEquals(0, sC.solution("z", "y"));
        }

        @Test
        public void scT8() {
            assertEquals(0, sC.solution("za", "bzc"));
        }

        @Test
        public void scT9() {
//            assertEquals(3, sC.solution("hnccv", "hncvhchnhnccncchnvhchnhcvnhdhhn")); h = 11, n = 8, c 8, v= 3
            assertEquals(3, sC.solution("hnccv", "ocjncchnvohchnjohcvnhjdhihsn"));
        }

        @Test
        public void scT10() {
            assertEquals(0, sC.solution("abc", "def"));
        }
    }
}
