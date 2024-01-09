package Algoritma1;

public class Ornek13 {
    /*
    Parametre gelen 5 elemanlı dizide en küçük 3. sayıyı bulan metod
     */
    public static void main(String[] args) {
        int[] array = {3, 12, 16, 5, 21};
        Siralama(array);


        System.out.println("En küçük 3. sayı: " + array[2]);
    }


    public static void Siralama(int[] array) {
        // Küçükten büyüğe sıralama
        int tmp;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    tmp = array[j];
                    array[j] = array[i];
                    array[i] = tmp;
                }
            }
        /*
        İç içe iki döngü kullanmamızın sebebi tek döngü kullansaydık dizi sonuna kadar ard arda olan
        iki elemanı kıyaslardık.
        İki döngüyle tüm elemanları birbiri ile kıyaslamış olduk.
         */
        }

    }
}
