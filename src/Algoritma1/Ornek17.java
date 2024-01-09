package Algoritma1;

public class Ornek17 {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 12, 33, 4, 5};

        OrtakEleman(arr1, arr2);
    }

    /*
    Parametre gelen aynı boyuttaki iki tamsayı dizisindeki
    ortak elemanları başka bir diziye atan ve bu diziyi
    geri döndüren metod
     */
    public static int[] OrtakEleman(int[] arr1, int[] arr2) {
        int[] newArray = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    newArray[i] = arr1[i];
                }
            }
        }
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + "-");
        }

        return newArray;
    }
}

