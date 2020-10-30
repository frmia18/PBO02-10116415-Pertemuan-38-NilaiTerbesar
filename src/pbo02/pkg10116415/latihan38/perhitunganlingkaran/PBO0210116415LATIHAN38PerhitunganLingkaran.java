/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo02.pkg10116415.latihan38.perhitunganlingkaran;

import java.util.Scanner;

/**
 *
 * @author Frda
 * NAMA: MIA AISYAH F
 * NIM: 10116415
 * Deskripsi Program: Program ini berisi program yang menampilkan data
 * Perhitungan Lingkaran
 */
public class PBO0210116415LATIHAN38PerhitunganLingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String diameter;
        double d;
        Scanner scanner  = new Scanner(System.in);
        Lingkaran clc = new Lingkaran();
        
        System.out.println("==Perhitungan Lingkaran==");
     do{
         System.out.print("Masukan nilai diameter lingkaran : ");
         diameter = scanner.nextLine();
         System.out.println((!diameter.matches("[0-9]*")) ?
                 "Nilai Diameter tidak sesuai\n":"");
         
     } while(!diameter.matches("[0-9]*"));
        System.out.println("===Hasil Perhitungan Lingkaran==");
        d = Double.parseDouble(diameter);
        
        System.out.printf("Jari-jari Lingkaran = %.0f cm %n",
                            clc.jariLingkaran(d));
        System.out.printf("Luas Lingkaran = %.2f cm %n",
                            clc.luasLingkaran(clc.jariLingkaran(d)));
        System.out.printf("Keliling Lingkaran = %.2f cm %n",
                            clc.kelilingLingkaran(clc.jariLingkaran(d)));
    }
    
}
