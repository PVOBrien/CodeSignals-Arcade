package InterviewPractice.LinkedLists;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("add Two Huge Numbers")
public class AddTwoHugeNumbersTests {
//    class ListNode<T> {
//
//        ListNode(T x) {
//            value = x;
//        }
//        T value;
//        AddTwoHugeNumbers.ListNode<T> next;
//
//    }

    @Test
    public void aTHNTest1() {

        AddTwoHugeNumbers.ListNode ln1 = new AddTwoHugeNumbers.ListNode(9876);
        AddTwoHugeNumbers.ListNode ln2 = new AddTwoHugeNumbers.ListNode(5432);
        AddTwoHugeNumbers.ListNode ln3 = new AddTwoHugeNumbers.ListNode(1999);
        ln1.next = ln2;
        ln2.next = ln3;

        AddTwoHugeNumbers.ListNode lna = new AddTwoHugeNumbers.ListNode(1);
        AddTwoHugeNumbers.ListNode lnb = new AddTwoHugeNumbers.ListNode(8001);
        lna.next = lnb;

        AddTwoHugeNumbers.ListNode r1 = new AddTwoHugeNumbers.ListNode(0000);
        AddTwoHugeNumbers.ListNode r2 = new AddTwoHugeNumbers.ListNode(5434);
        AddTwoHugeNumbers.ListNode r3 = new AddTwoHugeNumbers.ListNode(9876);
        r1.next = r2;
        r2.next = r3;

        AddTwoHugeNumbers.ListNode lNTested = AddTwoHugeNumbers.solution(ln1, lna);

        assertEquals(r1.value, lNTested.value);


    }
}
