package src.basics_04;

import java.util.Scanner;

public class demo048 {
    public static void main(String[] args) {

        //Check the character is vowel or not
        //Vowels  are a,e,i,o,u

        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the character");
        char user_input  = sc.next().toCharArray()[0];

        switch(user_input){

            case 'a':
                System.out.println("vowel");
                break;
            case 'e':
                System.out.println("vowel");
                break;
            case 'i':
                System.out.println("vowel");
                break;
            case 'o':
                System.out.println("vowel");
                break;
            case 'u':
                System.out.println("vowel");
                break;
            default:
                System.out.println("I am not a vowel, I am a consent");



        }
    }


}
