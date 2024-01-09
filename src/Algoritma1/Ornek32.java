package Algoritma1;

public class Ornek32 {
    public static void main(String[] args) {
        String str1 = "Edanur";
        String str2 = "Çağlayan";
        System.out.println(EnUzun(str1, str2));
    }

    /*
    Parametre gelen iki kelimeden arasında uzun olanı geri döndüren metod
     */
    public static String EnUzun(String str1, String str2) {

        for (int i = 0; i < str1.length(); i++) {
            for (int j = 0; j < str2.length(); j++) {
                if (str1.length() > str2.length()) {
                    return str1;
                } else if (str1.length() < str2.length()) {
                    return str2;
                }
            }
        }
        return str1;
    }
}