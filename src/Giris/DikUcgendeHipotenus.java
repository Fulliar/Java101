package Giris;
import java.util.Scanner;

public class DikUcgendeHipotenus {
    public static void main(String[] args){

        Scanner inp = new Scanner(System.in);

        System.out.println("a kenarının uzunluğunu giriniz...");
        double a = inp.nextDouble();

        System.out.println("b kenarının uzunluğunu giriniz...");
        double b = inp.nextDouble();
        double c = Math.sqrt((a*a) + (b*b));

        System.out.println("Üçgenin çevresi " + (a+b+c));
        System.out.println("Üçgenin alanı " + ((a*b)/2));
        double u = (a+b+c)/2;
        double alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("u = " + u + "alan " + alan);

    }
}
