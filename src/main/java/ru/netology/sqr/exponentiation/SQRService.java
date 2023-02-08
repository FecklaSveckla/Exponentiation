package ru.netology.sqr.exponentiation;

public class SQRService {
    int firstNumber = 10;
    int secondNumber = 99;
    public int calcSqr(int x, int y) {
        int count = 0;
        int b = 0;
        for (int i = firstNumber; i <= secondNumber; i++) {
            b = i* i;
            if (b >= x && b <= y) {
                count = count + 1;
            }
        }
        return count;
    }
}



