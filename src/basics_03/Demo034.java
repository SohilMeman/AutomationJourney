package src.basics_03;

public class Demo034 {
    public static void main(String[] args) {

        //increment operator

        //Pre and Post
//        int a = 10;
//        System.out.println(++a);
//        //In front variable like a > Pre
//        //Means Do Increment first and then print
//
//        int a = 10;
//        System.out.println(a++);
//        System.out.println(a);
//
//        //After variable like a > post
//        //first print and then do increment

//        int a = 23;
//        System.out.println(a++ + ++a + ++a + a++);
//        System.out.println(a);
//
//        // A > a++ > Exp =23 a =24     a
//        // B > ++a > Exp =25 a =25
//        // C > ++a > Exp =26 a =26
//        // D > a++ > Exp =26 a =27


//        int a = 54;
//        System.out.println(++a + ++a + ++a + a++ + a++ + ++a + a++);
//        System.out.println(a);

         // A > ++a > Exp = 55  a = 55
//       // B > ++a > Exp = 56 a = 56
//       // C > ++a > Exp =57 a = 57
//       // D > a++ > Exp =57  a =58
        // E > a++ > Exp =58 a  =59
        // F > ++a > Exp = 60 a = 60
        // G > a++ > Exp = 60 a = 61

        int a = 78;
        int b = 31;
        System.out.println(++a + ++b + --a + b++ + b-- + ++a + b++);
        System.out.println(a);
        System.out.println(b);

        // A > ++a > Exp = 79 a = 79
        // B > ++b > Exp = 32 b = 32
        // C > --a > Exp = 78  a =78
        // D > b++ > Exp = 32 b = 33
        // E > b-- > Exp = 33 b = 32
        // F > ++a > Exp = 79 a = 79
        // G > b++ > Exp = 32 b = 33
    }
}
