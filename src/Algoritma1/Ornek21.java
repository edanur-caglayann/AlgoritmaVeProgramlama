package Algoritma1;

public class Ornek21 {
    /*
    Parametre gelen 10 elemanlı tamsayı dizisindeki
    pozitif tamsayı adedini bulan recursive fonksiyon
     */
    public static void main(String[] args) {
        int[] array = {1, 3, -3, 54, -21, -33, -7, 8, 9, 10};
        System.out.println(PozitifSayi(array, 0, 0));
    }

    public static int PozitifSayi(int[] array, int indis, int sayac) {
        if (indis == array.length) {
            return sayac;
        }
        if (array[indis] > 0) {
            return PozitifSayi(array, indis + 1, sayac + 1);
        } else {
            return PozitifSayi(array, indis + 1, sayac);
        }
    }
}
