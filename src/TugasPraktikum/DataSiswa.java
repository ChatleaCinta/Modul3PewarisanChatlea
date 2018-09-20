/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum;

/**
 *
 * @author PC
 */
public class DataSiswa extends Siswa {
     private String nama;
    //konstruktor
    public DataSiswa(String nama,String kelas, String noAbsen, int usia)
    {
        super(kelas, noAbsen, usia);
        this.nama = nama;
    }
    public void info()
    {
        System.out.println("Nama : "+this.nama);
        super.info();
    }   
}//akhir kelas employ
    
    

