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
public class DataPeminjaman {
    private ArrayList<Integer> Id;
    private ArrayList<String> namabarang;
    private ArrayList<Integer> idkaryawan;
    private ArrayList<Integer> jmlpinjam;
    private ArrayList<String> tgl;
    
    public DataPeminjaman(){
        Id = new ArrayList<>();
        namabarang= new ArrayList<>();
        idkaryawan= new ArrayList<>();
        jmlpinjam = new ArrayList<>();
        tgl= new ArrayList<>();
        
    }
    
    public void insertId(int isi){
        this.Id.add(isi);
    }
    
    public ArrayList<Integer> getRecordId(){
        return this.Id;
    }
        
    public void insertNamaBarang(String isi){
        this.namabarang.add(isi);
    }
    
    public ArrayList<String> getRecordNamaBarang(){
        return this.namabarang;
    
    }   
    public void insertIdKaryawan(int isi){
        this.idkaryawan.add(isi);
    }
    
    public ArrayList<Integer> getRecordIdKaryawan(){
        return this.idkaryawan;
    }
    
    public void insertJmlPinjam(int isi){
        this.jmlpinjam.add(isi);
    }
    
    public ArrayList<Integer> getRecordJmlPinjam(){
        return this.jmlpinjam;
    }
    
    public void insertTgl(String isi){
        this.tgl.add(isi);
    }
    
    public ArrayList<String> getRecordTgl(){
        return this.tgl;
    }
    
}
