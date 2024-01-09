package Algoritma1;

public class Ornek29 {
    /*
    Parametre gelen stringdeki küçük harfleri büyük,
    büyük harfleri küçük yapan recursive fonksiyon
     */
    public static void main(String[] args) {
        System.out.println(Degistiren("EdaNuR", 0));
    }

    public static String Degistiren(String str, int indis) {
        if (indis == str.length())
            return " ";
        if (str.charAt(indis) >= 'a' && str.charAt(indis) <= 'z')
            return ((char) (str.charAt(indis) - 32)) + Degistiren(str, indis + 1);
        if (str.charAt(indis) >= 'A' && str.charAt(indis) <= 'Z')
            return ((char) (str.charAt(indis) + 32)) + Degistiren(str, indis + 1);
        else
            return Degistiren(str, indis + 1);
    }
}
