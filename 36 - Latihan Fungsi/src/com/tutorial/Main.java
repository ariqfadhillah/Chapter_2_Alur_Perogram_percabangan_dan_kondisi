package com.tutorial;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.print("Panjang = ");
        int inputPanjang = userInput.nextInt();
        System.out.print("Lebar = ");
        int inputLebar = userInput.nextInt();

        gambar(inputPanjang,inputLebar);

        luasdankeliling(inputPanjang, inputLebar);

    }

    private static void luasdankeliling(int panjang, int lebar){
        System.out.println(" Maka luas = " + luas(panjang, lebar));
        System.out.println(" Keliling = " + keliling(panjang, lebar));
    }
    private static int keliling(int panjang, int lebar){
        int hasil = (panjang + lebar) * 2;
        return hasil;
    }
    private static int luas(int panjang, int lebar){
        int hasil = panjang * lebar;
        return hasil;
    }

    private static void gambar(int panjang, int lebar){
        for (int i = 0; i < lebar; i++ ){
            for (int p = 1; p < panjang; p++){
                System.out.print(" *");
            }
            System.out.print("\n");
        }
    }
}
