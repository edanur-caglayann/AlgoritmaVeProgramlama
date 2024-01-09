package Algoritma1;

public class Ornek22 {
    /*
    Parametre gelen tamsayı dizisinin küçükten büyüğe sıralı
    olup olmadığını geri döndüren recursive fonksiyon
     */
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int[] array1 = {1, 2, 13, 4, 5};
        System.out.println(SiraliMi(array, 0));
        System.out.println(SiraliMi(array1, 0));
    }

    public static boolean SiraliMi(int[] array, int indis) {
        if (indis == array.length - 1) {
            return true;
        }
        if (array[indis] < array[indis + 1]) {
            return SiraliMi(array, indis + 1);
        } else {
            return false;
        }
    }
}
