/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo1.pkg10118007.latihan5.kambingglobal;

/**
 *
 * @author Rama
 * Nama   : Rama Al Halik
 * Kelas  : PBO1
 * NIM    : 10118007
 * Deskripsi Program : Merubah Variabel menjadi Variabel instance
 */
public class KambingGlobal {
   //Variabel jumlahkambing menjadi variabel instance
    
    int jumlahKambing = 88;
    
    //Method untuk menampilkan jumlah kambing
    public void getJumlahKambing(){
        System.out.println("Jumlah Kambing: " + jumlahKambing);
    }
    public void tambahKambing() {
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah kambing setelah ditambah: " + jumlahKambing);
    }

public static void main(String[] args) {
    KambingGlobal kambingSusu = new KambingGlobal();

   //Menamppilkan Jumlah kambing yang ada saat progtam pertama x berjalan
    kambingSusu.getJumlahKambing();

   //Menambah satu Kambing
    kambingSusu.tambahKambing();

   //Menampilkan jumlah kambing yang ada
    kambingSusu.getJumlahKambing();


   }
}
