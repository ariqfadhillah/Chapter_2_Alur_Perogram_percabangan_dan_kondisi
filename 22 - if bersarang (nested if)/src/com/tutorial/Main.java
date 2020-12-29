package com.tutorial;

public class Main {
    public static void main(String[] args){

        // nested if atau if bersarang

        int a = 5;
        int b = 10;

        System.out.println(" ini adalah awal program");

        if (a == 5){

            if (b == 10){

                System.out.println(" a = 5 dan b = 10");;

            } else {

                System.out.println(" default; a = 5, tapi b bukan 10");;

            }

        } else {

            System.out.println(" a != 5");;
        }

        System.out.println(" Ini adalah akhir");

    }
}
