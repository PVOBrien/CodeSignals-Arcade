package Intro;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Eruption of Light")
public class EruptionOfLightTest {

    @Nested
    @DisplayName("Is Beautiful String")
    public class IsBeautifulStringTest {

        IsBeautifulString iBS = new IsBeautifulString();

        @Test
        public void iBSTest1() {
            assertTrue(iBS.solution("bbbaacdafe"));
        }

        @Test
        public void iBSTest2() {
            assertFalse(iBS.solution("aabbb"));
        }

        @Test
        public void iBSTest3() {
            assertFalse(iBS.solution("bbc"));
        }

        @Test
        public void iBSTest4() {
            assertFalse(iBS.solution("bbbaa"));
        }

        @Test
        public void iBSTest5() {
            assertFalse(iBS.solution("abcdefghijklmnopqrstuvwxyzz"));
        }

        @Test
        public void iBSTest6() {
            assertTrue(iBS.solution("abcdefghijklmnopqrstuvwxyz"));
        }

        @Test
        public void iBSTest7() {
            assertTrue(iBS.solution("abcdefghijklmnopqrstuvwxyzqwertuiopasdfghjklxcvbnm"));
        }

        @Test
        public void iBSTest8() {
            assertFalse(iBS.solution("fyudhrygiuhdfeis"));
        }

        @Test
        public void iBSTest9() {
            assertFalse(iBS.solution("zaa"));
        }

        @Test
        public void iBSTest10() {
            assertFalse(iBS.solution("zyy"));
        }

    }

}
