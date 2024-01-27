package src.basics_04;

public class demo050 {
    public static void main(String[] args) {

        //This program will not execute because duplicate case label

        int a = 98;

        switch(a) {
            case 98:
                System.out.println("value-98");


            case 99:
                System.out.println("value-98");
        }


        }


}
