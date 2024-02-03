package src.basics_06;

public class demo081 {
    public static void main(String[] args) {
//
//        int[] marks_11 = {99,90,54,23,43};
//        System.out.println(marks_11.length);
//        System.out.println(marks_11[0]);
//        System.out.println(marks_11[1]);
//        System.out.println(marks_11[2]);
//        System.out.println(marks_11[3]);
//        System.out.println(marks_11[4]);

        int[] a =  new int[4];
        // a -> [0,0,0,0] - default value of int -> 0
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a[3]); // 0 to 3

        a[0] = 76;
        a[1] = 67;
        a[2] = 80;
        a[3] = 44;
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a[3]);

        final int[] b = new int[4];
        // b -> [0,0,0,0]
        b[0] = 78;
        System.out.println(b[0]);





    }
}
