package Algoritma1;

import java.util.Scanner;

public class Ornek12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] array = new char[5][6];
        /*
        Oluşturduğumuz 30 elemanlı dizinin tek tek yerlerini dolaşıp
        kelime atamak için 2 döngü kullandık.
         */
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.println("Kelime giriniz.");
                array[i][j] = scanner.next().charAt(0);
            }
        }
        int[]adet = Sayac(array);
        System.out.println("Büyük harf sayısı: " + adet[0]);
        System.out.println("Küçük harf sayısı: " + adet[1]);


    }


    /*
    İki boyutlu 5*6 elemanlı dizide büyük ve küçük
    harf saysını geri döndüren metod
     */
    public static int[] Sayac(char[][] array) {
        /*
        2 Elemanlı bir dizi oluşturduk. Büyük harfleri 1. elemana, küçük
        harfleri 2. elemana atacağız.
         */
        int[] adet = new int[2];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j] >= 'A' && array[i][j] <= 'Z') {
                    adet[0] += 1;
                } else if(array[i][j] >= 'a' && array[i][j] <= 'z'){
                    adet[1] += 1;
                }
            }
        }
        return adet;
    }
}

