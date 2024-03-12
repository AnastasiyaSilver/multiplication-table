package pl.asilver.multiplication.service;

public class Service {
    public static void multiplyNumbers(int a, int b){
        for(a = 2; a <= 5; a++){
            for(b = 2; b <=5; b++){
                System.out.println(a + " * " + " b " + " = " + (a*b));
            }
        }
    }
}
