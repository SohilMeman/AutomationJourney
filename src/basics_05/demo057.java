package src.basics_05;

import java.util.Scanner;

public class demo057 {

    public static void main(String[] args) {

//        // Take a user input and print the information
//
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter your name");
        String name = sc.next();

        System.out.println("Enter your age");
        int age = sc.nextInt();

        System.out.println("Enter your Salary");
        double Salary = sc.nextDouble();



        System.out.println("Your details are " + name + " - " +age +" - " +Salary);
        System.out.println("My name is " + name);
        System.out.println("My age is " + age);
        System.out.println("My Salary is " + Salary);


        }


}
