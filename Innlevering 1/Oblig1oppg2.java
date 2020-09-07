package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class Oblig1oppg2 {

	public static void main(String[] args) {
		
		for (int studenter = 1; studenter <= 10; studenter++) {
		
			int poeng = Integer.parseInt(showInputDialog("Få poengsum: "));
				
			while (poeng < 0 || poeng > 100) {
				showMessageDialog(null, "Må være tall mellom 1-100");
				poeng = Integer.parseInt(showInputDialog("Tall mellom 0 og 100"));
			}
			if (poeng >= 90 && poeng <= 100) {
				showMessageDialog(null, "Karakter A til student " + studenter);
			} else if (poeng >= 80 && poeng <= 89) {
				showMessageDialog(null, "Karakter B til student " + studenter);
			} else if (poeng >= 60 && poeng <= 79) {
				showMessageDialog(null, "Karakter C til student " + studenter);
			} else if (poeng >= 50 && poeng <= 59) {
				showMessageDialog(null, "Karakter D til student " + studenter);
			} else if (poeng >= 40 && poeng <= 49) {
				showMessageDialog(null, "Karakter E til student " + studenter);
			} else if (poeng >= 0 && poeng <= 39) {
				showMessageDialog(null, "Karakter F til student " + studenter);	
			}
		}
	}
}
