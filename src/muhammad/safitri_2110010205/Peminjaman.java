/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package muhammad.safitri_2110010205;

/**
 *
 * @author Muhammad Haikal_
 */
public class Peminjaman {
    private int Id;
    private String namabarang;
    private int idkaryawan;
    private int jmlpinjam;
    private String tgl;
    
    public Peminjaman(int Id, String namabarang, int idkaryawan, int jmlpinjam, String tgl){
        this.Id= Id;
        this.namabarang=namabarang;
        this.idkaryawan=idkaryawan;
        this.jmlpinjam=jmlpinjam;
        this.tgl=tgl;
    
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
    
    public int setJmlPinjam(int jmlpinjam){
        return jmlpinjam;
    }
    
    public void getJmlPinjam(int jmlpinjam){
        this.jmlpinjam=jmlpinjam;
    }
    
    public String setTgl(){
        return tgl;
    }
    
    public void getTgl(String tgl){
        this.tgl=tgl;
    }
    
}
