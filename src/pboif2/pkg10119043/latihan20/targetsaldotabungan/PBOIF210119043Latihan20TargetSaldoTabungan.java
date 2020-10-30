/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119043.latihan20.targetsaldotabungan;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;
/**
 *
 * @author 
 * NAMA      : FERMI NAUFAL AKBAR
 * NIM       : 10119043
 * KELAS     : IF2
 * DESKRIPSI : Program target saldo tabungan nasabah
 */
public class PBOIF210119043Latihan20TargetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    
    public static double saldoAwal() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("====Program Target Tabungan====");
        System.out.print("Masukan Saldo Anda : ");
        double saldoAwal = scanner.nextDouble();
        return saldoAwal;
    }
    
    public static double targetTabungan() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Target Tabungan : ");
        double lama = scanner.nextDouble();
        return lama;
    }
    
    public static double bungaTabungan() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bunga Tabungan (%): ");
        double bunga = scanner.nextDouble();
        return bunga;
    }
    
    public static void hasilTabungan(double saldoAwal, double bunga, double target) {
        DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');

        kursIndonesia.setDecimalFormatSymbols(formatRp);
        
        bunga = bunga/100;
        double saldoAkhir;
        int i = 1;
        do{
            saldoAkhir = saldoAwal;
            double bungaSaldo = saldoAkhir * bunga;
            saldoAwal = bungaSaldo + saldoAkhir;
            System.out.printf("Saldo di bulan ke-"+i+" Rp. %s %n", kursIndonesia.format(saldoAwal));
            i++;
            saldoAwal++;
        } while(saldoAwal < target);
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println("Developed by : Fermi Naufal Akbar");
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        hasilTabungan(saldoAwal(), bungaTabungan(), targetTabungan());
    }
    
}
