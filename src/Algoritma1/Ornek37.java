package Algoritma1;

public class Ornek37 {
    public static void main(String[] args) {
        int[] tamBolenicinDizi = {10, 15, 20};
        System.out.println("----------------------");
        String[] tamBolenSonuc = tamBolen(tamBolenicinDizi);
        for (int i = 0; i < tamBolenSonuc.length; i++) {
            System.out.print(tamBolenSonuc[i] + " | ");
        }
    }

    /*
    Parametre gelen pozitif tamsayının tam
    bölenlerini geri döndüren metod
     */
    public static String[] tamBolen(int[] sayiDizisi) {
        String[] sonuc = new String[sayiDizisi.length];
        String gecici = "";
        //gelen dizinin indislerini dolaşıyor
        for (int i = 0; i < sayiDizisi.length; i++) {
            for (int j = 2; j <= sayiDizisi[i]; j++) {
                if (sayiDizisi[i] % j == 0) {
                    gecici += j + ",";
                }
            }
            sonuc[i] = gecici;
            gecici = "";
        }

        return sonuc;
    }
}
