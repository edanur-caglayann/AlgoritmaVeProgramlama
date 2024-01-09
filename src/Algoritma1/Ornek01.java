package Algoritma1;

public class Ornek01 {
    public static void main(String[] args) {
        int[][] array =
                {{3, 4, 5},
                {12, 13, 14}};
        int[] newArray = tekBoyutlu(array);
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + "-");
        }
    }

    /*
    Parametre gelen iki boyutlu diziyi tek boyutlu
    diziye dönüştürüp geri döndüren metodu yazınız.
     */
    public static int[] tekBoyutlu(int[][] array) {
        /*
        Yeni tek boyutlu bir dizi oluşturalım.Yeni dizi iki boyutlu
        dizinin satır ve sütun sayısının çarpımı kadar olsun.(Tek boyutlu dizide
        birleştireceğimiz için)
         */
        int[] newArray = new int[array.length * array[0].length];

        int k = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                newArray[k] = array[i][j];
                k++;
            }
        }
        return newArray;
    }

}
