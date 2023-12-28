package src.basics_03;

public class Demo016 {
    public static void main(String[] args) {
        //string concatenation operator
        int a = 10;
        int b = 45;
        System.out.println(a+b);
        String name = "Sohil";
        System.out.println(a+name); //Concatenation happens
        System.out.println(name+a);
        //for int will go from Left -> right so in below case first a+b=55 then name will take so outpout will be 55Sohil
        //Concatenation happens only string + other
        System.out.println(a+b+name);
        //Below case all are concatenation soo/p Sohil1045
        System.out.println(name+a+b);

    }
}
