package TheCore.LabofNestedLoops;

import TheCore.LabOfNestedLoops.CrosswordFormation;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LabOfNestedLoopsTests {

    @Nested
    @DisplayName("Crossroad Formation Tests")
    public class CrosswordFormationTests {

        CrosswordFormation cF = new CrosswordFormation();

        @Test
        public void cFTest1() {

            String[] testArr = {"crossword",
                    "square",
                    "formation",
                    "something"};

            assertEquals(6, cF.solution(testArr));
        }

        @Test
        public void cFTest2() {

            String[] testArr = {"anaesthetist",
                    "thatch",
                    "ethnics",
                    "sabulous"};

            assertEquals(0, cF.solution(testArr));
        }

        @Test
        public void cFTest3() {
            String[] testArr = {"eternal",
                    "texas",
                    "chainsaw",
                    "massacre"};

            assertEquals(4, cF.solution(testArr));
        }

        @Test
        public void cFTest4() {
            String[] testArr = {"africa",
                    "america",
                    "australia",
                    "antarctica"};
            assertEquals(62, cF.solution(testArr));
        }

        @Test
        public void cFTest5() {
            String[] testArr = {"phenomenon",
                    "remuneration",
                    "particularly",
                    "pronunciation"};

            assertEquals(62, cF.solution(testArr));
        }

        @Test
        public void cFTest6() {
            String[] testArr = {"onomatopoeia",
                    "philosophical",
                    "provocatively",
                    "thesaurus"};

            assertEquals(20, cF.solution(testArr));
        }
    }
}