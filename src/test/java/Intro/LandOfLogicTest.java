package Intro;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Land of Logic")
public class LandOfLogicTest {

    @Nested
    @DisplayName("Longest Word")
    public class LongestWordTest {

        LongestWord lW = new LongestWord();

        @Test
        public void lWTest1() {
            assertEquals("steady", lW.solution("Ready, steady, go!"));
        }

        @Test
        public void lWTest2() {
            assertEquals("steady", lW.solution("Ready[[[, steady, go!"));
        }

        @Test
        public void lWTest3() {
            assertEquals("ABCd", lW.solution("ABCd"));
        }

        @Test
        public void lWTest4() {
            assertEquals("not", lW.solution("To be or not to be"));
        }

        @Test
        public void lWTest5() {
            assertEquals("CodeFighter", lW.solution("You are the best!!!!!!!!!!!! CodeFighter ever!"));
        }

    }
}
