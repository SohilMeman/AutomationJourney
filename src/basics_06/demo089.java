package src.basics_06;

public class demo089 {
    public static void main(String[] args) {

        // Create a program that determines whether a given year is a leap year.

        // A leap year is divisible by 4,
        // but not by 100 unless it is also divisible by 400.
        // Use an if-else statement to make this determination.

        //Coding
        // 1. user input - ?
        // 2. Rough logic -> for 1 to 100 , i%3==0 -> Fizz , i%5 ==0 -> Buzz , i%3 == 0 && i%5 ==0 -> Fizzbuzz
        // 3. Brute force
        // 4. Logic correction


        // BODMAS stands for Bracket, Of, Division, Multiplication, Addition, and Subtraction.
        // The BODMAS is used to explain the order of operation of a mathematical expression

        int year = 2024;

        if ((year%4==0 && year%100!=0) || (year%400==0)){
            System.out.println("Leap Year");

        }else{
            System.out.println("Not a leap year");
        }

    }

}