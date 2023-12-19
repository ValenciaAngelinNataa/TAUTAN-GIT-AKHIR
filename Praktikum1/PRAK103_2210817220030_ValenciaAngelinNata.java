package Praktikum1;
import java.util.Scanner;

public class PRAK103_2210817220030_ValenciaAngelinNata {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
				int N=input.nextInt();
				int angka=input.nextInt();
				int hitung=0;
				do {
					if (angka%2 !=0) {
						System.out.print(angka);
						hitung++;
						if (hitung<N) {
							System.out.print(",");
						}
					}
					angka++;
				}while (hitung<N);
					System.out.println();
				
					
	}
}