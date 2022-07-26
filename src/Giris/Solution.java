package Giris;
import jdk.swing.interop.SwingInterOpUtils;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int N = scanner.nextInt();
        int Reminder = N%2;

        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();


        if(1 <= N && N <= 100){
            if(Reminder == 1){
                System.out.println("Weird");
            } else {
                if(N <= 5){

                    System.out.println("Not Weird");

                } else if (N <= 20){

                    System.out.println("Weird");

                } else{

                    System.out.println("Not Weird");

                }
            }

            //If  is odd, print Weird
            //If  is even and in the inclusive range of  to , print Not Weird
            //If  is even and in the inclusive range of  to , print Weird
            //If  is even and greater than , print Not Weird
            //1 <= N <= 100

    }
}
}
