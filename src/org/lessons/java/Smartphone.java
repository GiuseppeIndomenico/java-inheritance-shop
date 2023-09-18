package org.lessons.java;

public class Smartphone extends Prodotto {

	private String imei;
	private int memoria;
	
	Smartphone(String nome, String marca, int prezzo, String codice, String imei, int memoria){
		super(nome, marca, prezzo, codice);
		setImei(imei);
		setMemoria(memoria);
				
	}
	public String getImei() {
		return imei;
	}
	
	public void setImei(String imei) {
		this.imei=imei;
	}
	
	public int getMemoria() {
		return memoria;
	}
	
	public void setMemoria(int memoria) {
		this.memoria=memoria;
	}
	
	
	@Override
	public String toString() {
		
		return super.toString() +
				" | cod. IMEI: " + getImei() +
				"\ncapacità di memoria: " +
				getMemoria() +"Gb"; 
	}
	
}
