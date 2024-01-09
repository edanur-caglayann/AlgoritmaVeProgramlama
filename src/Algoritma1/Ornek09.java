package Algoritma1;

import java.util.Scanner;

public class Ornek09 {
    public static void main(String[] args) {
        String[][]array=new String[2][2];
        Scanner scanner= new Scanner(System.in);
        System.out.println("4 Adet kelime giriniz:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = scanner.nextLine();
            }
        }
        tekKarakter(array);

    }
    /*
        Klavyeden girilen iki boyutlu string dizisi içinde tek
        karektere sahip olanları ekrana yazdıran metod
     */
    public static String[][] tekKarakter(String[][]array){
        String[][]newArray= new String[array.length][array[0].length];
        for (int i = 0; i <array.length; i++) {
            for (int j = 0; j < array[0].length ; j++) {
                if(array[i][j].length()==1){
                    newArray[i][j]=array[i][j];
                }
                else
                    newArray[i][j]="-";
            }
        }
        for (int i = 0; i < newArray.length; i++) {
            for (int j = 0; j < newArray[i].length; j++) {
                System.out.print(newArray[i][j] + " ");
            }
            System.out.println();
        }
        return newArray;
    }
}

