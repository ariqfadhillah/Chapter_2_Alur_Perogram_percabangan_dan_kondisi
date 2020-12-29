package com.tutorial;

public class Main {
    public static void main(String[] args) {
        System.out.println("ini adalah awal program");

        System.out.println("ini loop pertama");
        for(int nilai = 0; nilai <= 10; nilai++){

            System.out.println("for look ke-" + nilai);

        }

        System.out.println("ini loop kedua");
        for(int nilai = 0; nilai < 10; nilai++){

            System.out.println("for look ke-" + nilai);

        }

        System.out.println("ini loop ketiga");
        for(int nilai = 10; nilai > 5; nilai--){

            System.out.println("for look ke-" + nilai);

        }

        System.out.println("ini loop keempat");

        int nilai = 0;

        for(; nilai < 10; ){

            System.out.println("for look ke-" + nilai);
            nilai++;

        }
        System.out.println("ini adalah akhir nya");
    }
}
