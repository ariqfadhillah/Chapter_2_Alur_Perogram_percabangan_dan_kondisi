package com.tutorial;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //kita akan menghitung deret fibonacci ke - n
        //fibonacci adalah perulangan yang berjalan kepada angka sesebelumnya

        int n,f_n,f_n_1,f_n_2;

        Scanner inputUser = new Scanner(System.in);
        System.out.print("Mengambil nilai ke - ");
        n = inputUser.nextInt();

        f_n_2 = 0;
        f_n_1 = 1;
        f_n = 1;


        for(int i = 1; i <= n; i++){
            System.out.println(" nilai ke - "+ i + " ini adalah " + f_n);
            f_n = f_n_1 + f_n_2;
            f_n_2 = f_n_1;
            f_n_1 = f_n;


        }

    }
}
