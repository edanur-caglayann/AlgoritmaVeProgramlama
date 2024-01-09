package Algoritma1;

import java.util.Scanner;

public class Ornek42 {
    /*
    Klavyeden rastgele sayılar giriliyor. Bu sayılar içinde
    10 tane asal sayı girildiğinde bu sayıları diziye atan ve
    dizideki en büyük sayıyı ekrana yazdıran prgram
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] asalDizi = new int[10];
        int sayac = 0;
        int num = 1;
        while (true) {
            System.out.println(num + " Bir sayı giriniz:");
            int sayi = scanner.nextInt();
            if (AsalMi(sayi)) {
                asalDizi[sayac] = sayi;
                sayac++;
            }
            if (sayac == 10)
                break;
            num++;
        }
        System.out.print("Dizideki en büyük asal sayı:"+enBuyuk(asalDizi));
    }

    public static boolean AsalMi(int sayi) {
        if(sayi <= 1){
            return false;
        }
        for (int i = 1; i < Math.sqrt(sayi); i++) {
            if (sayi % i == 0) {
                return false;
            }
        }
        return true;
    }


    public static int enBuyuk(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }

        }
        return max;
    }
}
