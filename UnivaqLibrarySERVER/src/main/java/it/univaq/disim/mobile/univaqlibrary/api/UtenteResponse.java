package it.univaq.disim.mobile.univaqlibrary.api;

import it.univaq.disim.mobile.univaqlibrary.domain.Corso;
import it.univaq.disim.mobile.univaqlibrary.domain.Libro;
import it.univaq.disim.mobile.univaqlibrary.domain.Utente;

import java.util.List;

public class UtenteResponse {

	private long id;
	private String username;
	private String nome;
	private String cognome;
	private String email;
	private String matricola;
	private String telefono;
	private Corso corsoStudente;
	private List<Libro> libriPrenotati;
	
	public UtenteResponse() {
	}
	
	public UtenteResponse(Utente utente) {
		this.id = utente.getId();
		this.nome = utente.getNome();
		this.cognome = utente.getCognome();
		this.username = utente.getUsername();
		this.email = utente.getEmail();
		this.matricola = utente.getMatricola();
		this.telefono = utente.getTelefono();
		this.corsoStudente = utente.getCorsoStudente();
		this.libriPrenotati = utente.getLibriPrenotati();
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
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
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMatricola() {
		return matricola;
	}
	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public Corso getCorsoStudente() {
		return corsoStudente;
	}
	public void setCorsoStudente(Corso corsoStudente) {
		this.corsoStudente = corsoStudente;
	}
	public List<Libro> getLibriPrenotati() {
		return libriPrenotati;
	}
	public void setLibriPrenotati(List<Libro> libriPrenotati) {
		this.libriPrenotati = libriPrenotati;
	}

}
