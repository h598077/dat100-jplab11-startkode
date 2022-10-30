package no.hvl.dat100.jplab11.oppgave4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave3.*;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {
		Boolean skrevet = false;
		File fil = new File(mappe+filnavn);
		//System.out.println(mappe+filnavn);
			try { 
				PrintWriter skriver = new PrintWriter(fil);
				skriver.println(samling.toString());
				skriver.close();
				skrevet=true;
			} catch (FileNotFoundException e) {
				skrevet=false;
				System.out.println("Fil finst ikke");
			}
		//System.out.println(samling.toString());
			
		return skrevet;
	}
}
