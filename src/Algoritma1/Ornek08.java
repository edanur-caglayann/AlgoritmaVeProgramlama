package Algoritma1;

import java.util.Scanner;

public class Ornek08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir kelime giriniz:");
        String s1 = scanner.nextLine();
        System.out.println("İkinci kelimeyi giriniz:");
        String s2 = scanner.nextLine();
        FarkliKarekter(s1, s2);
    }
    /*
    Klavyeden girilen iki stringin karekterleri arasında yerleri
    aynı olmak şartıyla birbirinden farklı olan karekterleri birleştirip
    geri döndüren metod  (Stringler eşit uzunluktadır)
     */


    public static String FarkliKarekter(String str1, String str2) {
        String tmp = "";
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                tmp = tmp + str1.charAt(i) + str2.charAt(i);
            }
        }
        System.out.println(tmp);
        return tmp;
    }

}
