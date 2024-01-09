package Algoritma1;

public class Ornek07 {
    public static void main(String[] args) {
        String[][] array = {
                {"ed1", "nur"},
                {"su", "derin7"}};
        SadeceHarf(array);

    }

    /*
    İki boyutlu string dizisi içindeki her bir string dizisi içinde
    rakam olmayanları geri döndüren metod
     */
    public static void SadeceHarf(String[][] array) {
        String tmp = "";
        boolean rakamVar = false;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                // Bir kelimenin harflerini tek tek dolaşmak için yeni bir döngü daha oluşturalım.
                for (int k = 0; k < array[i][j].length(); k++) {
                    rakamVar = false;
                    if (array[i][j].charAt(k) >= '0' && array[i][j].charAt(k) <= '9') {
                        rakamVar = true;
                        break;
                    }
                }
                if (!rakamVar) {
                    tmp = tmp + array[i][j] + ",";
                }
            }

        }
        System.out.print(tmp);
    }

}
