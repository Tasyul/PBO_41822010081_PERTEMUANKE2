package TASYA;
import java.util.Scanner;

public class PBO_41822010081_LATIHAN22 {
    public static boolean cekInput(String diameter){
        try{
            Double.parseDouble(diameter);
            return true;
        }catch(NumberFormatException e){
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean Cekinputan = false;
        
        while (!Cekinputan) {
            System.out.print("Masukkan nilai diameter lingkaran : ");
            String diameter = input.nextLine();

            if (cekInput(diameter)) {
                double jariJari = Double.parseDouble(diameter) / 2;
                double luas = Math.PI * Math.pow(jariJari, 2);
                double keliling = 2 * Math.PI * jariJari;
                
                String formatJariJari = String.format("%.2f", jariJari);
                String formatLuas = String.format("%.2f", luas);
                String formatKeliling = String.format("%.2f", keliling);
                
                System.out.println("Jari Jari Lingkaran : " + formatJariJari + " cm");
                System.out.println("Luas Lingkaran : " + formatLuas + " cm");
                System.out.println("Keliling Lingkaran : " + formatKeliling + " cm");
                
                Cekinputan = true; 
            } else {
                System.out.println("Nilai Diameter Tidak Sesuai");
            }
        }
    }
}