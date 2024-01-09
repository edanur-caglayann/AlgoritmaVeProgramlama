package Algoritma1;

public class Ornek33 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println(Toplam(array));
    }

    /*
    Parametre gelen tamsayı dizisinin elemanlarını
    toplayıp geri döndüren metod
     */
    public static int Toplam(int[] array) {
        int toplam = 0;
        for (int i = 0; i < array.length; i++) {
            toplam += array[i];
        }
        return toplam;
    }
}
