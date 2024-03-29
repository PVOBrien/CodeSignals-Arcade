package Intro;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Nested
@DisplayName("Rains of Reason")
public class RainsOfReasonTest {

    @Nested
    @DisplayName("Array Replace")
    public class ArrayReplaceTest {

        ArrayReplace aR = new ArrayReplace();

        @Test
        public void aRTest1() {
            int[] arrTest = {1, 2, 1};
            int elemToReplace = 1;
            int substitutionElem = 3;
            assertArrayEquals(new int[]{3, 2, 3}, aR.solution(arrTest, elemToReplace, substitutionElem));
        }

        @Test
        public void aRTest2() {
            int[] arrTest = {1, 2, 3, 4, 5};
            int elemToReplace = 3;
            int substitutionElem = 0;
            assertArrayEquals(new int[]{1, 2, 0, 4, 5}, aR.solution(arrTest, elemToReplace, substitutionElem));
        }

        @Test
        public void aRTest3() {
            int[] arrTest = {1, 1, 1};
            int elemToReplace = 1;
            int substitutionElem = 10;
            assertArrayEquals(new int[]{10, 10, 10}, aR.solution(arrTest, elemToReplace, substitutionElem));
        }

        @Test
        public void aRTest4() {
            int[] arrTest = {1, 2, 1, 2, 1};
            int elemToReplace = 2;
            int substitutionElem = 1;
            assertArrayEquals(new int[]{1, 1, 1, 1, 1}, aR.solution(arrTest, elemToReplace, substitutionElem));
        }

        @Test
        public void aRTest5() {
            int[] arrTest = {1, 2, 1, 2, 1};
            int elemToReplace = 2;
            int substitutionElem = 2;
            assertArrayEquals(new int[]{1, 2, 1, 2, 1}, aR.solution(arrTest, elemToReplace, substitutionElem));
        }

        @Test
        public void aRTest6() {
            int[] arrTest = {3, 1};
            int elemToReplace = 3;
            int substitutionElem = 9;
            assertArrayEquals(new int[]{9, 1}, aR.solution(arrTest, elemToReplace, substitutionElem));
        }

        @Test
        public void aRTest7() {
            int[] arrTest = {10, 10};
            int elemToReplace = 0;
            int substitutionElem = 9;
            assertArrayEquals(new int[]{10, 10}, aR.solution(arrTest, elemToReplace, substitutionElem));
        }

        @Test
        public void aRTest8() {
            int[] arrTest = {2, 1};
            int elemToReplace = 2;
            int substitutionElem = 2;
            assertArrayEquals(new int[]{2, 1}, aR.solution(arrTest, elemToReplace, substitutionElem));
        }


    }

    @Nested
    @DisplayName("Even Digits Only")
    public class EvenDigitsOnlyTest {

        EvenDigitsOnly eDO = new EvenDigitsOnly();

        @Test
        public void eDOTest1() {
            assertTrue(eDO.solution(248622));
        }

        @Test
        public void eDOTest2() {
            assertFalse(eDO.solution(642386));
        }

        @Test
        public void eDOTest3() {
            assertTrue(eDO.solution(248842));
        }

        @Test
        public void eDOTest4() {
            assertFalse(eDO.solution(1));
        }

        @Test
        public void eDOTest5() {
            assertTrue(eDO.solution(8));
        }

        @Test
        public void eDOTest6() {
            assertFalse(eDO.solution(2462487));
        }

        @Test
        public void eDOTest7() {
            assertTrue(eDO.solution(468402800));
        }

        @Test
        public void eDOTest8() {
            assertTrue(eDO.solution(2468428));
        }

        @Test
        public void eDOTest9() {
            assertFalse(eDO.solution(5468428));
        }

        @Test
        public void eDOTest10() {
            assertFalse(eDO.solution(7468428));
        }

    }

    @Nested
    @DisplayName("Variable Name")
    public class VariableNameTest {

        VariableName vN = new VariableName();

        @Test
        public void vNTest1() {
            assertTrue(vN.solution("var_1__Int"));
        }

        @Test
        public void vNTest2() {
            assertFalse(vN.solution("qq-q"));
        }

        @Test
        public void vNTest3() {
            assertFalse(vN.solution("2w2"));
        }

        @Test
        public void vNTest4() {
            assertFalse(vN.solution(" variable"));
        }

        @Test
        public void vNTest5() {
            assertFalse(vN.solution("va[riable0"));
        }

        @Test
        public void vNTest6() {
            assertTrue(vN.solution("variable0"));
        }

        @Test
        public void vNTest7() {
            assertTrue(vN.solution("a"));
        }

        @Test
        public void vNTest8() {
            assertTrue(vN.solution("_Aas_23"));
        }

        @Test
        public void vNTest9() {
            assertFalse(vN.solution("a a_2"));
        }

        @Test
        public void vNTest10() {
            assertFalse(vN.solution("0ss"));
        }

    }

    @Nested
    @DisplayName("Alphabetic Shift")
    public class AlphabeticShiftTest {

        AlphabeticShift aS = new AlphabeticShift();

        @Test
        public void aSTest1() {
            assertEquals("dsbaz", aS.solution("crazy"));
        }

        @Test
        public void aSTest2() {
            assertEquals("a", aS.solution("z"));
        }

        @Test
        public void aSTest3() {
            assertEquals("bbbbcccdde", aS.solution("aaaabbbccd"));
        }

        @Test
        public void aSTest4() {
            assertEquals("gvaaz", aS.solution("fuzzy"));
        }

        @Test
        public void aSTest5() {
            assertEquals("dpeftjhobm", aS.solution("codesignal"));
        }

    }

    @Nested
    @DisplayName("Chess Board Cell Color")
    public class ChessBoardCellColorTest {

        ChessBoardCellColor cBCC = new ChessBoardCellColor();

        @Test
        public void cBCCTest1() {
            String cell1 = "A1";
            String cell2 = "C3";
            assertTrue(cBCC.solution(cell1, cell2));
        }

        @Test
        public void cBCCTest2() {
            String cell1 = "A1";
            String cell2 = "H3";
            assertFalse(cBCC.solution(cell1, cell2));
        }

        @Test
        public void cBCCTest3() {
            String cell1 = "A1";
            String cell2 = "A2";
            assertFalse(cBCC.solution(cell1, cell2));
        }

        @Test
        public void cBCCTest4() {
            String cell1 = "A1";
            String cell2 = "B2";
            assertTrue(cBCC.solution(cell1, cell2));
        }

        @Test
        public void cBCCTest5() {
            String cell1 = "B3";
            String cell2 = "H8";
            assertFalse(cBCC.solution(cell1, cell2));
        }

        @Test
        public void cBCCTest6() {
            String cell1 = "C3";
            String cell2 = "B5";
            assertFalse(cBCC.solution(cell1, cell2));
        }

        @Test
        public void cBCCTest7() {
            String cell1 = "G5";
            String cell2 = "E7";
            assertTrue(cBCC.solution(cell1, cell2));
        }

        @Test
        public void cBCCTest8() {
            String cell1 = "C8";
            String cell2 = "H8";
            assertFalse(cBCC.solution(cell1, cell2));
        }

        @Test
        public void cBCCTest9() {
            String cell1 = "D2";
            String cell2 = "D2";
            assertTrue(cBCC.solution(cell1, cell2));
        }

        @Test
        public void cBCCTest10() {
            String cell1 = "A2";
            String cell2 = "A5";
            assertFalse(cBCC.solution(cell1, cell2));
        }

    }
}
