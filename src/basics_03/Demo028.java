package src.basics_03;

public class Demo028 {
    public static void main(String[] args) {
       String name = "Sohil Meman";
       String name1 = "Sohil Meman";
       String name2 = "Sohil meman";
//        System.out.println(name==name1);
//        System.out.println(name.equals(name1));
//        System.out.println(name==name2);

        System.out.println(name.equals(name2)); //Ans will false bcz string2 has case sensitive in meman
        System.out.println(name.equalsIgnoreCase(name2));


    }
}
