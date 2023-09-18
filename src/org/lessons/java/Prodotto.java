package org.lessons.java;

import java.util.Scanner;

public class Prodotto {
	Scanner sc= new Scanner(System.in);
	
	private String codice;
	
	private int iva;

	private String nome;
	
	private String marca;
	
	private int prezzo; 
	
	 public Prodotto(){
		System.out.println("Inserire dettagli.");
		System.out.print("Nome: ");
	      this.nome = sc.nextLine();
	      System.out.print("Marca: ");
	      this.marca = sc.nextLine();
	      System.out.print("Prezzo: ");
	      this.prezzo = sc.nextInt();
	   
	      sc.nextLine(); 
	      System.out.print("Codice: ");
	      this.codice = sc.nextLine();
	      setIva(22);
	  	
	}
	
	public Prodotto(String nome, String marca, int prezzo, String codice){
		
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




