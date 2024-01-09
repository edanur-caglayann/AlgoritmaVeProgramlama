package Algoritma1;

public class Ornek06 {
    public static void main(String[] args) {
    String[][]array= {
            {"eda","bugra"},
            {"satuk","nur"}
        };
    SutunBirlestirme(array);
    }
    /*
    Parametre gelen iki boyutlu string dizisindeki sütunlardaki stringleri
    birleştirip tek boyutlu bir string dizisi olarak geri döndüren metod
     */

    public static String[]SutunBirlestirme(String[][]array){
        String tmp="";
        String[]newArray = new String[array[0].length];
        for (int i = 0; i < array[0].length; i++) {
            for (int j = 0; j < array.length; j++) {
                tmp=tmp+array[j][i];
            }
            newArray[i]=tmp;
            System.out.println(tmp);
            tmp="";
        }
        return newArray;
    }
}
