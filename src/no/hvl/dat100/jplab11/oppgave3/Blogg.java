package no.hvl.dat100.jplab11.oppgave3;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;
import no.hvl.dat100.jplab11.oppgave2.*;

public class Blogg  {

	private Innlegg[] innleggtabell;
	private int nesteLedige;

	public Blogg() {
		innleggtabell  =new Innlegg[20];
		nesteLedige=0;
	}

	public Blogg(int lengde) {
		innleggtabell  =new Innlegg[lengde];
		nesteLedige=0;
	}

	public int getAntall() {
		return nesteLedige;
	}
	
	public Innlegg[] getSamling() {
		return innleggtabell ;

	}
	
	public int finnInnlegg(Innlegg innlegg) {

		boolean funnet = false;
		int pos = 0;

		while (pos < nesteLedige && !funnet) {
			if (innleggtabell [pos].getId() == innlegg.getId()) {
				funnet = true;
			} else {
				pos++;
			}
		}
			
			if (funnet) {
				return pos;
			} else {
				return -1; // betyr ant ansNr ikkje finst i tabell
			}
		
		
	}

	public boolean finnes(Innlegg innlegg) {
		int pos = finnInnlegg(innlegg);
		if (pos >= 0) {
			return true;
		} else {
			return false;
		}
		
	}

	public boolean ledigPlass() {
		if(nesteLedige<innleggtabell.length) {
			return true;
		} else {
			return false;
		}
		
		

	}
	
	public boolean leggTil(Innlegg innlegg) {
		boolean ny = finnInnlegg(innlegg) == -1;

		if (ny && nesteLedige < innleggtabell .length) {
			innleggtabell [nesteLedige] = innlegg;
			nesteLedige++;
			return true;
		} else {
			return false;
		}
	}
	
	public String toString() {
	String a=""+getAntall()+"\n";
	for(int i=0;i<nesteLedige;i++) {
		a = a+innleggtabell[i];
	}
		
	System.out.println(a);
	return a;
		
		
		
		
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}