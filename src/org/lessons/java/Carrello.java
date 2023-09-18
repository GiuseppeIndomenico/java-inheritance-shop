package org.lessons.java;

import java.util.Scanner;

public class Carrello {

    public static void main(String[] args) {
        Prodotto[] carrello = new Prodotto[10]; 
        int numProdotti = 0; // Contatore per il numero di prodotti nel carrello
        Scanner sc = new Scanner(System.in);

        boolean carrelloAttivo = true;

        while (carrelloAttivo) {
            System.out.println("Quale prodotto vuoi aggiungere:");
            System.out.println("1 - Smartphone");
            System.out.println("2 - TV");
            System.out.println("3 - Cuffie");
            System.out.println("0 - Esci dal carrello");

            int scelta = sc.nextInt();
            sc.nextLine(); // Consuma la nuova riga rimanente dopo nextInt()

            switch (scelta) {
                case 0:
                    carrelloAttivo = false;
                    break;
                case 1:
                	System.out.println("\nHai selezionato smartphone");
                	Smartphone smartphone= new Smartphone();
                    carrello[numProdotti] = smartphone;
                    numProdotti++;
                    break;
                case 2:
                 	System.out.println("\nHai selezionato televisore");
                	Tv tv= new Tv();
                    carrello[numProdotti] = tv;
                    numProdotti++;
                    break;
                case 3:
                	System.out.println("\nHai selezionato cuffie");
                    Cuffie cuffie = new Cuffie();
                    carrello[numProdotti] = cuffie;
                    numProdotti++;
                    break;

                default:
                    System.out.println("Inserire un numero valido!");
            }
        }

        sc.close();

        System.out.println("Prodotti nel carrello:");
        for (int i = 0; i < numProdotti; i++) {
            System.out.println(carrello[i]);
        }
    }
}

