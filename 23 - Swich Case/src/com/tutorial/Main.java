package com.tutorial;

import java.util.Scanner;

public class Main {
    // switch case ini biasanya dipakai untuk dipakai untuk menu
    //punya nilai satu dan bercabang byk
    //ini lebih flexibel dari if yang sebelumnya
    public static void main(String[] args) {
        // ekpresinya berupa satuan(int, long, byte, short), String, atau enum

        String input;
        Scanner inputUser = new Scanner(System.in);
        input = inputUser.next();

        System.out.print("panggil nama: ");
        System.out.println(input);

        switch (input) {
            case "otong":
                System.out.println("Saya Otong hadir!");
                break;
            case "asuka_saito":
                System.out.println("Saya Asuka hadir!");
                break;
            default:
                System.out.println(input + " Tidak hadir!");
        }
    }
}
