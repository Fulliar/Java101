package Giris;
import java.util.Scanner;
public class NotOrtalaması {
    public static void main(String[] args) {

        int mat, fizik, kimya, tarih, muzik, turkce;
        Scanner inp = new Scanner(System.in);

        System.out.println("Matematik Notunuz : ");
        mat = inp.nextInt();

        System.out.println("Fizik Notunuz : ");
        fizik = inp.nextInt();

        System.out.println("Kimya Notunuz : ");
        kimya = inp.nextInt();

        System.out.println("Tarih Notunuz : ");
        tarih = inp.nextInt();

        System.out.println("Müzik Notunuz : ");
        muzik = inp.nextInt();

        System.out.println("Türkçe Notunuz : ");
        turkce = inp.nextInt();

        int toplam = (mat + muzik + fizik + kimya + tarih + turkce);
        double sonuc = toplam / 6.0;
        boolean kosul1 = sonuc >= 60;

        System.out.println("Ortalamamız : " + sonuc);
        String str = kosul1 ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(str);
    }
}
