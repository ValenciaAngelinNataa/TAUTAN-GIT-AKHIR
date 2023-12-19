package Praktikum1;
import java.util.Scanner;

public class PRAK104_2210817220030_ValenciaAngelinNata {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("Tangan Abu:");
		String tgnAbu = input.nextLine().toUpperCase();
        System.out.print("Tangan Bagas : ");
        String tgnBagas = input.nextLine().toUpperCase();

        int poinAbu = 0;
        int poinBagas = 0;
        int i = 0;
        
        while (i <= tgnAbu.length()){
        	 if (tgnAbu.charAt(i) == 'G' && tgnBagas.charAt(i) == 'B' ||
        			 tgnAbu.charAt(i) == 'K' && tgnBagas.charAt(i) == 'G' ||
                     tgnAbu.charAt(i) == 'B' && tgnBagas.charAt(i) == 'K') {
                     poinBagas++;
                 } else if (tgnAbu.charAt(i) == 'B' && tgnBagas.charAt(i) == 'G' ||
                            tgnAbu.charAt(i) == 'G' && tgnBagas.charAt(i) == 'K' ||
                            tgnAbu.charAt(i) == 'K' && tgnBagas.charAt(i) == 'B') {
                     poinAbu++;
                 }
                 i += 2;
             }
             if (poinAbu > poinBagas) {
                 System.out.println("Abu");
             } else if (poinBagas > poinAbu) {
                 System.out.println("Bagas");
             } else if (poinBagas == poinAbu) {
                 System.out.println("Seri");
             }
         }
     }