package src.basics_03;

public class Demo018 {
    public static void main(String[] args) {
        //Relational operator
        // > < <= >+ ==  !=
        int age_sohil = 30;
        int age_kausar = 25;
        boolean result = age_sohil > age_kausar;
//        System.out.println(result);

        int a = 10;
        int b = 20;
        boolean c = a>=b;
//      System.out.println(c);

        System.out.println(10==10);
        System.out.println(10>10);
        System.out.println(10<10);
        System.out.println(10>=10);
        System.out.println(10<=10);

        System.out.println("----");

        System.out.println('A' == 65); // ASCII

        byte b1 = 65;
        System.out.println('A'==b1);
        System.out.println('A'==65.0); // This is a property of Java
        System.out.println('A'==65.0f);


    }
}
