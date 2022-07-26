package Giris;
import java.util.Scanner;
public class DordeVeBeseBolen {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your number : ");
        int n = in.nextInt();
        System.out.println("Multiples of 4 : ");

        for(int i=1; i <= n ; i++ ){

            if(i%4== 0){
                System.out.println( i);
            }
        }
        System.out.println("***********************************");
        System.out.println("Multiples of 5 : ");
        for(int i=1; i <= n ; i++ ){
            if(i%5 == 0){
                System.out.println(i);
            }
        }

    }
}
