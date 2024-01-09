package Algoritma1;

public class Ornek43 {
    public static void main(String[] args) {

        int[][] A = {{1, 2, 3},
                {1, 2, 3},
                {1, 2, 3}};

        int[][] B = {{4, 23, 3},
                {1, 2, 0},
                {1, 9, 3}};
        int sonuc[][] = toplam(A, B);


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(sonuc[i][j] + ", ");
            }
            System.out.println("");
        }
    }

    /*
    gelen 3x3 lük A ve B matrislerinin
    top geri döndüren metod
     */
    public static int[][] toplam(int[][] A, int[][] B) {
        int[][] newAarray = new int[3][3];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                newAarray[i][j] = A[i][j] + B[i][j];
            }
        }
        return newAarray;
    }
}
