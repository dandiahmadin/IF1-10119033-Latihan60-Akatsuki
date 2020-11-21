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
 * Deskripsi Program : Program ini berisi class AnggotaAkatsuki yang merupakan subclass dari 
 * class Akatsuki (superclass)
 */
public class AnggotaAkatsuki extends Akatsuki {
    private String cincin;
    
    public AnggotaAkatsuki(String nama, String desa, String cincin) {
        super(nama, desa);
        this.cincin = cincin;
    }

    public String getCincin() {
        return cincin;
    }
    
    @Override
    public void siapaSaya() {
        super.siapaSaya();
        System.out.println("Cincin : ".concat(cincin).concat("\n"));
    }
    
}
