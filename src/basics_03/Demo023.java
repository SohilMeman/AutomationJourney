package src.basics_03;

public class Demo023 {
    public static void main(String[] args) {
        // Casting Means Mold

        // Widening -> Smaller put into Bigger and its done Automatically
        byte b = 10;
//        int a = b; // Implicit CASTING Done by JVM
        int a = (int)b; // explicit cating

        // Narrowing -> Higher put into Lower

        int a1 = 300;
//        byte b1 = a1; Invalid Implicit castingg
        byte b1 = (byte)a1; // Explicit Casting
        System.out.println(b1);




    }
}
