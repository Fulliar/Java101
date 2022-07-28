package Giris;
import java.util.Scanner;






public class Uslu {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Taban değeri giriniz : ");
        int a = scan.nextInt();
        System.out.println(("Üs değerini giriniz : "));
        int b = scan.nextInt();

        System.out.println("Sonuç : " + UsHesabı(a,b));

    }

    public static int UsHesabı(int a, int b) {
        if (b == 0) {
            return 1;
        } else if (a == 0) {
            return 0;
        }
        int sonuc = 1;
        sonuc *= a;
        UsHesabı(a, b - 1);
        return sonuc;
    }
}
