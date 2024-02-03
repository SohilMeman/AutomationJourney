package src.basics_06;

import java.util.Scanner;

public class demo086 {
    public static void main(String[] args){

    // Take input user Marks of 5 subjects and Print the marks

      Scanner sc = new Scanner(System.in);
        int marks[] = new int[5];
        System.out.println("Enter the first Subject");
        marks[0] = sc.nextInt();
        System.out.println("Enter the second Subject");
        marks[1] = sc.nextInt();
        System.out.println("Enter the third Subject");
        marks[2] = sc.nextInt();
        System.out.println("Enter the fourth Subject");
        marks[3] = sc.nextInt();
        System.out.println("Enter the fifth Subject");
        marks[4] = sc.nextInt();

//        for (int i = 0; i < marks.length ; i++) {
//            System.out.println(marks[i]);
//
//        }
        for (int i = 0; i < marks.length ; i++) {
            if (marks[i]<30){
                System.out.println("You are fail " +marks[i]);
            }
            System.out.println(marks[i]);

        }

        sc.close();




    }


    }

