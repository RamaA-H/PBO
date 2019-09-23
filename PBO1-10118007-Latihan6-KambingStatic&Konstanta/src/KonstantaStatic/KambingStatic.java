/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KonstantaStatic;

/**
 *
 * @author Rama
 * Nama   : Rama Al Halik
 * Kelas  : PBO1
 * NIM    : 10118007
 * Deskripsi Program : Menampilkan  variabel statik 
 */
public class KambingStatic {
    
  //NAMA_KAMBING sebagai Konstanta
    public static final String NAMA_KAMBING = "MIDUN ";
    
    public static void main (String[] args){
          Mamalia.jumlahKambing = 485000;
          System.out.println(NAMA_KAMBING + "memiliki kambing sebanyak " + Mamalia.jumlahKambing);
    }
}

