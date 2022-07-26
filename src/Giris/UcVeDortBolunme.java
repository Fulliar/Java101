package Giris;
import java.util.Scanner;
public class UcVeDortBolunme {
    public static void main(String[] args){

        Scanner inp = new Scanner(System.in);

        System.out.println("Sayı Giriniz : ");
        int k = inp.nextInt();
        int i = 1;
        while (i <= k) {
            if ((i % 12) == 0){
                System.out.println(i);
            }
            i++;
        }
    }
}
