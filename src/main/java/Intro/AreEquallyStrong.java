package Intro;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class AreEquallyStrong {

    boolean solution(int yourLeft, int yourRight, int friendsLeft, int friendsRight) {
        Stack<Integer> yours = new Stack<>();
        yours.add(yourLeft);
        yours.add(yourRight);
        List<Integer> theirs = new ArrayList<>();
        theirs.add(friendsLeft);
        theirs.add(friendsRight);

        if (theirs.contains(yours.peek())) {
            theirs.remove(yours.pop());
        }

        return theirs.contains(yours.pop());
    }
}
