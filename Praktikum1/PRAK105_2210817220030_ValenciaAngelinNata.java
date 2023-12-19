package Praktikum1;
import java.util.Scanner;

public class PRAK105_2210817220030_ValenciaAngelinNata {
	
	public static void main(String[] args) {
		final double phi=3.14;
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Masukkan jari-jari:");
		double jariJari = input.nextDouble();
        System.out.print("Tangan Bagas : ");
        double tinggi  = input.nextDouble();
        
        double volume = phi * jariJari * jariJari * tinggi;
        String vol = String.format("%.3f", volume);

        System.out.println("Volume tabung dengan jari-jari " + jariJari + " cm dan tinggi " + tinggi + " cm adalah " + vol + " m3");
	}
}