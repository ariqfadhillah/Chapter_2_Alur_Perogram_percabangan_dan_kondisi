package com.tutorial;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] arrayAngka = { 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21};
        System.out.println(Arrays.toString(arrayAngka));

        // looping sederhana
        System.out.println("ini looping standar");
        for(int i = 0; i < 9; i++){
            System.out.println("Index ke - " + i + " adalah = " + arrayAngka[i] );
        }

        // looping dengan proper dari array
        System.out.println("ini looping dengan proper length");
        for(int i = 0; i < arrayAngka.length; i++){
            System.out.println("Index ke - " + i + " adalah = " + arrayAngka[i] );

        }

        //looping khusus untuk collection <- array
        System.out.println("looping for each");
        for( int angka : arrayAngka){
            System.out.println("Angka pada looping ini adalah  " + angka);
        }
    }
}
