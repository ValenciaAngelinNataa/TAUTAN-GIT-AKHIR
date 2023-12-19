package Praktikum0;
import java.util.Scanner;

public class PRAK005_2210817220030_ValenciaAngelinNata {
	public static void main (String[] args) {
		Scanner InputUser = new Scanner (System.in);
		
		System.out.print("Masukan Makanan Favorit: ");
		String makanan=InputUser.next();
		System.out.print("Masukan Hobi: ");
		String hobi=InputUser.next();
		System.out.println("Aku Suka Makan "+makanan+", dan Hobiku "+hobi);
		InputUser.close();
	}	
}
