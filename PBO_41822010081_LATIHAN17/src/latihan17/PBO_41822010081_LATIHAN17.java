package latihan17;
import java.util.Scanner;

public class PBO_41822010081_LATIHAN17 {
    public static void main(String[] args) {
        // Deklarasi
        float gaji, tunjangan, total;
        String status;
        Scanner objek = new Scanner(System.in);

        // Proses input
        System.out.println("================ Program Tunjangan ============");
        System.out.print("Berapa gaji pokok anda perbulan? : Rp. ");
        gaji = objek.nextFloat();

        // Konsumsi karakter newline yang tersisa di buffer
        objek.nextLine();

        System.out.print("Status Anda? (Menikah/Belum): ");
        status = objek.nextLine();

        // Perhitungan gaji
        tunjangan = gaji * 0.35f;
        total = gaji + tunjangan;

        // Output
        System.out.println("============== Hasil Perhitungan Gaji Anda ============");
        System.out.println("Status Anda : " + status);
        System.out.println("Gaji Pokok : Rp. " + gaji);
        System.out.println("Tunjangan : Rp. " + tunjangan);
        System.out.println("Total Gaji : Rp. " + total);
    }
}