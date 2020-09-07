package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class Oblig1oppg1 {

	public static void main(String[] args) {
	
		int bruttoinntekt = Integer.parseInt(showInputDialog("Skriv inn bruttoinntekt:"));
		
		if (bruttoinntekt > 0 && bruttoinntekt < 180800) {
			showMessageDialog(null, "Trinnskatt 0%:  " + bruttoinntekt);
		} else if (bruttoinntekt > 180800 && bruttoinntekt <= 254500) {
			showMessageDialog(null, "Trinnskatt 1.9%:  kr" + bruttoinntekt * 0.019);
		} else if (bruttoinntekt > 254500 && bruttoinntekt <= 639750) {
			showMessageDialog(null, "Trinnskatt 4.2%:  kr" + bruttoinntekt * 0.042);
		} else if (bruttoinntekt > 639750 && bruttoinntekt <= 999550) {
			showMessageDialog(null, "Trinnskatt 13.2%:  kr" + bruttoinntekt * 0.132);
		} else if (bruttoinntekt > 999550) {
			showMessageDialog(null, "Trinnskatt 16.2%:  kr" + bruttoinntekt * 0.162);
		}
	}
}
