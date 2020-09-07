package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class Oblig1oppg3 {

	public static void main(String[] args) {
		
		
		int heltall = Integer.parseInt(showInputDialog ("Skriv inn heltall"));
			
		int n = 1;
		
		if (heltall > 0) {
			
			for (int nfak = 1; nfak <= heltall; nfak++) {
				n = n * nfak;
			}
			showMessageDialog(null, n);
		} else {
			showMessageDialog(null, "Vennligst tast inn et tall høyere enn 0");
			heltall = Integer.parseInt(showInputDialog("Gi tall høyere enn 0"));
			
			for (int nfak = 1; nfak <= heltall; nfak++) {
				n = n * nfak;
			}
			showMessageDialog(null, n);
		}
	}
}
