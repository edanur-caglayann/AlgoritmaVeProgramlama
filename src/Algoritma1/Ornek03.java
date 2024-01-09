package Algoritma1;

public class Ornek03 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int[] arr = {12, 16, 3, 21};
        siraliMi(array);
        siraliMi(arr);
    }

    /*
    Parametre gelen dizinin küçükten büyüğe sıralı
    olup olmadığını bulan metod
     */

    public static void siraliMi(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                System.out.println("Dizi sıralı değildir.");
            }
        }
        System.out.println("Dizi sıralıdır.");


    }
}
