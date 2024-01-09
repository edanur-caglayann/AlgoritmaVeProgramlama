package Algoritma1;

public class Ornek30 {
    public static void main(String[] args) {
        String str = "Algoritma Ve Programlama";
        System.out.println(KelimeSayisi(str));
    }

    /*
    Parametre gelen stringeki kelime sayısını geri döndüren metod
     */
    public static int KelimeSayisi(String str) {
        int sayac = 1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                sayac++;
            }
        }
        return sayac;
    }
}
