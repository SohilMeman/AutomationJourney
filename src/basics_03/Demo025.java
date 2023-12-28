package src.basics_03;

public class Demo025 {
    public static void main(String[] args) {
        String s1 = "Sohil"; // stored in String constant Pool

        String s2 = new String("Sohil");
        //NEW operator is used to create the new object for class
        //It returns the address of newly created object.
        System.out.println(s2);
        System.out.println(new String("Sohil"));


    }
}
