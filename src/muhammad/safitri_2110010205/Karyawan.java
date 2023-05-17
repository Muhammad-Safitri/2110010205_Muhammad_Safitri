/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package muhammad.safitri_2110010205;

/**
 *
 * @author Muhammad Haikal_
 */
public class Karyawan {
    private int Id;
    private String nik;
    private String nama;
    private String divisi;
    private String notelp;
    private String alamat;
    
    public Karyawan(int Id, String nik, String nama, String divisi, String notelp, String alamat){
        this.Id= Id;
        this.nik= nik;
        this.nama= nama;
        this.divisi= divisi;
        this.notelp=notelp;
        this.alamat=alamat;
    
    }
    
    public int setId(){
        return Id;
    }
    
    public void getId(int Id){
        this.Id=Id;
    }
    
     public String setnik(){
        return nik;
    }
    
    public void getnik(String nik){
        this.nik=nik;
    }
    
    public String setnama(){
        return nama;
    }
    
    public void getnama(String nama){
        this.nama=nama;
    }
    
    public String setdivisi(){
        return divisi;
    }
    
    public void getdivisi(String divisi){
        this.divisi=divisi;
    }
    
    public String setnotelp(){
        return notelp;
    }
    
    public void getnotlp(String notelp){
        this.notelp=notelp;
    }
    
    public String setalamat(){
        return alamat;
    }
    
    public void getalamat(String alamat){
        this.alamat=alamat;
    }
    
    
}
    

