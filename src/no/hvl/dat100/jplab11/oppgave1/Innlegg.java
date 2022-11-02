package no.hvl.dat100.jplab11.oppgave1;

import java.util.Objects;

import no.hvl.dat100.jplab11.common.TODO;

public abstract class Innlegg {
	private int id;
	private String bruker;
	private String dato;
	private int likes;
	// TODO - deklarering av objektvariable
	
	public Innlegg() {
		
	}
	
	public Innlegg(int id, String bruker, String dato) {
		this.id=id;
		this.bruker=bruker;
		this.dato=dato;
		
	}

	public Innlegg(int id, String bruker, String dato, int likes) {
		this.id=id;
		this.bruker=bruker;
		this.likes=likes;
		this.dato=dato;
		likes=0;
		
	}
	
	public String getBruker() {
		
		return this.bruker;

	}

	public void setBruker(String bruker) {
		this.bruker=bruker;
	}

	public String getDato() {
		return this.dato;
		
	}

	public void setDato(String dato) {
		this.dato=dato;
	}
	public void setId(int id) {
		this.id=id;
	}

	public int getId() {
		return this.id;
	}

	public int getLikes() {
		return this.likes;

	}
	public void setLikes(int likes) {
		this.likes=likes;

	}
	
	public void doLike () {
		this.likes++;
	}
	
	public boolean erLik(Innlegg innlegg) {
		
		if (this == innlegg) {
			return true;
		}
		if (!(innlegg instanceof Innlegg)) {
			return false;
		}
		Innlegg other = (Innlegg) innlegg;
		return id == other.id;
	}
	
	

	
	@Override
	public String toString() {
		
		String ny = getId()+"\r\n"+getBruker()+"\r\n"+getDato()+"\r\n"+getLikes();
		return ny;
	}
	
	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		String a ="test";
		return a;
				
	}

}
