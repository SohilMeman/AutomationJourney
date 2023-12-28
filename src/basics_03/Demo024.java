package src.basics_03;

public class Demo024 {
    public static void main(String[] args) {
        int course = 100;
        float GST = 0.1845f;
        float total = course + course*GST; //Always use bigger basket to do not loose data
        System.out.println(total);

        //Reverse of above case

        float course1 = 100;
        float  GST1 = 18.45f;
        double total1 = course1+GST1;
        System.out.println(total1);




    }
}
