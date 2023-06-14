/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package muhammad.safitri_2110010205;

/**
 *
 * @author Muhammad Haikal_
 */
public class Pengembalian {
    private int Id;
    private String namabarang;
    private int idkaryawan;
    private String tglpengembalian;
    
    public Pengembalian(int Id, String namabarang, int idkaryawan, String tglpengembalian){
        this.Id= Id;
        this.namabarang=namabarang;
        this.idkaryawan=idkaryawan;
        this.tglpengembalian=tglpengembalian;
    
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
    
    public int setIdKaryawan(){
        return idkaryawan;
    }
    
    public void getIdKaryawan(int idkaryawan){
        this.idkaryawan=idkaryawan;
    
    }
    
    public String setTglPengembalian(){
        return tglpengembalian;
    }
    
    public void getPengembalian(String tglpengembalian){
        this.tglpengembalian=tglpengembalian;
    }
    
}
