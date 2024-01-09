package Algoritma1;

public class Ornek20 {
    /*
    Parametre gelen stringdeki küçük karekter sayısısını
    geri döndüren recursive fonksiyon
     */
    public static void main(String[] args) {
        String str = "EdAnuR";
        System.out.println(KucukKarakter(str, 0, 0));
    }

    public static int KucukKarakter(String str, int indis, int sayac) {
        //Kelimenin sonuna geldiysen sayacı döndür
        if (indis == str.length()) {
            return sayac;
        }
        //Küçük harf ise sayacı bir arttırıp diğer indisteki karaktere bak
        if (str.charAt(indis) >= 'a' && str.charAt(indis) <= 'z') {
            return KucukKarakter(str, indis + 1, sayac + 1);
        }
        //Küçük harf değil ise bir sonraki indisin karakterine bak
        else {
            return KucukKarakter(str, indis + 1, sayac);
        }
    }
}
