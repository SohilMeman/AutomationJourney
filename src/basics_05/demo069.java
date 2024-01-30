package src.basics_05;

public class demo069 {
    public static void main(String[] args) {
//Print Even and Odd number using for loop and If condition with CONTINUE
        for (int i = 0; i <=10 ; i++) {
            if (i%2==0) {
                System.out.println("Val even of "+i);
                continue;

        }
            System.out.println("Val odd  of "+i);
            }
        }
    }

