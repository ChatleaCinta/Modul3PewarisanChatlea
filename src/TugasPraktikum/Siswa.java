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
public class Siswa {
     private String kelas;
    private String noAbsen;
    private int usia;
    
    //konstruktor
    public Siswa(String kelas,String noAbsen, int usia){
        this.kelas = kelas;
        this.noAbsen = noAbsen;
        this.usia = usia;
    }
    //metode
    public void info(){
        System.out.println("Kelas : "+this.kelas);
        System.out.println("No.Absen : "+this.noAbsen);
        System.out.println("Usia : "+this.usia);
    }
}
