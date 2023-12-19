package Praktikum2_1;

public class main {

	public static void main (String [] args) {
		buah b1 = new buah("Apel", 0.4, 7000.0, 40.0, 700000.00);
		buah buah2 = new buah("Mangga", 0.2, 3500.0, 15.0, 262500.00);
		buah buah3 = new buah("Alpukat", 0.25, 10000.0, 12.0, 480000.00);
		
		
		b1.display();
		buah2.display();
		buah3.display();
	}
}