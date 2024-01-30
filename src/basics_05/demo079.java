package src.basics_05;

import java.util.Scanner;

public class demo079 {
    public static void main(String[] args) {
//Prime Number or Not
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
//
        int check = 0;

        for(int i = 1; i <= number; i++){
            if (number%i == 0){
                check++;
            }
        }
        if (check==2){
            System.out.println("Prime number");
        }
        else {
            System.out.println("Not Prime");
        }



    }




        }


