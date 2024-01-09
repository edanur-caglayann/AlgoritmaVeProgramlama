package Algoritma1;

import java.util.Scanner;

public class Ornek19 {
    /*
    Klavyeden girilen stringdeki karakter sayısı 5 ve büyük olanları
    ekrana yazan, 20 olunca çıkan program
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sayac = 0;
        String tmp = "";
        while (true) {
            System.out.println("Kelimeyi giriniz.");
            String str = scanner.nextLine();
            if (str.length() >= 5) {
                tmp += str + "-";
                sayac++;

                if (sayac == 20) {
                    break;
                }
            }


        }
        System.out.print(tmp);
    }
}
