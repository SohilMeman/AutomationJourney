package src.basics_03;

import java.util.Scanner;

public class Demo041 {
    public static void main(String[] args) {
        //Take three input from users and give maximum


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a,b,c");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();


        if(a>=b && a>=c){
            System.out.println("Max is " +a);
        }else if (b>=a && b>=c)
            System.out.println("Max is " +b);
        else{
            System.out.println("Max is " +c);

        }
    }
}
