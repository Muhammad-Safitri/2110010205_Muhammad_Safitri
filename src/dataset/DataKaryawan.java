/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataset;
import java.util.ArrayList;

/**
 *
 * @author hakase
 */
public class DataKaryawan {
    private ArrayList<Integer> Id;
    private ArrayList<String> nik;
    private ArrayList<String> nama;
    private ArrayList<String> divisi;
    private ArrayList<String> notelp;
    private ArrayList<String> alamat;
    
    public DataKaryawan(){
        Id = new ArrayList<>();
        nik = new ArrayList<>();
        nama = new ArrayList<>();
        divisi = new ArrayList<>();
        notelp = new ArrayList<>();
        alamat = new ArrayList<>();
        
    }
    
    public void insertId(int isi){
        this.Id.add(isi);
    }
    
    public ArrayList<Integer> getRecordId(){
        return this.Id;
    }
    
    public void insertNik(String isi){
        this.nik.add(isi);
    }
    
    public ArrayList<String> getRecordNik(){
        return this.nik;
    }
    
    public void insertNama(String isi){
        this.nama.add(isi);
    }
    
    public ArrayList<String> getRecordNama(){
        return this.nama;
    }
    
    public void insertDivisi(String isi) {
        this.divisi.add(isi);
    }

    public ArrayList<String> getRecordDiivsi() {
        return this.divisi;
    }
    
    public void insertNotelp(String isi){
        this.notelp.add(isi);
    }
    
    public ArrayList<String> getRecordNotelp(){
        return this.notelp;
    }
    
    public void insertAlamat(String isi){
        this.alamat.add(isi);
    }
    
    public ArrayList<String> getRecordAlamat(){
        return this.alamat;
    }
    
    
}
