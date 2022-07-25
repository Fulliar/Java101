package Giris;
import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args){
     Scanner inp = new Scanner(System.in);

        System.out.println(" Armut Kaç Kilo ? : ");
        int Armut = inp.nextInt();

        System.out.println(" Elma Kaç Kilo ? : ");
        int Elma = inp.nextInt();

        System.out.println(" Domates Kaç Kilo ? : ");
        int Domates = inp.nextInt();

        System.out.println(" Muz Kaç Kilo ? : ");
        int Muz = inp.nextInt();

        System.out.println(" Patlıcan Kaç Kilo ? : ");
        int Patlican = inp.nextInt();
        double toplam = ((Armut*2.14) + (Elma*3.67) + (Domates*1.11) + (Muz*0.95) + (Patlican*5) );
        System.out.println(" Toplam Tutar : " + toplam );




    }
}
