package com.tutorial;

import java.util.*;
import java.lang.String;

public class Main {

    public static void main(String[] args) {
        System.out.println();

        Scanner userInput = new Scanner(System.in);
        System.out.println("Masukan nilai n = ");
        int nilai = userInput.nextInt();

        int nilai_fibonacci = fibonacci(nilai, "atas");
        System.out.println("Ini adalah nilai ke -" + nilai + " Fibonacci adalah " + nilai_fibonacci);
    }

    private static int fibonacci(int n, String daun){


        System.out.println("Daun " + daun);
        System.out.println("Fibonacci ke - " + n);
        if( n == 1 || n == 0){
            return n;

        }else {

            return fibonacci(n - 1, "Kiri" ) +  fibonacci(n - 2, "Kiri" );

        }

    }
}
