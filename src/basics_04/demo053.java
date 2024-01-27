package src.basics_04;

public class demo053 {
    public static void main(String[] args) {

        //This is available only in and above JDK > 13 version
        //-> Arrow will act as a break

        int itemcode = 001;
        switch (itemcode){

            case 001,002,003-> System.out.println("This is a laptop");
            case 004,005 -> System.out.println("This is mobile");
            case 006-> System.out.println("This is mouse");
            default-> System.out.println("No category");
        }

    }
}