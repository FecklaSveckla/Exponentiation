package ru.netology.sqr.exponentiation;

public class Main {
    public static void main(String[] args) {
        SQRService service = new SQRService();

        //System.out.println(service.calcSqr(10));
        int expected = 3;
        int actual = service.calcSqr(200, 300);
        System.out.println(expected + " ==?== " + actual);
    }
}