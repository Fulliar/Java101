package Giris;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class BurcProgrami {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Doğduğunuz ay : ");
        int month = input.nextInt();

        System.out.println("Doğduğunuz gün : ");
        int day = input.nextInt();

        if (month == 1 ){
            if(day >= 1 && day <= 22){

                System.out.println("Oğlak");

            } else if(day > 22 && 31 >= day){

                System.out.println("Kova");
            }
        } else if (month == 2){
            if(day >= 1 && day <=19){

                System.out.println("Kova");
            } else if(day >= 20 && day <= 28)

                System.out.println("Balık");
        } else if (month == 3){
            if(day >= 1 && day <=20){

                System.out.println("Balık");
            } else if (day >= 21 && day <= 31){

                System.out.println("Koç");
            }

        } else if (month == 4){
            if(day >= 1 && day <= 20){

                System.out.println("Koç");

            } else if (day >= 21 && day <= 30){

                System.out.println("Boğa");
            }

        } else if (month == 5){
            if(day >= 1 && day <= 21){

                System.out.println("Boğa");

            } else if (day >= 22 && day <= 31) {

                System.out.println("İkizler");

            }

        } else if (month == 6){
            if(day >= 1 && day <= 22){

                System.out.println("İkizler");

            } else if (day >= 23 && day <= 30){

                System.out.println("Yengeç");

            }

        } else if (month == 7){
            if(day >= 1 && day <= 22){

                System.out.println("Yengeç");

            } else if (day >= 23 && day <= 31){

                System.out.println("Aslan");

            }

        } else if (month == 8){
            if(day >= 1 && day <= 22){

                System.out.println("Aslan");

            } else if (day >= 23 && day <= 31){

                System.out.println("Başak");
            }

        } else if (month == 9){
            if (day >= 1 && day <= 22){

                System.out.println("Başak");

            } else if  (day >= 23 &&  day <= 30){

                System.out.println("Terazi");

            }

        } else if (month == 10){
            if (day >= 1 && day <= 22){

                System.out.println("Terazi");

            } else if (day >= 23 && day <= 31){

                System.out.println("Akrep");

            }

        } else if (month == 11){
            if (day >= 1 && day <= 21){

                System.out.println("Akrep");

            } else if (day >= 22 && day <= 30){

                System.out.println("Yay");

            }

        } else if (month == 12){
            if (day >= 1 && day <= 21){

                System.out.println("Yay");

            } else if (day >= 22 && day <= 31){

                System.out.println("Oğlak");
            }

        } else {
            System.out.println("Hatalı giriş yaptınız, tekrar deneyiniz.");
        }

        }
    }

