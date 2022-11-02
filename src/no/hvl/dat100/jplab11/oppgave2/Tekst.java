package no.hvl.dat100.jplab11.oppgave2;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Tekst extends Innlegg {

	private String tekst;
	
	public Tekst () {
		
	}
	
	public Tekst(int id, String bruker, String dato, String tekst) {
		super.setId(id);
		super.setBruker(bruker);
		super.setDato(dato);
		this.tekst=tekst;
	}
	
	public Tekst(int id, String bruker, String dato, int likes, String tekst) {
		super.setId(id);
		super.setBruker(bruker);
		super.setDato(dato);
		super.setLikes(likes);
		this.tekst=tekst;
	}
	
	public String getTekst() {
		return this.tekst;

	}

	public void setTekst(String tekst) {
		this.tekst=tekst;
	}

	@Override
	public String toString() {
		String tekst = "TEKST"+"\n"+super.getId()+"\n"+super.getBruker()+"\n"+super.getDato()+"\n"+super.getLikes()+"\n"+this.getTekst()+"\n";
		return tekst;

	}
	
	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
			
		String a ="\t\t<h2>"+getBruker()+"@"+getDato()+" ["+ getLikes() +"]"+"</h2>"+"\r\n"+"\t\t<p>"+getTekst()+"</p>"+"\r\n"+"\t\t<hr>"+"\r\n";
		return a;
				
	}
}
