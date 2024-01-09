package Algoritma1;

public class Ornek26 {
    /*
    Parametre gelen sayının kaç basamaklı olduğunu geri
    döndüren recursive fonksiyon
     */
    public static void main(String[] args) {
        int sayi = 2345;
        System.out.println(KacBasamakli(sayi, 0));
    }

    public static int KacBasamakli(int sayi, int sayac) {
        if (sayi == 0)
            return sayac;
        else
            return KacBasamakli(sayi / 10, sayac + 1);
    }
}
