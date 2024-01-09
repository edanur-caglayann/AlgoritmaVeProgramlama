package Algoritma1;

public class Ornek02 {
    public static void main(String[] args) {
        String[][] array = {
                {"Eda", "Nur", "Satuk"},
                {"Buğra", "Derin", "Su"}
        };
        sonKarekter(array);
    }

    /*
    Parametre gelen iki boyutlu string dizisi içindeki
    son karekteri 'a' olan elemanları ve yerlerini ekrana
    yazan metot
     */
    public static void sonKarekter(String[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j].charAt(array[i][j].length() - 1) == 'a') {
                    System.out.println(array[i][j] + "-" + i + "-" + j);
                }
            }
        }
    }
}
