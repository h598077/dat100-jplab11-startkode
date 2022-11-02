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
		
String a ="BILDE"+"\n"+super.getId()+"\n"+super.getBruker()+"\n" +super.getDato()+"\n"+super.getLikes()+"\n"+this.getTekst()+"\n"+this.url;

return a;

	}

	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		String a="\t\t<h2>"+getBruker()+"@"+getDato()+" ["+ getLikes() +"]"+"</h2>"+"\r\n"+"\t\t<p>"+getTekst()+"</p>"+"\r\n"+"\t\t<iframe src="+this.url+" height=800 width=800></iframe><hr>";
		return a;
				
	}
}

