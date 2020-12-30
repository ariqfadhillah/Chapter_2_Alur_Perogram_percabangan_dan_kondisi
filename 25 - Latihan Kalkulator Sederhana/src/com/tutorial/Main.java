package com.tutorial;

import java.util.Scanner;

public class Main {
//    membuat kalkulator sederhana sendiri
    public static void main(String[] args){

        float a,b,hasil;
        char operator;
        Scanner inputUser;

        inputUser = new Scanner(System.in);

        System.out.print("nilai a = ");
        a = inputUser.nextFloat();
        System.out.print("nilai operator = ");
        operator = inputUser.next().charAt(0);
        System.out.print("nilai b = ");
        b = inputUser.nextFloat();

        System.out.println("input user: " + a + " " + operator + " " + b);

        if (operator == '+'){
            hasil = a + b;
            System.out.println("Hasilnya adalah " + hasil);
        }else if (operator == '-'){
            hasil = a - b;
            System.out.println("Hasilnya adalah " + hasil);
        }else if (operator == '*'){
            hasil = a * b;
            System.out.println("Hasilnya adalah " + hasil);
        }else if (operator == '/'){
            if (a == 0 || b == 0){
                System.out.println(" Cannot divide by zero ");
            }else{
                hasil = a / b;
                System.out.println("Hasilnya adalah " + hasil);
            }
        }else {
            System.out.println("Hasilnya tak ada");
        }
    }
}
