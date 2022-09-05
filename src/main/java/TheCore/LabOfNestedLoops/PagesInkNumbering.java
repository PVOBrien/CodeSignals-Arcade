package TheCore.LabOfNestedLoops;

public class PagesInkNumbering {

    int solution(int current, int numberOfDigits) {

        int position = 10,
            digitsToPrint = 1,
            nextCurrent = 10,
            inkForPrint = 0;

        if (numberOfDigits > 0 && current < position) {
            inkForPrint = (position - current) * digitsToPrint;
            if (numberOfDigits - inkForPrint > position) {
                current = nextCurrent;
                numberOfDigits -= inkForPrint;
            } else {
                current += numberOfDigits / digitsToPrint - 1;
                numberOfDigits = 0;
            }
            position *= 10;
            digitsToPrint++;
            nextCurrent *= 10;
        }

        // System.out.println("position: " + position);
        // System.out.println("dTP: " + digitsToPrint);
        // System.out.println("nextC: " + nextCurrent);
        // System.out.println("noD: " + numberOfDigits);
        // System.out.println("current: " + current);
        return current;
    }
}
