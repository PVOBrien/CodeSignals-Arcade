package TheCore.LoopTunnel;

public class AddWithoutCarry {

    int solution(int param1, int param2) { // https://stackoverflow.com/questions/39859633/how-to-read-each-individual-digit-of-a-number-in-java
        int first = Math.max(param1, param2),
                second = Math.min(param1, param2),
                endResult = 0,
                multiply = 1;

        while (first > 0) {
            int result = first % 10;
            first /= 10;

            if (second > 0) {
                result = (result + (second % 10)) % 10;
                second /= 10;
            }

            endResult += result*multiply;
            multiply *= 10;
        }
        return endResult;
    }

    int solution2(int param1, int param2) { // recursive solution from highest rated Java solution
        if (param1 == 0 || param2 == 0) {return param1+param2;}
        return solution(param1/10,param2/10)*10 + (param1+param2)%10;}
}
