package pl.asilver.multiplication.service;

public class Service {
    public static void multiplyNumbers() {
        for (int a = 2; a <= 5; a++) {
            for (int b = 2; b <= 5; b++) {
                System.out.println(a + " * " + b + " = " + (a * b));
            }
        }
    }
}
