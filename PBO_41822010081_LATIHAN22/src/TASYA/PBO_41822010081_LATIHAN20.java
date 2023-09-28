package TASYA;


public class PBO_41822010081_LATIHAN20 {
    public static void main(String[] args){
        double saldo=3500000;
        double saldo_target=6000000;
        double bunga=0.08;
        int n=0;
        
        while(saldo<saldo_target){
            saldo+=saldo*bunga;
            n++;
            String formatSaldo = "RP." + formatCurrency((int) saldo);
            System.out.println("Saldo di bulan ke - " + n + " " + formatSaldo);
        }
   
}
public static String formatCurrency(int amount) {
        return String.format("%,d", amount).replace(",", ".");
    }
}