package src.basics_05;

import java.util.Scanner;

public class demo056 {
    public static void main(String[] args) {


        //  3/ x^2 + y^2 - |z|
        //  A+B-C ->  A ->  x^2 , B -> Y ^2 , C ->  |Z| abs(Z)  -1 ->  1, -199.98 -> +199.98

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of X");
        double x = sc.nextDouble();
        System.out.println("Enter the value of Y");
        double y = sc.nextDouble();
        System.out.println("Enter the value of Z");
        double z = sc.nextDouble();

        double result;

        result = Math.cbrt(Math.pow(x,2) + Math.pow(y,2) - Math.abs(z));
        System.out.println(result);

        sc.close();

    }
}
