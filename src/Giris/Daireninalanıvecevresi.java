package Giris;
import java.util.Scanner;
public class Daireninalanıvecevresi {
    public static void main(String[] args){
    Scanner inp = new Scanner((System.in));
    System.out.println("Dairenin yarı çapını giriniz...");
    int r= inp.nextInt();
    double pi = 3.14;
    double alan = pi*r*r;
    double cevre = 2*pi*r;
    System.out.println("Dairenin Alanı = " + alan);
    System.out.println("Dairenin Çevresi = " + cevre);

    System.out.println("Dairenin merkez açısını giriniz ");
    double a= inp.nextDouble();

        System.out.println(a + " merkez açılı daire diliminin alanı = " + ((pi*(r*r)*a)/360));




    }


}
