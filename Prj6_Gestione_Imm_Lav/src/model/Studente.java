package model;

public class Studente {

	private String nome;
	private String cognome;
	private int codFiscale;
	private String corsoIscritto;
	
	public Studente(String nome, String cognome, int codFiscale, String corsoIscritto) {
		this.nome = nome;
		this.cognome = cognome;
		this.codFiscale = codFiscale;
		this.corsoIscritto = corsoIscritto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public int getCodFiscale() {
		return codFiscale;
	}

	public void setCodFiscale(int codFiscale) {
		this.codFiscale = codFiscale;
	}

	public String getCorsoIscritto() {
		return corsoIscritto;
	}

	public void setCorsoIscritto(String corsoIscritto) {
		this.corsoIscritto = corsoIscritto;
	}

	@Override
	public String toString() {
		return "Studente [nome=" + nome + ", cognome=" + cognome + ", codFiscale=" + codFiscale + ", corsoIscritto="
				+ corsoIscritto + "]";
	}
	
	
}

