import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        //        program untuk menjumlahkan angka dengan rentanng

        int nilaiAwal, nilaiAkhir, total;

        Scanner inputUser = new Scanner(System.in);
        System.out.print("masukin nilai awal = ");
        nilaiAwal = inputUser.nextInt();
        System.out.print("masukin nilai akhir = ");
        nilaiAkhir = inputUser.nextInt();

        total = 0;

        for(;nilaiAwal <= nilaiAkhir;nilaiAwal++){
            total = total+nilaiAwal;
            System.out.println("ditambah " + nilaiAwal + " menjadi = " + total);
        }
    }
}
