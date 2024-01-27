package src.basics_04;

public class demo052 {
    public static void main(String[] args) {

        //This is available only in and above JDK > 13 version

        int itemcode = 005;
        switch (itemcode){

            case 001,002,003:
            System.out.println("This is electronic gadget");
            break;

            case 004,005:
                System.out.println("This is software product");
            break;

            default:
                System.out.println("No category");
        }

    }
}