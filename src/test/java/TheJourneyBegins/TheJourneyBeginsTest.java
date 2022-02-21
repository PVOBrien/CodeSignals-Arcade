package intro;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("The Journey Begins")
public class TheJourneyBeginsTest {

    class AddTest {

        @DisplayName("Add")
        @Test
        public void AddT1() {
            Add addT = new Add();
            assertEquals(3, addT.solution(1, 2));
        }

}
}
