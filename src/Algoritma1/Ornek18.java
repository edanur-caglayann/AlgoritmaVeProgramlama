package Algoritma1;

import java.util.Scanner;

public class Ornek18 {
    /*
    Klavyeden 6 adet tamsayıyı okuyup bunları bir diziye atan,
    daha sonra bu dizinin en büyük, en küçük değerini ve ortalamasını
    bulan program
     */
    public static void main(String[] args) {
        int[] array = new int[6];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            System.out.println("Bir tamsayı değeri giriniz:");
            int sayi = scanner.nextInt();
            array[i] = sayi;
        }
        int max = array[0];
        int min = array[0];
        double toplam = 0.0;
        double ortalama = 0.0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        for (int i = 0; i < array.length; i++) {
            toplam += array[i];
        }
        ortalama = (toplam) / array.length;

        System.out.println("Dizinin en büyük elemanı:" + max);
        System.out.println("Dizinin en küçük elemanı:" + min);
        System.out.println("Dizinin ortalaması:" + ortalama);
    }
}
