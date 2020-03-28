package it.univaq.disim.mobile.univaqlibrary.domain;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "utenti")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorValue("utente")
public class Utente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_UTENTE", nullable = false)
	private Long id;

	@Column(name = "NOME", nullable = false, length = 255)
	private String nome;

	@Column(name = "COGNOME", nullable = false, length = 255)
	private String cognome;

	@Column(name = "USERNAME", nullable = false, length = 16, updatable = false, unique = true)
	private String username;

	@JsonIgnore
	@Column(name = "PASSWORD", nullable = false, length = 255)
	private String password;
	
	@Column(name = "EMAIL", nullable = false, length = 255)
	private String email;

	@Column(name = "MATRICOLA", nullable = true, length = 6)
	private String matricola;

	@Column(name = "TELEFONO", nullable = true, length = 20)
	private String telefono;

	@ManyToOne
	@JoinColumn(name = "ID_CORSO", nullable = false)
	private Corso corsoStudente;

	@ManyToMany
	@JoinTable(name="LIBRI_PRENOTATI",
			joinColumns={@JoinColumn(name="ID_STUDENTE")},
			inverseJoinColumns={@JoinColumn(name="ID_LIBRO")})
	private List<Libro> libriPrenotati = new ArrayList<>();


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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
