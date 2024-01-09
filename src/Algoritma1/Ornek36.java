package Algoritma1;

import java.awt.*;
import java.util.Arrays;

public class Ornek36 {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2},
                {13, 24},
                {36, 21},
        };
        System.out.println(Arrays.toString(EnBuyuk(array)));
    }

    /*
    Parametre gelen iki boyutlu tamsayı dizisinin en büyük
    elemanının indisini geri döndüren metod
     */
    public static int[] EnBuyuk(int[][] array) {
        int EnBuyuk = array[0][0];
        int[] indis = new int[2];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (EnBuyuk < array[i][j]) {
                    EnBuyuk = array[i][j];
                    indis[0] = i;
                    indis[1] = j;
                }
            }
        }
        return indis;
    }
}
