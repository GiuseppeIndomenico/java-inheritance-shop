package org.lessons.java;

public class Carrello {

	public static void main(String[] args) {
		
	
		Prodotto prd = new Prodotto("cacca", "logitech" , 100,"001");	
		
		System.out.println(prd);

		
		Smartphone smr = new Smartphone("galaxy A10","samsung", 1800, "002", "11101ABC", 64 );
		
		System.out.println(smr);

		
		Tv tv1= new Tv("AAA", "Telefunken", 2000, "003", false, 56);

		System.out.println(tv1);
		
		
		Cuffie cuff= new Cuffie("Peppine", "steelseries", 80, "004", "nero", true);
		System.out.println(cuff);

	}
}
