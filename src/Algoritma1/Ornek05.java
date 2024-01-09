package Algoritma1;

public class Ornek05 {
    public static void main(String[] args) {
int[][]array={
        {21,13,19,45,44},
        {1,2,3,4,5}
};
SatirToplami(array);
    }
    /*
    Parametre gelen iki boyutlu tam sayı dizisindeki her bir satırın
    toplamını geri döndüren metod
     */
    public static int[] SatirToplami(int[][]array){
        int toplam=0;
        int satirlar[]= new int[array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                toplam=toplam+array[i][j];
            }
            satirlar[i]=toplam;
            System.out.print(toplam+"-");
            toplam=0;
        }
        return satirlar;
    }
}
