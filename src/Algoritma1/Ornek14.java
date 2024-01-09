package Algoritma1;

public class Ornek14 {
    public static void main(String[] args) {
        String str = "EdaaNurÇaaglayAAn";
        KarakterBulan(str);
    }

    /*
    Parametre gelen stringdeki 'aa' karakterinin sayısını bulan metod
     */
    public static void KarakterBulan(String str) {
        int say = 0;
        //Bir önceki ile bir sonrakini kıyaslayarak devam ettiğimiz için length-1'e kadar gideriz.
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'a' && str.charAt(i + 1) == 'a') {
                say++;
            }
        }
        System.out.println("aa karekter sayısı:" + say);
    }
}
