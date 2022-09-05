package Intro;

public class DepositProfit {

    int solution(int deposit, int rate, int threshold) {
        int timePassed = 0;
        float accrual = (float) deposit;

        while (accrual < threshold) {
            accrual += accrual*((float) rate/100F);
            timePassed++;
        }

        return timePassed;
    }
}
