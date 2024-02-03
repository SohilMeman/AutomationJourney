package src.basics_06;

public class demo090 {
    public static void main(String[] args) {

        //1D

        int a[] = {1, 2, 3};

        //2D

        int[][] arr = new int[3][3];
        int arr2[][] = new int[3][3];

        arr[0][0] = 10;
        arr[0][1] = 20;
        arr[0][2] = 30;

        arr[1][0] = 40;
        arr[1][1] = 50;
        arr[1][2] = 60;

        arr[2][0] = 70;
        arr[2][1] = 80;
        arr[2][2] = 90;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println("");
        }
    }
}



