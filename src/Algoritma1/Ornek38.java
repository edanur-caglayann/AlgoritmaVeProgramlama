package Algoritma1;

public class Ornek38 {
    public static void main(String[] args) {
        int[] array = {1, 2, 23, 45, 5};
        System.out.println(EnBuyuk(array, 0, array[0]));
    }

    /*
    5 Elemanlı tamsayı dizisinin en büyük elemanını bulan
    recursive fonksiyon
     */
    public static int EnBuyuk(int[] array, int indis, int max) {
        if (indis == array.length)
            return max;
        if (max < array[indis])
            return EnBuyuk(array, indis + 1, max = array[indis]);
        else {
            return EnBuyuk(array, indis + 1, max);


        }
    }
}
