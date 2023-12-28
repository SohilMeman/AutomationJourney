package src.basics_02;

public class Demo007 {
    public static void main(String[] args) {
//        int number = 9;
//        System.out.printf("%d*1=%d*1",number,2);

        //In above case 1st number replace with %d and value is 9 and
        // then 2 is replace with %d
        //we are using it only for formatting

        String name = "Sohil";
        //Concate +
        System.out.println("Your name is -> " + name );

        //formating =
        System.out.printf("Your name is > %s", name);

        System.out.println();

        String name1 = "Nihal";

        System.out.printf("My Son name is %s",name1);


        System.out.println();

        float pi = 3.14567f;
        System.out.printf("The value of %f", pi);




    }
}
