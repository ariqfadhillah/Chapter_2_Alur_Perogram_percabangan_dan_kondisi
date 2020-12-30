package com.tutorial;

public class Main {
    public static void main(String[] args) {

        //mendalami while untuk pertama kali
        int a = 0;
        boolean kondisi = true;

        System.out.println(" ini adalah awal program");
        while (kondisi){
            System.out.println("coca cola ke-" + a);
            a++;

            if(a == 1001001){
                kondisi = false;
            }
        }
        System.out.println(" ini adalah akhir program");

    }
}