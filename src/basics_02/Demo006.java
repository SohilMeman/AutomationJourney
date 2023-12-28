package src.basics_02;

public class Demo006 {

    /**
     * Difference between  print and println
     * print is a string when we use it.it prints in same line
     * println prints in a new line
     *
     */
    public static void main(String[] args) {
        System.out.print("Hello World");
        System.out.println("Sohil");

        //souf printf used to do a formatting
        // %d > Used for any integer > byte, short,int, long
        //%s > used for string
        //%c > char
        //%f > float

        int age = 40;
        System.out.printf("Your age is %d",age);
        //why %d is not printed because we used printf function
        //if we use println then its print with %d


    }
}
