package Praktikum1;
import java.util.Scanner;

public class PRAK101_2210817220030_ValenciaAngelinNata {

	public static void main (String [] args) {
		Scanner Input = new Scanner (System.in);
		
		System.out.print("Masukkan Nama Lengkap:");
		String nama = Input.nextLine();
		
		System.out.print("Masukkan Tempat Lahir:");
		String tempatLahir = Input.nextLine();
		
		System.out.print("Masukkan Tanggal Lahir:");
		int tglLahir = Input.nextInt();
		
		System.out.print("Masukkan Bulan Lahir:");
		int bulanLahir = Input.nextInt();
		
		System.out.print("Masukkan Tahun Lahir:");
		int tahunLahir = Input.nextInt();
		
		System.out.print("Masukkan Tinggi Badan:");
		int TB = Input.nextInt();
		
		System.out.print("Masukkan Berat Badan:");
		double BB = Input.nextDouble();
		
		String bulan = getBulan(bulanLahir);
		
		System.out.println("Nama Lengkap " + nama + ", Lahir di " + tempatLahir + " pada Tanggal " + tglLahir + " " + bulan + " " + tahunLahir);
        System.out.print("Tinggi Badan " + TB + " cm dan Berat Badan " + BB + " kilogram");
    }
    public static String getBulan(int bulan) {
        String[] namaBulan = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember"};
        return namaBulan[bulan - 1];
	}
}
