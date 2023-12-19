package soal1;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.print("Nama Hewan Peliharaan: ");
		String nama = input.nextLine();
		System.out.print("Ras: ");
		String ras = input.nextLine();
		
		HewanPeliharaan ObjekHewan = new HewanPeliharaan (ras,nama);
		ObjekHewan.display();
	}
}