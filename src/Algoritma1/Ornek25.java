package Algoritma1;

public class Ornek25 {
    /*
    Parametre gelen dizinin her bir elemanını 1 arttırıp geri döndüren recursive fonksiyon
     */
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        arr = BirEkle(arr, 0);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "-");
        }
    }

    public static int[] BirEkle(int[] array, int indis) {
        if (indis == array.length) {
            return array;
        }
        array[indis]++;
        return BirEkle(array, indis + 1);
    }
}
