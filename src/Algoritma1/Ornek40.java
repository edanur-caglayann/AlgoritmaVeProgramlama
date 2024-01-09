package Algoritma1;

public class Ornek40 {
    public static void main(String[] args) {
        System.out.println(PalindromMu("level", 0));
        System.out.println(PalindromMu("eda", 0));
    }

    /*
   Parametre gelen string palindrom mu recursive fonksiyon
     */
    public static boolean PalindromMu(String str, int indis) {
        if (indis == str.length() / 2)
            return true;
        if (str.charAt(indis) != str.charAt(str.length() - 1 - indis)) {
            return false;

        } else {
            return PalindromMu(str, indis + 1);

        }
    }
}
