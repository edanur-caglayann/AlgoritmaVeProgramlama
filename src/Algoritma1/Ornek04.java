package Algoritma1;

public class Ornek04 {
    public static void main(String[] args) {
        String[] array = new String[6];
        array = new String[]{"Eda", "Nur", "Çağlayan", "Buğra", "Satuk", "Dilay"};
        karakterSayisi(array);
    }

    /*
    Parametre gelen 6 eleamanlı tek boyutlu dizinin
    karekter sayısı 3 olanları bulup ekrana yazdıran metod
     */
    public static void karakterSayisi(String[] array) {
        String tmp = "";
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() == 3) {
                tmp = array[i] + "-";
                System.out.print(tmp);

            }
        }
    }
}
