package Giris;
import java.util.Scanner;
public class MukemmelSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz : ");
        int num = input.nextInt();
        int sum = 0;
        for (int i = 1 ; num>i ; i++){

            if(num % i == 0) {

                sum += i;
            }
        }
        if(sum == num){

            System.out.println(num + " Mükemmel bir sayıdır.");

        }else {
            System.out.println(num + " Mükemmel bir sayı değildir.");
        }
    }
}
