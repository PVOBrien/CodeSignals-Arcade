package TheCore.LabOfNestedLoops;

public class SquareDigitsSequence {

    int solution(int a0) {
        if (a0 == 0) return 0;

        int counter = 1,
                result = a0,
                current;

        do {
            current = 0;
            while (result > 0) {
                System.out.println(result % 10);
                current += (result % 10) * (result % 10);
                result /= 10;
            }
            result = current;
            counter++;
            System.out.println(result);
        } while (result != a0 );

        return counter;
    }

}
