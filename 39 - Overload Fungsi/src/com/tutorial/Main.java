package com.tutorial;

public class Main {
    public static void main(String[] args) {

        int hasilInteger;
        hasilInteger = tambah(2 ,3);
        printAngka(hasilInteger);

        Float hasilFloat;

        hasilFloat = tambah(1.3f, 4);
        printAngka(hasilFloat);

        hasilFloat = tambah(4, 2f);
        printAngka(hasilFloat);

        hasilInteger = tambah(4,3,2);
        printAngka(hasilInteger);

        printAngka(10);
        printAngka(10.5f);
        printAngka(10.7d);
    }

    private static int tambah(int angkaInt1, int angkaInt2, int angkaInt3){
        return angkaInt1 + angkaInt2 + angkaInt3;
    }
    private static float tambah(int angkaInt2, float angkaFloat1){
        return angkaFloat1 + angkaInt2;
    }
    private static float tambah(float angkaFloat1, int angkaInt2){
        return angkaFloat1 + angkaInt2;
    }
    private static int tambah(int angkaInt1, int angkaInt2){
        return angkaInt1 + angkaInt2;
    }

    private static void printAngka (Double angkaDouble){
        System.out.println("Angka ini adalah double dengan nilai = " + angkaDouble);
    }
    private static void printAngka (Float angkaFloat){
        System.out.println("Angka ini adalah float dengan nilai = " + angkaFloat);
    }
    private static void printAngka (int angkaInteger){
        System.out.println("Angka ini adalah integer dengan nilai = " + angkaInteger);
    }
}
