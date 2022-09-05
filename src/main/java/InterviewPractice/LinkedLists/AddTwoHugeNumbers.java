package InterviewPractice.LinkedLists;

import java.util.Stack;

public class AddTwoHugeNumbers {
    // Singly-linked lists are already defined with this interface:
    static class ListNode<T> {
   ListNode(T x) {
     value = x;
   }
   T value;
   ListNode<T> next;
 }

    static public ListNode<Integer> solution(ListNode<Integer> a, ListNode<Integer> b) {
        Stack<Integer> rSA = new Stack<>();
        Stack<Integer> rSB = new Stack<>();

        while (a != null) {
            rSA.add(a.value);
            a = a.next;
        }

        while (b != null) {
            rSB.add(b.value);
            b = b.next;
        }

        ListNode<Integer> resultNode = null;
        ListNode<Integer> endNode = null;
        int over = 0;

        while (!rSA.empty() || !rSB.empty()) {
            int sum = over;
            if (!rSA.empty()) sum += rSA.pop();
            if (!rSB.empty()) sum += rSB.pop();

            if (sum > 9999) {
                over = sum / 10000;
                sum = sum % 10000;
            }

            if (resultNode == null) { // former head is next, latest becomes head
                resultNode = new ListNode<Integer>(sum);
                endNode = resultNode;
            } else {
                resultNode.next = new ListNode<Integer>(sum);
            }
        }

        return endNode;
    }


}
