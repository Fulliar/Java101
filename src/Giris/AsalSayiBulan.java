package Giris;

import java.util.Scanner;
public class AsalSayiBulan {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Sayı Giriniz :");
        int sayi = scan.nextInt();
        AsalMi(sayi,2);

    }
    public static void AsalMi(int sayi, int i){

       if(i == sayi){

           System.out.println(sayi + " sayısı ASALDIR !");
            return;

       } else if (sayi % i == 0){

           System.out.println(sayi + " sayısı ASAL DEĞİLDİR !");
            return ;

       }
       AsalMi(sayi , i+1);
    }
}
