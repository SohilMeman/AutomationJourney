package src.basics_04;

import java.util.Scanner;

public class demo043 {
    public static void main(String[] args) {
        // Print the Grade take input from user
        // A -> 90 to 100
        // B -> 80 to 89
        // C -> 70 to 79
        // D -> 60 to 69
        // F -> Sorry you are Fail

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Score");
        int score = sc.nextInt();

        if (score>= 90 && score<=100){
            System.out.println("Congratulation You Pass with A Grade");
        }else if (score>=80 && score<=89){
            System.out.println("Congratulation You Pass with B Grade");
        }else if (score>=70 && score<=79){
            System.out.println("Congratulation You Pass with C Grade");;
        } else if (score>=60 && score<=69) {
            System.out.println("Congratulation You Pass with D Grade");;

        }else{
            System.out.println("Sorry You are Fail");
        }
    }
}
