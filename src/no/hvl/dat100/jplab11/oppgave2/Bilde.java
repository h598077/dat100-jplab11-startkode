package no.hvl.dat100.jplab11.oppgave2;

import no.hvl.dat100.jplab11.common.TODO;

public class Bilde extends Tekst {

	private String url;
	
	public Bilde(int id, String bruker, String dato, String tekst, String url) {
		this.url=url;
		super.setDato(dato);
		super.setTekst(tekst);
		super.setId(id);
		super.setBruker(bruker);
	}

	public Bilde(int id, String bruker, String dato, int likes, String tekst, String url) {
		this.url=url;
		super.setId(id);
		super.setBruker(bruker);
		super.setTekst(tekst);
		super.setLikes(likes);
		super.setDato(dato);
	}
	
	public String getUrl() {
		return this.url;

	}

	public void setUrl(String url) {
		this.url=url;
	}

	@Override
	public String toString() {

String a ="";
return a;

	}

	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		String a="";
		return a;
				
	}
}
