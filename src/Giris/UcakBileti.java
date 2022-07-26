package Giris;

import java.util.Scanner;

public class UcakBileti {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int distance;
        int age;
        int journeyType;
        double price;
        double costByPerDistance = 0.10d;

        System.out.print("\nGideceğiniz mesafeyi kilometre olarak giriniz: ");
        distance = input.nextInt();

        System.out.print("Yaşınızı giriniz: ");
        age = input.nextInt();

        System.out.print("Yolculuk tipini belirtiniz (1 - Tek Yön 2 - Gidiş-Dönüş): ");
        journeyType = input.nextInt();

        if (distance < 0 || age < 0 || journeyType != 1 && journeyType != 2) {
            System.out.println("\nHatalı veri girdiniz !");
        } else {

            price = costByPerDistance * distance;

            if (age < 12) {
                price = price / 2;
            } else if (age < 24) {
                price = price - (price * 0.1);
            } else if (age > 65) {
                price = price - (price * 0.3);
            }

            if (journeyType == 2) {
                price = price - (price * 0.2);
                price = price * 2;
            }

            System.out.println("\nToplam Tutar: " + (price));
        }

    }
    }

