package src.basics_04;

import java.util.Scanner;

public class demo046 {
    public static void main(String[] args) {

        //write a program which can give the day name. Which day is today
        // 1->Monday to 7 -> Sunday, MTWTFSS

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number I will tell you which day it is");
        int day = sc.nextInt();

        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Are you MAD?");

        }
    }


}
