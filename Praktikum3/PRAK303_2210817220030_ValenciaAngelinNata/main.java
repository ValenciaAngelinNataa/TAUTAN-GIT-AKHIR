package PRAK303_2210817220030_ValenciaAngelinNata;

import java.util.ArrayList;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		ArrayList<Mahasiswa> objekMahasiswa = new ArrayList<>();
		
		while (true) {
            System.out.println("Menu:");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Hapus Mahasiswa berdasarkan NIM");
            System.out.println("3. Cari Mahasiswa berdasarkan NIM");
            System.out.println("4. Tampilkan Data Mahasiswa");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            int pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                	System.out.print("Masukkan Nama Mahasiswa: ");
                    String nama = input.nextLine();
                    System.out.print("Masukkan NIM Mahasiswa (harus unik): ");
                    String nim = input.next();
                    
                    boolean unik = true;
                    for (Mahasiswa mhs : objekMahasiswa) {
                        if (mhs.getNim().equals(nim)) {
                            unik = false;
                            System.out.println("NIM sudah terdaftar. Mohon masukkan NIM yang berbeda.");
                            break;
                        }
                    }
                    
                    if (unik) {
                        Mahasiswa mahasiswa = new Mahasiswa(nama, nim);
                        objekMahasiswa.add(mahasiswa);
                        System.out.println("Mahasiswa "+ nama +" ditambahkan.");
                    }
                    break;
                    
                case 2:
                    System.out.print("Masukkan NIM Mahasiswa yang akan dihapus: ");
                    String deleted = input.next();
                    boolean ditemukan = false;
                    for (Mahasiswa mhs : objekMahasiswa) {
                        if (mhs.getNim().equals(deleted)) {
                            objekMahasiswa.remove(mhs);
                            ditemukan = true;
                            System.out.println("Mahasiswa dengan NIM " + deleted + " dihapus.");
                            break;
                        }
                    }
                    if (!ditemukan) {
                        System.out.println("Mahasiswa dengan NIM " + deleted + " tidak ditemukan.");
                    }
                    break;
                    
                case 3:
                    System.out.print("Masukkan NIM Mahasiswa yang akan dicari: ");
                    String cari = input.next();
                    for (Mahasiswa mhs : objekMahasiswa) {
                        if (mhs.getNim().equals(cari)) {
                            System.out.println("Data Mahasiswa:");
                            System.out.println("Nama: " + mhs.getNama());
                            System.out.println("NIM: " + mhs.getNim());
                            break;
                        }
                    }
                    System.out.println("Mahasiswa dengan NIM " + cari + " tidak ditemukan.");
                    break;
                    
                case 4:
                    System.out.println("Daftar Mahasiswa:");
                    for (Mahasiswa mhs : objekMahasiswa) {
                        System.out.println("NIM: " + mhs.getNim() +", Nama: " + mhs.getNama());
                    }
                    break;
                    
                case 0:
                    System.out.println("Terima kasih!");
                    objekMahasiswa.clear();
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih menu yang tersedia.");
            }
        }
	}
}
