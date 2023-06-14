/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package muhammad.safitri_2110010205;

/**
 *
 * @author Muhammad Haikal_
 */
public class Perbaikan{
        
    private int Id;
    private String namabarang;
    private String ketperbaikan;
    
    public Perbaikan(int Id, String namabarang, String ketperbaikan){
        this.Id= Id;
        this.namabarang=namabarang;
        this.ketperbaikan=ketperbaikan;
    
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
    
    public String setKetPerbaikan(){
        return ketperbaikan;
    }
    
    public void getKetPerbaikan(String ketperbaikan){
        this.ketperbaikan=ketperbaikan;
    }
    
}
