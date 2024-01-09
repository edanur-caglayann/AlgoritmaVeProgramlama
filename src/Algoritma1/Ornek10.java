package Algoritma1;

import java.util.Scanner;

public class Ornek10 {
    /*
   Klavyeden girilen sayılar içerisinde sıfır sayısı
   girildiğinde o ana kadarki sayıları toplayan ve bu
   işlemi 10 kere yapan program
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int toplam = 0;

        for (int i = 0; i < 10; i++) { //10 defa toplama işlemi yapması için
            while (true) { //Sıfır girilene dek çalışsın
                System.out.println("Toplam için sayı değerini giriniz:");
                int sayi = scanner.nextInt();
                if (sayi == 0) {
                    break;
                } else {
                    toplam += sayi;
                }
            }
            System.out.println("İşleminizin sonucu:" + toplam);
            toplam = 0;
            /*
            Toplamı en son sıfırlamamızın sebei 10 defa 0 girilinceye kadar ki sayıları
            toplama işlemi yaptığımız için toplam sonucunu her sonucu yazdırdıktan
            sonra sıfırlamalıyız.
             */
        }
    }


}
