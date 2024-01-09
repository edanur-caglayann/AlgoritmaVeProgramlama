package Algoritma1;

public class Ornek24 {
    /*
    parametre olarak gelen dizideki en büyük elemanı bulan recursive fonksiyon
     */
    public static void main(String[] args) {
        int[] array = {21, 13, 14, 35, 41};
        System.out.println(enBuyuk(array, 0, 0));
    }

    public static int enBuyuk(int[] array, int indis, int buyuk) {
        if (indis == array.length)
            return buyuk;
        if (buyuk < array[indis]) {
            return enBuyuk(array, indis + 1, buyuk = array[indis]);
        } else {
            return enBuyuk(array, indis + 1, buyuk);
        }
    }

}
