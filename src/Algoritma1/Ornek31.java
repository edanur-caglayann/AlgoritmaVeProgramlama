package Algoritma1;

public class Ornek31 {
    public static void main(String[] args) {
        System.out.println(TersCevir("Edanur"));
    }

    /*
    Parametre gelen stringi ters çevirip yazan metod
     */
    public static String TersCevir(String str) {
        String tmp = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            tmp = tmp + str.charAt(i);
        }
        return tmp;
    }
}
