/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo1.pkg10118007.latihan3.input;

import java.util.Scanner;

/**
 *
 * @author Rama
 * Nama   : Rama Al Halik
 * Kelas  : PBO1
 * NIM    : 10118007
 * Deskripsi Program : Memasukkan inputan dan menampilkan hasil inputan
 */
public class LatihanPBO1Input {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Masukkan nama anda: ");
        Scanner scanner= new Scanner(System.in);
        
        String nama = scanner.next();
        System.out.println("Nama anda adalah " +nama);
    }
    
}
