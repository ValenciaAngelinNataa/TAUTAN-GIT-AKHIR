package PRAK301_2210817220030_ValenciaAngelinNata;

import java.util.Random;

class Dadu {

	private int nilai ;
	public Dadu() {
		acakNilai();
	}
	
	public void acakNilai() {
		Random random = new Random();
		nilai = random.nextInt(6)+1;
	}
	
	public int getNilai() {
		return nilai;
	}
}