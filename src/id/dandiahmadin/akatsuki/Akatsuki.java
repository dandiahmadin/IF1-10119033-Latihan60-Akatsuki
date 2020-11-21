/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.dandiahmadin.akatsuki;

/**
 *
 * @author
 * NAMA     : Dandi Ahmadin
 * KELAS    : IF-1
 * NIM      : 10119033
 * Deskripsi Program : Program ini berisi class Akatsuki yang merupakan superclass
 */
public class Akatsuki {
    protected String nama, desa;

    public Akatsuki(String nama, String desa) {
        this.nama = nama;
        this.desa = desa;
    }

    public String getNama() {
        return nama;
    }

    public String getDesa() {
        return desa;
    }
    
    public void siapaSaya() {
        System.out.println("Anggota Akatsuki");
        System.out.println("Nama : ".concat(nama));
        System.out.println("Desa : ".concat(desa));
    }
    
}
