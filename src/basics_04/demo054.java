package src.basics_04;

public class demo054 {
    public static void main(String[] args) {

        //Max in two number
        //We can find using ternary operator also find using if, else condition and also can find using math function

        int a = 24;
        int b = 30;

//        System.out.println(Math.max(a,b));
//        System.out.println(Math.min(a,b));
//        System.out.println(Math.max(56.76f,100.11f));

        if (a>b){
            System.out.println("Max is " +a);
        }
        else{
            System.out.println("Max is " +b);
        }
    }
}
