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
                    System.out.println("Inserire dettagli dello smartphone:");
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Marca: ");
                    String marca = sc.nextLine();
                    System.out.print("Prezzo: ");
                    int prezzo = sc.nextInt();
                    
                    sc.nextLine(); // Consuma la nuova riga rimanente dopo nextInt()

                    System.out.print("Codice: ");
                    String codice = sc.nextLine();
                    System.out.print("IMEI: ");
                    String imei = sc.nextLine();
                    System.out.print("Memoria (GB): ");
                    int memoria = sc.nextInt();
                    
                    sc.nextLine(); // Consuma la nuova riga rimanente dopo nextInt()

                   Smartphone smartphone = new Smartphone(nome, marca, prezzo, codice, imei, memoria);
                    carrello[numProdotti] = smartphone;
                    numProdotti++;
                    break;
                case 2:
                    System.out.println("Inserire dettagli del televisore:");
                    System.out.print("Nome: ");
                    nome = sc.nextLine();
                    System.out.print("Marca: ");
                    marca = sc.nextLine();
                    System.out.print("Prezzo: ");
                    prezzo = sc.nextInt();
                    sc.nextLine(); // Consuma la nuova riga rimanente dopo nextInt()
                    System.out.print("Codice: ");
                    codice = sc.nextLine();
                    System.out.print("Dimensioni (pollici): ");
                    int dimensioni = sc.nextInt();
                    sc.nextLine(); // Consuma la nuova riga rimanente dopo nextInt()
                    System.out.print("Smart (S/N): ");
                    boolean smart = sc.nextLine().equalsIgnoreCase("S");

                    Tv televisore = new Tv(nome, marca, prezzo, codice, smart, dimensioni);
                    carrello[numProdotti] = televisore;
                    numProdotti++;
                    break;
                case 3:
                    System.out.println("Inserire dettagli delle cuffie:");
                    System.out.print("Nome: ");
                    nome = sc.nextLine();
                    System.out.print("Marca: ");
                    marca = sc.nextLine();
                    System.out.print("Prezzo: ");
                    prezzo = sc.nextInt();
                    sc.nextLine(); // Consuma la nuova riga rimanente dopo nextInt()
                    System.out.print("Codice: ");
                    codice = sc.nextLine();
                    System.out.print("Colore: ");
                    String colore = sc.nextLine();
                    System.out.print("Wireless (S/N): ");
                    boolean isWireless = sc.nextLine().equalsIgnoreCase("S");

                    Cuffie cuffie = new Cuffie(nome, marca, prezzo, codice, colore, isWireless);
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

