/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo1.pkg10118007.latihan4.kambing;

/**
 *
 * @author Rama
 * Nama   : Rama Al Halik
 * Kelas  : PBO1
 * NIM    : 10118007
 * Deskripsi Program : Menjumlah data lama dengan data baru
 */
public class Kambing {
  
    public void tambahkambing() {
        //Deklarasi Variabel Lokal
        int jumlahKambing = 0;
        
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah Kambing Setelah ditambah : " +jumlahKambing);

    } 
 
    public static void main(String[] args) {
        Kambing kambingJantan = new Kambing();
        kambingJantan.tambahkambing();
    }
    
}
