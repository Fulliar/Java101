package Giris;
import java.util.Scanner;

public class TekSayiToplami {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        int total = 0;

        //Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul
        // eden ve girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.
        do{
            System.out.println("Enter Your Number : ");
            n = scan.nextInt();
            if(n%4 == 0) {

                    total += n;

            }
        }while (n%2 == 0);


            System.out.println("Toplam : " + total);

    }
}
