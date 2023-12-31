package src.basics_03;

import java.util.Scanner;

public class Demo039 {
    public static void main(String[] args) {

        //Will use below statement to take the input from user's end
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number, I will tell it is a even/odd");
        int a = sc.nextInt();

        if(a%2 ==1){
            System.out.println("Odd number");
        }else {
            System.out.println("Even Number");
        }
    }
}
