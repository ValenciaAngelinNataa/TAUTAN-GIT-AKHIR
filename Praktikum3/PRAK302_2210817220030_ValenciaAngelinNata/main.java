package PRAK302_2210817220030_ValenciaAngelinNata;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;


public class main {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int jlhNegara = input.nextInt();
		input.nextLine();
		
		LinkedList<Negara> objekNegara = new LinkedList<>();
		HashMap<Integer, String> namaBulan = new HashMap<>();
		namaBulan.put(1, "Januari");
		namaBulan.put(2, "Februari");
		namaBulan.put(3, "Maret");
		namaBulan.put(4, "April");
		namaBulan.put(5, "Mei");
		namaBulan.put(6, "Juni");
		namaBulan.put(7, "Juli");
		namaBulan.put(8, "Agustus");
		namaBulan.put(9, "September");
		namaBulan.put(10, "Oktober");
		namaBulan.put(11, "November");
		namaBulan.put(12, "Desember");
		
		
		
		for (int i = 0; i<jlhNegara; i++) {
			String negara = input.nextLine();
			String jenisPemimpin = input.nextLine();
			String namaPemimpin = input.nextLine();
			
			int tglMerdeka = 0;
			int bulanMerdeka = 0;
			int thnMerdeka = 0;
			
			if (!jenisPemimpin.equals("monarki")) {
				tglMerdeka = input.nextInt();
				bulanMerdeka = input.nextInt();
				thnMerdeka = input.nextInt();
				input.nextLine();
			}
			
			Negara atrNegara = new Negara(negara, jenisPemimpin, namaPemimpin, tglMerdeka, bulanMerdeka, thnMerdeka);
			objekNegara.add(atrNegara);
		}
		for (Negara atrNegara : objekNegara) {
			System.out.println("Negara "+ atrNegara.getNegara()+" mempunyai "+
							(atrNegara.getJenisPemimpin().equals("monarki")? "Raja":
							(atrNegara.getJenisPemimpin().equals("presiden")? "Presiden" : "Perdana Menteri"))
							+ " bernama " +atrNegara.getNamaPemimpin());
			if (!atrNegara.getJenisPemimpin().equals("monarki")) {
				System.out.println("Deklarasi Kemerdekaan pada Tanggal "+ atrNegara.getTglMerdeka()+ " "+namaBulan.get(atrNegara.getBulanMerdeka())+ " "+atrNegara.getThnMerdeka());
			}
			System.out.println();	
		}
	}
}
