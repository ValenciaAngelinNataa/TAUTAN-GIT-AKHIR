package soal2;

public class Kucing extends HewanPeliharaan {

	private String warnaBulu;
	
	public Kucing(String n, String r, String w) {
		super(n,r);
		warnaBulu = w;
	}
	@Override
	public void displayObjekKucing() {
		super.display();
		System.out.println("Memiliki warna bulu : "+ warnaBulu);
	}
}