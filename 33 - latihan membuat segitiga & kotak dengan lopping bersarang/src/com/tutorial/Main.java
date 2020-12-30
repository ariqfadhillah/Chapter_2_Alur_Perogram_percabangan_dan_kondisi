package com.tutorial;

public class Main {

    public static void main(String[] args) {

        // looping bersarang
        // yaitu pelajaran for didalam for

        for(int a = 0; a < 5; a++){

            for (int b = 0; b < 5; b++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }

        System.out.print("\n");

        for(int a = 0; a < 5; a++){

            for (int b = 0; b < 5; b++) {
                System.out.print("* ");
                if ( a == b ){
                    break;
                }
            }
            System.out.print("\n");
        }

        System.out.print("\n");

        for(int a = 0; a < 5; a++){

            for (int b = 0; b < 5; b++) {
                System.out.print("* ");
                if ( (a + b) == 4 ){
                    break;
                }
            }
            System.out.print("\n");
        }

        System.out.print("\n");

        for(int a = 0; a < 9; a++){

            for (int b = 0; b < 9; b++) {
                System.out.print("* ");
                if ( a == b ){
                    break;
                }else if( (a + b) == 8 ){
                    break;
                }

            }
            System.out.print("\n");
        }

        //membuat belah ketupat
        System.out.print("\n");
        int lebar_belah_ketupat = 5;

        for(int a = 1; a <= lebar_belah_ketupat; a++){

            for (int b = 1; b <= lebar_belah_ketupat - a; b++) {
                System.out.print(" ");
            }

            for (int c = 1; c <= a; c++){
                System.out.print(" *");
            }

            System.out.print("\n");
        }
        for(int a = 1; a < lebar_belah_ketupat; a++){

            for (int b = 1; b <= a; b++) {
                System.out.print(" ");
            }

            for (int c = 1; c <= lebar_belah_ketupat - a; c++){
                System.out.print(" *");
            }

            System.out.print("\n");
        }


    }

}