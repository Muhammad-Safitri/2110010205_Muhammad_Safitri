/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package muhammad.safitri_2110010205;

/**
 *
 * @author Muhammad Haikal_
 */
public class Alat_Kerja {
    
    private int Id;
    private String namabarang;
    private int jmlbarang;
    
    public Alat_Kerja(int Id, String namabarang, int jmlbarang){
        this.Id= Id;
        this.namabarang=namabarang;
        this.jmlbarang=jmlbarang;
    
    }
    
    public int setId(){
        return Id;
    }
    
    public void getId(int Id){
        this.Id=Id;
    }
    
    public String setNamaBarang(){
        return namabarang;
    }
    
    public void getNamaBarang(String namabarang){
        this.namabarang=namabarang;
    }
    
    public int setJmlBarang(){
        return jmlbarang;
    }
    
    public void getJmlBarang(int jmlbarang){
        this.jmlbarang=jmlbarang;
    }
    
}
