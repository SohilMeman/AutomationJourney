package src.basics_03;

import java.util.Scanner;

public class Demo040 {
    public static void main(String[] args) {
        //Take two input from users and give maximum

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the value of a,b");
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//
//        if(a>b){
//            System.out.println("Max " +a);
//        }else {
//            System.out.println("Max " +b);
//        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a,b,c");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();


        if(a>=b && a>=c){
            System.out.println("Max " +a);
        }else if (b>=a && b>=c)
            System.out.println("Max " +b);
        else{
            System.out.println("Max " +c);

        }
    }
}
