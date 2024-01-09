package Algoritma1;

public class Ornek15 {
    public static void main(String[] args) {
        String str = "Algoritma Ve Programlama";
        HarfSayisi(str);
    }

    /*
    Parametre gelen stringdeki harf sayısını geri döndüren metod
     */
    public static int HarfSayisi(String str) {
        int say = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                say++;
            }
        }
        System.out.println("Harf sayısı:" + say);
        return say;
    }
}
