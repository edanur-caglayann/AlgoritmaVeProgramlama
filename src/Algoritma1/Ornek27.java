package Algoritma1;

public class Ornek27 {
    /*
    Parametre gelen iki stringdeki aynı indiste aynı karekter olanları
    geri döndüren recursive fonksiyon(stringlerin uzunlukları eşit)
     */
    public static void main(String[] args) {
        String str1 = "Edanur";
        String str2 = "Elanaz";
        System.out.println(AynıKarakter(str1, str2, 0));
    }

    public static String AynıKarakter(String str1, String str2, int indis) {
        if (indis == str2.length())
            return "";
        if (str1.charAt(indis) == str2.charAt(indis))
            return str1.charAt(indis) + "-" + AynıKarakter(str1, str2, indis + 1);

        else
            return AynıKarakter(str1, str2, indis + 1);
    }
}
