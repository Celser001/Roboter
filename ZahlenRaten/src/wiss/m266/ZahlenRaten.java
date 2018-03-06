package wiss.m266;

import utils.ConsoleReader;

public class ZahlenRaten {

	public static void main(String[] args) {
		
		int zahl = 50;
		int zahl_alt = 0;
		int unterschied = 0;
		String antwort;
		do {
			System.out.println("Zahl: " + zahl + "?");
			antwort = ConsoleReader.readString("Ja oder Nein?");
			if (antwort.equals("nein")) {
				unterschied = Math.abs(zahl - zahl_alt) / 2;
				if (unterschied == 0) {
					unterschied = 1;
				}
				zahl_alt = zahl;
				System.out.println( zahl + " zu gross?");
				antwort = ConsoleReader.readString("Ja oder Nein?");
				if (antwort.equals("ja")) {
					zahl -= unterschied;
				} else {
					zahl += unterschied;
				}
			} else {
				antwort = "erraten!";
				System.out.println("erraten!");
			}
		}while(!antwort.equals("erraten!"));
	}

}
