package src.basics_03;

public class Demo032 {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int c = 12;

        //Ternary Operator- > ?

        // a>b ? a>c -> a
        //a>c ? a:c
        //b>c ? b:c

        int max = (a>b) ? ((a>c) ? a:c): ((b>c) ? b:c);
        System.out.println(max);




    }
}
