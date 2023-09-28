package TASYA;
import java.util.Scanner;

public class PBO_41822010081_LATIHAN23 {
    public static void main(String[] args) {
        System.out.println("======= Program Nilai Terbesar dan Terkecil Nilai Mahasiswa ========");
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nama Petugas : ");
        String petugas = input.nextLine();
        System.out.print("Masukkan Jumlah nilai : ");
        int mhs = input.nextInt();
        int[] nilai = new int[mhs];
        int terbesar = nilai[0];
        int terkecil = nilai[0];
        int n;
        for (n = 0; n < mhs; n++) {
            System.out.print("Nilai Mahasiswa ke - " + (n + 1) + " : ");
            nilai[n] = input.nextInt();
            if (nilai[n] > terbesar) {
                terbesar = nilai[n];
            }
            if (nilai[n] < terkecil) {
                terkecil = nilai[n];
            }
        }
        System.out.println(" ");
        System.out.println("===== Daftar Nilai Mahasiswa =====");
        for (n = 0; n < mhs; n++) {
            System.out.println("Nilai Mahasiswa ke - " + (n + 1) + " : " + nilai[n]);
        }
        System.out.println("nilai terbesarnya adalah : " + terbesar);
        System.out.println("Nilai terkecilnya adalah : " + terkecil);
        System.out.println("Petugas : " + petugas);
    }
}
