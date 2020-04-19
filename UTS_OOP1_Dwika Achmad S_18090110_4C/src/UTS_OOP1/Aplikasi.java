/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS_OOP1;

import java.util.*;

/**
 *
 * @author DWIKA
 */
public class Aplikasi {
    
        public static void main(String args[]) {
        Aplikasi app = new Aplikasi();
        Scanner sc = new Scanner(System.in);
        while(true) {
            app.printMenu();
            int pilihan = sc.nextInt();
            switch(pilihan) {
                case 1:
                    System.out.println("Menambah Data Mahasiswa");
                    app.addData();
                    break;
                case 2:
                    System.out.println("Mengubah Data Mahasiswa");
                    app.ubahData();
                    break;
                case 3:
                    System.out.println("Menghapus Data Mahasiswa");
                    app.hapusData();
                    break;
                case 4:
                    System.out.println("Melihat Data Mahasiswa");
                    app.listData();
                    break;
                case 5:
                    return;
            }
        }
    }

    public void hapusData() {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.print("Menghapus Data Mahasiswa ke-"); int idx = sc.nextInt();
        //  hapus data
        Operasi.removeData(idx-1);
    }

    public void ubahData() {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.print("Mengubah Data Mahasiswa ke-"); int idx = Integer.parseInt(sc.nextLine());
        System.out.println("------------------------");
        System.out.print("Prodi: "); String prodi = sc.nextLine();
        System.out.print("NIM: "); String nim = sc.nextLine();
        System.out.print("Nama: "); String nama = sc.nextLine();
        System.out.print("Kelas: "); String kelas = sc.nextLine();
        System.out.print("Semester: "); String semester = sc.nextLine();
        //  simpan perubahan
        Operasi.editData(new Data(prodi, nim, nama, kelas, semester), idx-1);
    }

    public void listData() {
        //  tampilkan daftar data
        List<Data> result = Operasi.getListData();
        for(int i=0; i<result.size(); i++) {
            System.out.println();
            System.out.println("data ke-" + (i+1));
            System.out.println("  Prodi : " + result.get(i).getProdi());
            System.out.println("  NIM : " + result.get(i).getNim());
            System.out.println("  Nama : " + result.get(i).getNama());
            System.out.println("  Kelas : " + result.get(i).getKelas());
            System.out.println("  Semester : " + result.get(i).getSemester());
        }
    }

    public void addData() {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.print("Prodi: "); String prodi = sc.nextLine();
        System.out.print("NIM: "); String nim = sc.nextLine();
        System.out.print("Nama: "); String nama = sc.nextLine();
        System.out.print("Kelas: "); String kelas = sc.nextLine();
        System.out.print("Semester: "); String semester = sc.nextLine();
        //  simpan data
        Operasi.addData(new Data(prodi, nim, nama, kelas, semester));
    }

    public void printMenu() {
        System.out.println();
        System.out.println("---------------------------");
        System.out.println("APLIKASI PEREKAMAN DATA MAHASISWA");
        System.out.println("---------------------------");
        System.out.println("1. Tambah Data");
        System.out.println("2. Ubah Data");
        System.out.println("3. Hapus Data");
        System.out.println("4. Lihat Data");
        System.out.println("5. Keluar");
        System.out.println("---------------------------");
        System.out.println("@Dwika Achmad S(18090110)_4C");
        System.out.println("---------------------------");
        System.out.print("Pilihan : ");
    } 
}
