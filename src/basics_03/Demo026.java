package src.basics_03;

public class Demo026 {
    public static void main(String[] args) {
        //Revision Question

        int a = 10;
        int b = 20;
        String s1 = "Sohil";
        String s2 = "Meman";
        System.out.println(a+b+s1+s2);
        System.out.println(s1+s2+a+b);
        System.out.println(s1+s2+(a+b)); //Here first bracket solve Accroding to BODMAS

        //Widening
        byte b1 = 10;
        int a1 = b1; // VALID - implicit casting
        int a2 = (int)b1; // VALID - Explicit casting

    }
}
