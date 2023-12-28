package src.basics_02;

public class Demo010 {
    public static void main(String[] args) {

        char ch = 'A';
        System.out.println(ch);
        char c1 = '$';
        System.out.println(c1);
        char c2 = 'B';
        System.out.println('\n'); // \n means print in new line
        System.out.println(c2);

        /*UNICODDE Means Universal Code
        Starts with /u0

         */
        char c3 = '\u1F04';
        System.out.println(c3);

        //OCTAL

        int b = 0101;

        //Binary

        int b2 = 0b101;

        //Hexadecimal

        int c4 = 0xface;


    }
}
