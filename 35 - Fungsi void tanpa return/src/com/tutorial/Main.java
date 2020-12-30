package com.tutorial;

public class Main {
    public static void main(String[] args) {

        //void itu adalah kosong artinya

        System.out.println(simple());

        fungsiVoid("apa pun");

        selamatPagi("emak ");
        selamatPagi("bapak ");
    }

    private static void selamatPagi(String nama){
        System.out.println("selamat pagi " + nama);
    }

    // fungsi / method tanpa kembalian
    private static void fungsiVoid(String input){
        System.out.println(input);
    }

    // ini adalah fungsi / method kembalian
    // sehingga menggunakan return untuk
    // mengembalikan nilainya (08.30f)
    private static float simple(){
        return 08.30f;
    }

}
