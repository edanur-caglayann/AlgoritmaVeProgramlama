package Algoritma1;

public class Ornek11 {
    public static void main(String[] args) {
        String str = "Algoritma Ve Progrlama 1";
        BosluklariSil(str);
    }
    /*
    Kendisinde parametre gelen stringdeki boşlukları silip geri döndüren metod
     */
    public static String BosluklariSil(String str){
        String tmp="";
        for (int i = 0; i <str.length(); i++) {
            if(str.charAt(i)!=' '){
                tmp=tmp+str.charAt(i);
            }
        }
        System.out.println(tmp);

        return tmp;
    }
}
