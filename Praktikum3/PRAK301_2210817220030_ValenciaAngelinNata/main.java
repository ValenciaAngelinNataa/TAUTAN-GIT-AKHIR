package PRAK301_2210817220030_ValenciaAngelinNata;

import java.util.LinkedList;
import java.util.Scanner;


public class main {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int jlhDadu = input.nextInt();
		LinkedList<Dadu> objekDadu = new LinkedList<>();
		
		for (int i=1; i<=jlhDadu; i++) {
			Dadu dadu = new Dadu ();
			objekDadu.add(dadu);
			System.out.println("Dadu ke-"+ i +" bernilai "+ dadu.getNilai());
		}
		
		int sumNilai=0;
		for (Dadu dadu : objekDadu) {
			sumNilai += dadu.getNilai();
		}
		
		System.out.println("Total nilai dadu keseluruhan "+ sumNilai);
	}
}