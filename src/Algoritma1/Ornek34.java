package Algoritma1;

public class Ornek34 {
    public static void main(String[] args) {
        int[] array = {12, 13, 11, 14, 15};
        System.out.println(EnKucuk(array));
    }

    /*
    Parametre gelen dizinin en küçük elemanının indisini
    geri döndüren metod
     */
    public static int EnKucuk(int[] array) {
        int enKucuk = array[0];
        int indis = 0;
        for (int i = 0; i < array.length; i++) {
            if (enKucuk > array[i]) {
                enKucuk = array[i];
                indis = i;
            }
        }
        return indis;
    }
}
