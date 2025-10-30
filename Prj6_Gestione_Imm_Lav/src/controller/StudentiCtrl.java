package controller;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import model.Studente;

public class StudentiCtrl {
		
		public List<Studente> listaStudenti;
		private static final String DBS_FILE = "StudentiDB.csv";

		public StudentiCtrl() {
			this.listaStudenti = new ArrayList<Studente>();
		}	
		public void mostraStudenti() {
			if (this.listaStudenti.size() != 0) {
				for (Studente studente : listaStudenti) {
					System.out.println(studente.toString());
				}
			} else {
				System.out.println("Non ci sono Studenti");
			}
		}	
		public void registraStudente(String nome, String cognome, int codFiscale, String corsoIscritto) {
			Studente studente = new Studente(nome, cognome, codFiscale, corsoIscritto);
			try (FileWriter fw = new FileWriter(DBS_FILE, true);
				 PrintWriter pw = new PrintWriter(fw)) {
			pw.println(studente.getNome() + "," + studente.getCognome() + "," + studente.getCodFiscale() + "," + studente.getCorsoIscritto());
			pw.close();
			fw.close();
					
				this.listaStudenti.add(studente);
				System.out.println("Studente registrato");
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
