package TASYA;
import java.util.Scanner;

public class PBO_41822010081_LATIHAN21 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Masukkan banyaknya mahasiswa : ");
        int mhs=input.nextInt();
        int[]nilai=new int[mhs];
        int total=0;
        for(int i=0;i<mhs;i++){
            System.out.print("Nilai mahasiswa ke - "+(i+1)+" : ");
            nilai[i]=input.nextInt();
            total+=nilai[i];
        }
        double rataRata=(double)total/mhs;
        System.out.println("maka, rata rata nilainya adalah : "+rataRata);
    }
}
