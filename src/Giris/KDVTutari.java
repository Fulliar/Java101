package Giris;
import java.util.Scanner;
public class KDVTutari {
    public static void main(String[] args){

        Scanner inp = new Scanner(System.in);

        System.out.println("Ürün Tutarını giriniz.");
        double tutar = inp.nextDouble();

        System.out.println("KDV'siz Fiyat = " + tutar);
        System.out.println("KDV'li Fiyat = " + ((tutar*0.18)+tutar));
        System.out.println("KDV tutarı = " + (tutar*0.18));
    }
}
