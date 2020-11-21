/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119047.latihan56.barangantik;

import data.Radio;

/**
 *
 * @author 
 * NAMA     : Aldy Putra Hanggara
 * KELAS    : PBO2
 * NIM      : 10119047
 * DESKRIPSI PROGRAM : PROGRAM INI BERISI PROGRAM MENAMPILKAN UMUR BARANG ANTIK
 */

public class PBOIF210119047Latihan56BarangAntik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Radio radio = new Radio(234);
        radio.setName("Radio AM");
        System.out.println("Nama barang antik : " + radio.getName());
        radio.tampilUmur();
    }
    
}
