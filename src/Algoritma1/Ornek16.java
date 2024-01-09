package Algoritma1;

public class Ornek16 {
    /*
    5 elemanlı tamsayı dizisindeki en büyükk
    tek tamsayıyı bulan program
   */
    public static void main(String[] args) {
        int[] array = {7, 21, 4, 62, 65};
        int tmp = 0;
        int[] tekSayilar = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                tekSayilar[i] = array[i];
            }
        }
        //Büyükten küçüğe sıralama
        for (int j = 0; j < tekSayilar.length - 1; j++) {
            if (tekSayilar[j] < tekSayilar[j + 1]) {
                tmp = tekSayilar[j + 1];
                tekSayilar[j + 1] = tekSayilar[j];
                tekSayilar[j] = tmp;
            }

        }
        System.out.println("Dizinin en büyük tek sayısı:" + tmp);
    }
}