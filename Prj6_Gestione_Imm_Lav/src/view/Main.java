package view;

import java.util.Scanner;

import controller.CorsiCtrl;
import controller.StudentiCtrl;

public class Main {

	private static Scanner scan;
	private static CorsiCtrl Corsi;
	private static StudentiCtrl Studenti;
	
	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		boolean flag = true;
		
		do {
			mostraMenu();
			int scelta = scan.nextInt();

			switch (scelta) {
			case 1: 
				Corsi.mostraCorsi();
				break;
			case 2:
				Studenti.mostraStudenti();
				break;
			case 3:
				scan.nextLine();
				System.out.println("Inserisci il nome del studente:");
				String nome = scan.nextLine();
				System.out.println("Inserisci il cognome del studente");
				String cognome = scan.nextLine();
				System.out.println("Inserisci il cod. fiscale del studente:");
				int codFiscale = scan.nextInt();
				System.out.println("Inserisci il corso a che è stato iscritto");
				String corsoIscritto = scan.nextLine();
				Studenti.registraStudente(nome, cognome, codFiscale, corsoIscritto);
				break;
			case 4:
				scan.nextLine();
				System.out.println("Inserisci il titolo del corso:");
				String titolo = scan.nextLine();
				System.out.println("Inserisci il codigo del corso:");
				String codigo = scan.nextLine();
				System.out.println("Inserisci il numero di partecipanti:");
				String numPartecipanti = scan.nextLine();
				Corsi.registraCorso(titolo, codigo, numPartecipanti);
				break;
			case 5:
				System.out.println("Grazie per aver utilizzato il nostro sistema");
				flag = false;
				break;
			default:
				System.out.println("Non capisco cosa vuoi fare");
				break;
				}
			}while (flag);
		
	}
	public static void mostraMenu() {
		System.out.println("<<<<<<< MENU >>>>>>>");
		System.out.println("1. Mostra i Corsi");
		System.out.println("2. Mostra l'elenco degli Studenti");
		System.out.println("3. Registra nuovo studenti");
		System.out.println("4. Registra nuovo corso");
		System.out.println("5. ESCI");
	}
	
}
