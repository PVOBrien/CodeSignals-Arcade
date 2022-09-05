package TheCore.AtTheCrossroads;

public class ExtraNumber {

    int solution(int a, int b, int c) {
        if (b==c) return a;
        return a==b ? c : b;
    }
}

/*
int solution(int a, int b, int c) {
    return a == b ? c : a == c ? b : a;
} */