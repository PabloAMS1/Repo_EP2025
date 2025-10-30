package model;

public class Corso {
	private String titolo;
	private String codigo; // Ho cambiato il tipo di dati in stringa (era int per codigo e numPartecipanti) perché non ero in grado di convertire una stringa in int durante la lettura dei dati del DB.
	private String numPartecipanti;
	
	public Corso(String titolo, String codigo, String numPartecipanti) {
		this.titolo = titolo;
		this.codigo = codigo;
		this.numPartecipanti = numPartecipanti;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNumPartecipanti() {
		return numPartecipanti;
	}

	public void setNumPartecipanti(String numPartecipanti) {
		this.numPartecipanti = numPartecipanti;
	}

	@Override
	public String toString() {
		return "Corso [titolo=" + titolo + ", codigo=" + codigo + ", numPartecipanti=" + numPartecipanti + "]";
	}


	}
	
	
	
