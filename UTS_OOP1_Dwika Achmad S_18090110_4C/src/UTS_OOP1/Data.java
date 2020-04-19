/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS_OOP1;

/**
 *
 * @author dwika
 */
public class Data {

    private String prodi;
    private String nim;
    private String nama;
    private String kelas;
    private String semester;

    public Data() {
        prodi = "";
        nim = "";
        nama = "";
        kelas = "";
        semester = "";
    }

    public Data(String prodi, String nim, String nama, String kelas, String semester) {
        this.prodi = prodi;
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.semester = semester;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }
    
    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getProdi() { return prodi; }

    public String getNim() { return nim; }

    public String getNama() { return nama; }

    public String getKelas() { return kelas; }
    
    public String getSemester() { return semester; }
    
}
