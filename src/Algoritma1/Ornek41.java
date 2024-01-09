package Algoritma1;

public class Ornek41 {
    public static void main(String[] args) {
        int[] array = {-2, 3, 5, -13, -25};
        System.out.println(negatifToplam(array, 0, 0));
    }

    /*
    Parametre gelen tek boyutlu sayısal dizideki negatif
    sayıların toplamını geri döndüren recursive fonksiyon
     */
    public static int negatifToplam(int[] array, int indis, int toplam) {
        if (indis == array.length)
            return toplam;
        if (array[indis] < 0)
            return negatifToplam(array, indis + 1, toplam + array[indis]);
        else
            return negatifToplam(array, indis + 1, toplam);
    }
}
