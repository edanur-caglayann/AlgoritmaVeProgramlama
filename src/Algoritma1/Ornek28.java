package Algoritma1;

public class Ornek28 {
    /*
    Parametre gelen stringin palindrom olup olmadığını geri döndüren recursive fonksiyon
     */
    public static void main(String[] args) {
        String str = "kabak";
        String str1 = "cam";
        String str2 = "kek";
        System.out.println(PalindromMu(str, 0));
        System.out.println(PalindromMu(str1, 0));
        System.out.println(PalindromMu(str2, 0));
    }

    public static boolean PalindromMu(String str, int indis) {
        if (indis == str.length() / 2) return true;
        if (str.charAt(indis) != (str.charAt(str.length() - 1 - indis))) return false;
        else return PalindromMu(str, indis + 1);
    }
}
