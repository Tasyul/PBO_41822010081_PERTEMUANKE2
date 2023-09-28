package TASYA;

public class PBO_41822010081_LATIHAN19 {
    public static void main(String[] args) {
        int saldo = 2500000;
        double bunga = 0.15;
        
        System.out.println("================ Program Perhitungan Saldo ===============");
        
        for (int n = 1; n <= 6; n++) {
            double saldo_akhir = saldo * Math.pow(bunga + 1, n);
            String formatSaldo = "RP." + formatCurrency((int) saldo_akhir);
            System.out.println("Saldo di bulan ke-" + n + " " + formatSaldo);
        }
    }

    public static String formatCurrency(int amount) {
        return String.format("%,d", amount).replace(",", ".");
    }
}
