package org.lessons.java;

public class Prodotto {
	
	private String codice;
	
	private int iva;

	private String nome;
	
	private String marca;
	
	private int prezzo; 
	
	Prodotto(String nome, String marca, int prezzo, String codice){
		
		setNome(nome);
		setMarca(marca);
		setPrezzo(prezzo);
		setIva(22);
		setCodice(codice);
		
	}
	
	public String getNome(){

		return nome;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca=marca;
	}
	
	public int getPrezzo() {
		return prezzo;
	}
	
	public void setPrezzo(int prezzo) {
		this.prezzo=prezzo;
	}
	
	public String getCodice() {
		return codice;
	}
	
	public void setCodice(String codice) {
		this.codice = codice;
	}

	public int getIva() {
		return iva;
	}
	
	public void setIva(int iva) {
		this.iva=iva;
	}
	
	public float prezzoIva() {
	    return (getIva() / 100.0f) * getPrezzo() + getPrezzo();
	}

	public String dettagliProdotto() {
		
		return "\n----Codice: " + getCodice() +"------\n" +
		"\nnome: " + getNome() +
		"\nmarca: " + getMarca() +
		"\nprezzo: " + getPrezzo() +"\u20ac" +
		" | prezzo + iva: " + prezzoIva()  +"\u20ac" ; 
		
		
	}
	
	@Override
	public String toString() {

		return dettagliProdotto();
	}
	
}




