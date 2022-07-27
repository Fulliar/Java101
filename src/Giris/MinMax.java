package Giris;
import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Kaç tane sayıyı gireceksiniz : ");
        int numberCount = input.nextInt();
        int numEntered;
        int MaxNum = 1;
        int MinNum = 1;

            while (numberCount > 0) {

                System.out.println(numberCount + ". Sayıyı giriniz: ");
                numEntered = input.nextInt();

                if (MaxNum < numEntered) {
                    MinNum = numEntered;
                } else if (MinNum > numEntered) {
                    MinNum = numEntered;
                } else {
                    MinNum = numEntered;
                    MaxNum = numEntered;
            }
                numberCount--;
        }
        System.out.println("En Büyük Sayı : " + MaxNum);
        System.out.println("En Küçük Sayı : " + MinNum);
    }
}
