package Algoritma1;

public class Ornek00 {
    public static void main(String[] args) {
        asalSayi(20, 40);

    }

    /*
    Parametre gelen iki tamsayı arasındaki asal
    sayıları bulup ekrana yazan metodu yazınız
     */
    public static void asalSayi(int sayi1, int sayi2) {
        if (sayi1 < sayi2) {
            for (int i = sayi1; i < sayi2; i++) {
                if (AsalMi(i)) {
                    System.out.print(i + "-");
                }
            }
        } else {
            for (int i = sayi2; i < sayi1; i++) {
                if (AsalMi(i)) {
                    System.out.println("İki tam sayı arasındaki asallar:" + i + "-");
                }
            }
        }
    }


    public static boolean AsalMi(int sayi) {
        for (int i = 2; i < sayi / 2; i++) {
            if (sayi % i == 0) {
                return false;
            }
        }
        return true;
    }
}
