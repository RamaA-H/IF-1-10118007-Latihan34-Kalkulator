/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgif.pkg1.pkg10118007.latihan34.kalkulator;
import java.util.Scanner;
/**
 * Nama      : Rama Al Halik
 * Kelas     : IF-1
 * NIM       : 10118007
 * Deskripsi : Kalkulator
 */
public class IF110118007Latihan34Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner masuk = new Scanner(System.in);
        Kalkulator hitung = new Kalkulator();
        
        System.out.println("===Aplikasi Kalkulator Bilangan===");
        System.out.print("Masukkan Angka ke-1 : ");
        hitung.value1 = masuk.nextDouble();
        System.out.print("Masukkan Angka ke-2 : ");
        hitung.value2 = masuk.nextDouble();
        
        System.out.printf("%nHasil Pertambahan : %.1f%n",hitung.tambahBilangan());
        System.out.printf("Hasil Pengurangan : %.1f%n",hitung.kurangBilangan());
        System.out.printf("Hasil Perkalian   : %.1f%n",hitung.kaliBilangan());
        System.out.printf("Hasil Pembagian   : %.1f%n",hitung.bagiBilangan());
        System.out.printf("Hasil Sisa        : %.1f%n",hitung.sisaBilangan());
    }
    
}
