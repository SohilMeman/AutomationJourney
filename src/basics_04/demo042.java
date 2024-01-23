package src.basics_04;

import java.util.Scanner;

public class demo042 {
    public static void main(String[] args) {
        // Take the user input  Print the Max number using if else condition
        //20>num > Number is greater
        //11 to 19 > Number is greater than 1o
        //0 to 9 number is less than 10

        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();

        if (num>=20){
            System.out.println("Number is greater than 20");
        }else if (num>=10){
            System.out.println("Number is greater than 10");
        }else {
            System.out.println("Number is less tha 10");
        }
    }
}
