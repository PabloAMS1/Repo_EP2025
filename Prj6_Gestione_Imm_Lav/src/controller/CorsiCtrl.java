package controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Corso;

public class CorsiCtrl {
	
	public List<Corso> listaCorsi;
	private static final String PATH_FILE = "CorsiDB.csv";

	public CorsiCtrl() {
		this.listaCorsi = new ArrayList<Corso>();
		caricaCorsiDaFile();
	}
	
	public void mostraCorsi() {
		if (this.listaCorsi.size() != 0) {
			for (Corso corso : listaCorsi) {
				System.out.println(corso.toString());
			}
		} else {
			System.out.println("Non ci sono Corsi");
		}
	}
	
	public void caricaCorsiDaFile() {
		File fileCorsi = new File(PATH_FILE);

		try {
			Scanner scan = new Scanner(fileCorsi);

			while (scan.hasNextLine()) {
				String riga = scan.nextLine();
				String[] separate = riga.split(","); 
														
				String titolo = separate[0];
				String codigo = separate[1];
				String numPartecipanti = separate[2];
				
				Corso corso = new Corso(titolo, codigo, numPartecipanti);
				this.listaCorsi.add(corso);

			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("Non ci sono Corsi");
		}

	}
	
	public void registraCorso(String titolo, String codigo, String numPartecipanti) {
		Corso corso = new Corso(titolo, codigo, numPartecipanti);
		
		try (
			FileWriter fw = new FileWriter(PATH_FILE, true);
			PrintWriter pw = new PrintWriter(fw)) {
			pw.println(corso.getTitolo() + "," + corso.getCodigo() + "," + corso.getNumPartecipanti());
			pw.close();
			fw.close();
				
			this.listaCorsi.add(corso);
				System.out.println("Corso registrato");
				
	} catch (IOException e) {
		e.printStackTrace();
	} 
	}
}
	

	