/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ALIFAH
 */
public class Barang {
    String kode_barang;
    String nama_barang;
    
    private int stok;
    
    public int getStok(){
        return stok;
    }
    
    public void tambah (int jml){
        this.stok = jml + stok;
    }
    
public Barang(String kode, String nama, int stk) {
    kode_barang = kode;
    nama_barang = nama;
    stok = stk;
    }
}
