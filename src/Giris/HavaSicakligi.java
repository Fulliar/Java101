package Giris;

import java.util.Scanner;

public class HavaSicakligi {
    public static void main(String[] args){
        int heat;

        Scanner input = new Scanner(System.in);
        System.out.println("Sıcaklık Giriniz : ");
        heat = input.nextInt();
        // Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
        // Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
        // Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
        // Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
        if(heat > 25){
            System.out.println("Yüzme yapabilirsiniz.");
        } else {
            if (heat < 5 ){
                System.out.println("Kayak yapabilirsiniz.");
            } else {
                if (heat < 15){
                    System.out.println("Sinema gidebilirsiniz.");
                } if (heat >= 10) {
                    System.out.println("Pikniğe gidebilirsiniz");
                }
            }
        }

    }
}
