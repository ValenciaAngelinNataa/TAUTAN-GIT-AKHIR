package Praktikum2_1;

public class buah {

	String nama;
	double berat;
	double harga;
	double jlhBeli;
	double b4Disc;
	double disc;
	double afterDisc;
	
	buah (String nama, double berat, double harga, double jlhBeli, double b4Disc) {
		this.nama = nama;
		this.berat = berat;
		this.harga = harga;
		this.jlhBeli = jlhBeli;
		this.b4Disc = b4Disc;
	}
	
	public void discCalculate() {
		disc = (Math.floor(jlhBeli/4) *0.02 *harga *4);
		afterDisc = b4Disc - disc;
		System.out.printf("Total diskon: Rp %.2f\n", disc);
		System.out.printf("Harga setelah diskon: Rp%.2f\n", afterDisc);
	}
	
	public void display() {
		System.out.println("Nama Buah: " + this.nama);
		System.out.println("Berat: " + this.berat);
		System.out.println("Harga: " + this.harga);
		System.out.println("Jumlah Beli: " + this.jlhBeli + "kg");
		System.out.println("Harga Sebelum Diskon: Rp " + this.b4Disc);
		discCalculate();
		System.out.println();
	}
}
