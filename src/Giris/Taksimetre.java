package Giris;
import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);


        System.out.println("Km değerini giriniz : ");
        double perkm = inp.nextDouble();

        double ucret = ((perkm * 2.20)+10);


        boolean kosul = ucret <= 20;
        int minucret= 20;

        double sonucret = kosul ? minucret : ucret;
        System.out.println("Toplam tutar" + sonucret);

    }
}
