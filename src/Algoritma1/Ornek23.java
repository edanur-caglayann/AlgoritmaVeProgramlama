package Algoritma1;

public class Ornek23 {
    /*
    Parametre olarak gelen stringi ters çevirip
    geri döndüren recursive fonksiyon
     */
    public static void main(String[] args) {
        String str = "edanur";
        System.out.println(TersCevirme(str,0));
    }

    public static String TersCevirme(String str, int indis) {
        if (indis == str.length()) {
            return "";
        } else {
            return str.charAt(str.length() - (indis + 1)) + TersCevirme(str, indis + 1);
        }

    }
}