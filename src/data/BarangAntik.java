/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package data;

/**
 *
 * @author 
 * NAMA     : Aldy Putra Hanggara
 * KELAS    : PBO2
 * NIM      : 10119047
 * DESKRIPSI PROGRAM : PROGRAM INI BERISI PROGRAM MENAMPILKAN UMUR BARANG ANTIK
 */

public class BarangAntik {
    
    int umur;
    
    public BarangAntik(int umur){
        this.umur=umur;
    }
    
    public void tampilUmur(){
        System.out.println("Umur barang antik ini adalah : " + umur + " tahun");
    }
}
