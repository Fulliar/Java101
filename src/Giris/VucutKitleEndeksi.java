package Giris;
import java.util.Scanner;
public class VucutKitleEndeksi {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.println("Lütfen boyunuzu (metre cinsinden) giriniz : ");
        double boy = inp.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz : ");
        double kilo = inp.nextDouble();

        System.out.println("Vücut kitle indeksiniz : " + (kilo/(boy*boy)));


    }
}
