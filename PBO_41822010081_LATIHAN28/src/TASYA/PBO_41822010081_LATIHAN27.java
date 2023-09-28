package TASYA;          

import java.util.Scanner;
public class PBO_41822010081_LATIHAN27 {
    public static String hurufBesar(String kalimat){
        return kalimat.toUpperCase();
    }
    public static String hurufKecil(String kalimat){
        return kalimat.toLowerCase();
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("======= Program Perbandingan Nilai ======");
        System.out.print("Masukkan Kalimat : ");
        String kalimat=input.nextLine();
        String besar=hurufBesar(kalimat);
        String kecil=hurufKecil(kalimat);
        System.out.println("Huruf Besarr : "+besar);
        System.out.println("Huruf Besarr : "+kecil);
    }
}