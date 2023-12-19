package soal2;

public class HewanPeliharaan {

	protected String nama;
	protected String ras;
	
	public HewanPeliharaan(String n, String r) {
		nama = n;
		ras = r;
	}
	public void display() {
		System.out.println("Detail Hewan Peliharaan:");
	    System.out.println("Nama hewan peliharaanku adalah : " + nama);
	    System.out.println("Dengan ras : " + ras);
	 	}
	public void displayObjekKucing() {
	 	}
	public void displayObjekAnjing() {
	}
}