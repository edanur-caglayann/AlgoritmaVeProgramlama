package Algoritma1;

public class Ornek39 {
    public static void main(String[] args) {
        int sayi = 11240;
        System.out.println(BasamakSayisi(sayi, 0));
    }

    /*
    Parametre gelen sayının basamak sayısını geri döndüren
    recursive fonksiyon
     */
    public static int BasamakSayisi(int sayi, int sayac) {
        if (sayi == 0)
            return sayac;
        else
            return BasamakSayisi(sayi / 10, sayac + 1);
    }

}
