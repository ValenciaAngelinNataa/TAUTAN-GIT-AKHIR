package soal2;
import java.util.Arrays;

public class Anjing extends HewanPeliharaan {
	private String warnaBulu;
    private String[] kemampuan;

    public Anjing(String n, String r, String w, String[] k) {
        super(n, r);
        warnaBulu = w;
        kemampuan = k;
    }

    public void displayObjekAnjing() {
        System.out.println("Detail Hewan Peliharaan:");
        System.out.println("Nama hewan peliharaanku adalah : " + nama);
        System.out.println("Dengan ras : " + ras);
        System.out.println("Memiliki warna bulu : " + warnaBulu);
        System.out.println("Memiliki kemampuan : " + Arrays.toString(kemampuan).replaceAll("[\\[\\],]", " "));
        }
}