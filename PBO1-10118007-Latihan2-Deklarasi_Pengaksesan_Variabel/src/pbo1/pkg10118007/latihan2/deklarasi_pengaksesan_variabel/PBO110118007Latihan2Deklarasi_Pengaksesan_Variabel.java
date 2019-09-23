/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo1.pkg10118007.latihan2.deklarasi_pengaksesan_variabel;

/**
 *
 * @author Rama
 * Nama   : Rama Al Halik
 * Kelas  : PBO1
 * NIM    : 10118007
 * Deskripsi Program :Program ini Pendeklarasian variabel yang ingin di tampilkan
 */
public class PBO110118007Latihan2Deklarasi_Pengaksesan_Variabel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Deklarasi Variabel
        int nilaiInt;
        final double PHI= 3.14; //Konstanta Uppercase
        boolean nilaiLogika;
        char nilaiKarakter;
        
        //Memberi nilai ke variabel
        nilaiInt = 78;
        nilaiLogika = false;
        nilaiKarakter ='D';
        
        //Menampilkan Hasil
        System.out.println();
        System.out.println("Isi variabel nilai = " + nilaiInt);
        System.out.println("Isi variabel PHI = " + PHI);
        System.out.println("Isi variabel logika = " + nilaiLogika);
        System.out.println("Isi variabel karakter = " + nilaiKarakter);
    }
    
}
