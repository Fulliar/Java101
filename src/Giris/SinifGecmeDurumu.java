package Giris;
import java.util.Scanner;


public class SinifGecmeDurumu {
    public static void main(String[] args){
        int mat,fizik,turkce,kimya,muzik;
        int numberOfClasses = 0;
        double sum = 0;

        Scanner inp = new Scanner(System.in);

        System.out.println("Matematik notunuz : ");
        mat = inp.nextInt();
        if (mat >= 0 && mat <= 100){
            sum += mat;
            numberOfClasses++;
        }

        System.out.println("Fizik notunuz : ");
        fizik = inp.nextInt();
        if (fizik >= 0 && fizik <= 100){
            sum+=fizik;
            numberOfClasses++;
        }

        System.out.println("Türkçe notunuz : ");
        turkce = inp.nextInt();
        if (turkce >= 0 && turkce <= 100){
            sum+=turkce;
            numberOfClasses++;
        }

        System.out.println("Kimya notunuz : ");
        kimya = inp.nextInt();
        if (kimya >= 0 && kimya <= 100){
            sum+=kimya;
            numberOfClasses++;
        }

        System.out.println("Müzik notunuz : ");
        muzik = inp.nextInt();
        if (muzik >= 0 && muzik <= 100){
            sum+=muzik;
            numberOfClasses++;
        }
        double avarage = sum/numberOfClasses;
        if (avarage <= 55){
            System.out.println("Sınıfta kaldınız, seneye tekrar görüşmek üzere!");
        } else {
            System.out.println("Tebrikler, sınıfı geçtiniz!");
        }
        System.out.println("Ortalamanız : " + avarage);

    }
}
