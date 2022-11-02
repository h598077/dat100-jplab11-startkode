package no.hvl.dat100.jplab11.oppgave5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;
import no.hvl.dat100.jplab11.oppgave2.*;
import no.hvl.dat100.jplab11.oppgave3.*;

import javax.swing.JOptionPane;

public class LesBlogg extends Innlegg  {

	private static String TEKST = "TEKST";
	private static String BILDE = "BILDE";

	public static Blogg les(String mappe, String filnavn) {
		String antall="";
		String Teksttittel="";
		String Bildetittel="";
		String bruker="";
		String id="";
		String dato="";
		String tekst="";
		String likes="";
		String bruker2="";
		String id2="";
		String dato2="";
		String tekst2="";
		String likes2="";
		String url="";
		Blogg i= new Blogg();
		String Filplassering= mappe+filnavn;
		int LinjeNr =1;
		File fil = new File(Filplassering);
		try {
			Scanner leser = new Scanner(fil);
			antall= leser.nextLine();
			i= new Blogg(Integer.parseInt(antall));
			String linje;
			while (leser.hasNextLine()) {
				linje = leser.nextLine();
				//System.out.println(LinjeNr+": "+linje);
			//	LinjeNr++;
				if(TEKST.equals(linje)) {
					Teksttittel = linje;
					id= leser.nextLine();
					bruker= leser.nextLine();
					dato=leser.nextLine();
					likes=leser.nextLine();
					tekst=leser.nextLine();
				
				}else if(BILDE.equals(linje)) {
					Bildetittel=linje;
					id2=leser.nextLine();
					bruker2=leser.nextLine();
					dato2=leser.nextLine();
					likes2=leser.nextLine();
					tekst2=leser.nextLine();
					url=leser.nextLine();
				}	
			}
			leser.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
		}
		//System.out.println(i.getSamling().length);
		Bilde B = new Bilde(Integer.parseInt(id2),bruker2,dato2,tekst2,url);
		Tekst T = new Tekst(Integer.parseInt(id),bruker,dato,Integer.parseInt(likes),tekst);
		 i.getSamling()[0]= T;
		 i.getSamling()[1]= B;
		System.out.println( i.getSamling()[0]);
		System.out.println( i.getSamling()[1]);
		System.out.println("\n"+"Antall Innlegg "+ antall);
		return i;

	}
}
