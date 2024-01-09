package Algoritma1;

public class Ornek35 {
    public static void main(String[] args) {
        String[] str = {"Edanur", "Çağlayan", "Güneş", "Satuk"};
        System.out.println(EnUzun(str));
    }

    /*
    Parametre gelen string dizisindeki en uzun
    elemanın indisini geri döndüren metod
     */
    public static int EnUzun(String[] str) {
        int indis = 0;
        String enUzun = str[0];
        for (int i = 0; i < str.length; i++) {
            if (enUzun.length() < str[i].length()) {
                enUzun = str[i];
                indis = i;
            }
        }
        return indis;
    }
}
