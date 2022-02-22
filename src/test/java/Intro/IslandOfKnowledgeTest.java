package Intro;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Island of Knowledge")
public class IslandOfKnowledgeTest {

    @Nested
    @DisplayName("Are Equally Strong")
    public class AreEquallyStrongTest {

        AreEquallyStrong aES = new AreEquallyStrong();

        @Test
        public void aESTest1() {
            assertTrue(aES.solution(10,15,15,10));
        }

        @Test
        public void aESTest2() {
            assertTrue(aES.solution(15,10,15,10));
        }

        @Test
        public void aESTest3() {
            assertFalse(aES.solution(15,10,15,9));
        }

        @Test
        public void aESTest4() {
            assertTrue(aES.solution(10,5,5,10));
        }

        @Test
        public void aESTest5() {
            assertFalse(aES.solution(10,15,5,20));
        }

        @Test
        public void aESTest6() {
            assertTrue(aES.solution(10,20,10,20));
        }

        @Test
        public void aESTest7() {
            assertTrue(aES.solution(5,20,20, 5));
        }

        @Test
        public void aESTest8() {
            assertFalse(aES.solution(20,15,5,20));
        }

        @Test
        public void aESTest9() {
            assertTrue(aES.solution(5,10,5,10));
        }

        @Test
        public void aESTest10() {
            assertFalse(aES.solution(1,10,10,0));
        }

        @Test
        public void aESTest11() {
            assertFalse(aES.solution(5,5,10,10));
        }

        @Test
        public void aESTest12() {
            assertFalse(aES.solution(5,10,5,6));
        }

        @Test
        public void aESTest13() {
            assertTrue(aES.solution(1,1,1,1));
        }

        @Test
        public void aESTest14() {
            assertTrue(aES.solution(0,10,10,0));
        }

    }

}
