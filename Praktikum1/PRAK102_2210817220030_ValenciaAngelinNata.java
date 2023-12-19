package Praktikum1;
import java.util.Scanner;

public class PRAK102_2210817220030_ValenciaAngelinNata {

	public static void main (String[]args) {
		Scanner input=new Scanner(System.in);
		int angka=input.nextInt();
		
		int hitung=0;
		while(hitung <= 10) {
			if (angka%5== 0) {
				System.out.print(angka/5-1);
			} else {
				System.out.print(angka);
			}
			if(hitung<10) {
				System.out.print(",");
			}
			angka++;
			hitung++;
		}
		System.out.println();
	}
}
