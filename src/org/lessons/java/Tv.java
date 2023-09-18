package org.lessons.java;

public class Tv extends Prodotto {

	private int dimensione;
	
	private boolean smart;
	
	Tv(String nome, String marca, int prezzo, String codice, boolean smart, int dimensione){
		super(nome, marca, prezzo, codice);
		setSmart(smart);
		setDimensione(dimensione);
				
	}
	public boolean getSmart() {
		return smart;
	}
	
	public void setSmart(boolean smart) {
		this.smart=smart;
	}
	
	public int getDimensione() {
		return dimensione;
	}
	
	public void setDimensione(int dimensione) {
		this.dimensione=dimensione;
	}
	
	@Override
	public String toString() {
		
		return super.toString() +
				"\ndimensione: " + getDimensione() + "''" +
				"\nSmart TV: " + (smart? "smart": "no smart");
				 
	}
}
