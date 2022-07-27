package Giris;

import java.util.Scanner;

public class EbobVeEkok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("N1'i giriniz : ");
        int firstNumb = input.nextInt();
        System.out.println("N2'yi giriniz : ");
        int secondNumb = input.nextInt();
        int i;
        int ebob;
        int ekok;
        int j = 1;
        if (secondNumb < 0 || firstNumb < 0) {
            System.out.println("Lütfen doğal sayı giriniz...");
        } else {
            if (secondNumb < firstNumb) {
                i = secondNumb;
                while (i-- >= 1) {
                    if (firstNumb % i == 0 && secondNumb % i == 0) {

                        ebob = i;
                        System.out.println("EBOB Değeri : " + ebob);
                        break;

                    }
                }
            } else {
                i = firstNumb;
                while (i-- >= 1) {
                    if (firstNumb % i == 0 && secondNumb % i == 0) {

                        ebob = i;
                        System.out.println("EBOB Değeri : " + ebob);
                        break;

                    }
                }
            }
            while (j++ <= firstNumb * secondNumb) {
                if (j % firstNumb == 0 && j % secondNumb == 0) {
                    ekok = j;
                    System.out.println("EKOK Değeri : " + ekok);
                    break;
                }
            }
        }
    }
}
