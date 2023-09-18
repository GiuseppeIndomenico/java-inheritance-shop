package org.lessons.java;

public class Cuffie extends Prodotto{
	
	private String colore;
	
	private boolean wireless;

	Cuffie(String nome, String marca, int prezzo, String codice, String colore, boolean wireless) {
		super(nome, marca, prezzo, codice);
		
		setColore(colore);
		setWireless(wireless);
				
	}
	
	public boolean getWireless() {
		return wireless;
	}
	
	public void setWireless(boolean wireless) {
		this.wireless=wireless;
	}
	
	public String getColore() {
		return colore;
	}
	
	public void setColore(String colore) {
		this.colore=colore;
	}
	
	@Override
	public String toString() {
		
		return super.toString() +
				"\nColore: " + getColore() + 
				"\nConnettore: " + (wireless? "Wireless": "Cablate");
				 
	}
	public Cuffie() {
		super();
		  System.out.print("Colore: ");
        this.colore = sc.nextLine();
        System.out.print("Wireless (S/N): ");
       this.wireless = sc.nextLine().equalsIgnoreCase("S");
	
	}
}
	
	
	

