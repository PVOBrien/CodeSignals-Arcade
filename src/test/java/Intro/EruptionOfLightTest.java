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

    @Nested
    @DisplayName("Find Email Domain")
    public class FindEmailDomainTest {

        FindEmailDomain fED = new FindEmailDomain();

        @Test
        public void fEDTest1() {
            assertEquals("example.com", fED.solution("prettyandsimple@example.com"));
        }

        @Test
        public void fEDTest2() {
            assertEquals("codesignal.com", fED.solution("fully-qualified-domain@codesignal.com"));
        }

        @Test
        public void fEDTest3() {
            assertEquals("space.com", fED.solution("\\\" \\\"@space.com"));
        }

        @Test
        public void fEDTest4() {
            assertEquals("yandex.ru", fED.solution("someaddress@yandex.ru"));
        }

        @Test
        public void fEDTest5() {
            assertEquals("xample.org", fED.solution("\\\" \\\"@xample.org"));
        }

        @Test
        public void fEDTest6() {
            assertEquals("yahoo.com", fED.solution("\\\"much.more unusual\\\"@yahoo.com"));
        }

        @Test
        public void fEDTest7() {
            assertEquals("usual.com", fED.solution("\\\"very.unusual.@.unusual.com\\\"@usual.com"));
        }

        @Test
        public void fEDTest8() {
            assertEquals("mailserver2.ru", fED.solution("admin@mailserver2.ru"));
        }

        @Test
        public void fEDTest9() {
            assertEquals("strange-example.com", fED.solution("example-indeed@strange-example.com"));
        }

        @Test
        public void fEDTest10() {
            assertEquals("gmail.com", fED.solution("very.common@gmail.com"));
        }

    }

}
