package TASYA; 

import java.util.Scanner;

public class PBO_41822010081_LATIHAN28 {
    public static void main(String[] args) {
        System.out.println("====PROGRAM MENGGANTI KATA====");
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Masukkan kalimat: ");
            String kalimat = input.nextLine();
            
            System.out.print("Ganti kata: ");
            String kataLama = input.next();
            
            System.out.print("Menjadi kata: ");
            String kataBaru = input.next();
            
            // Ganti semua kemunculan kata lama dengan kata baru dalam kalimat
            String kalimatBaru = kalimat.replace(kataLama, kataBaru);
            
            System.out.println("Kalimat baru: " + kalimatBaru);
        }
    }
}
