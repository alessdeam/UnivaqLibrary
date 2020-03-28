package it.univaq.disim.mobile.univaqlibrary.domain;

import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "libri")
public class Libro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_LIBRO", nullable = false)
    private Long id;

    @Column(name = "TITOLO", nullable = false, length = 255)
    private String titolo;

    @Column(name = "AUTORE", nullable = false, length = 255)
    private String autore;

    @Column(name = "ISBN", nullable = false, length = 255)
    private String ISBN;

    @Column(name = "DISPONIBILI", nullable = false, length = 255)
    private int disponibili;

    @Column(name = "COPERTINA", nullable = false, length = 255)
    private String copertina;

    @ManyToOne
    @JoinColumn(name = "ID_CORSO", nullable = false)
    private Corso corso;

    @ManyToOne
    @JoinColumn(name = "ID_BIBLIOTECA", nullable = false)
    private Biblioteca biblioteca;


    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getTitolo() {
        return titolo;
    }
    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }
    public Biblioteca getBiblioteca() {
        return biblioteca;
    }
    public void setBiblioteca(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }
    public Corso getCorso() {
        return corso;
    }
    public void setCorso(Corso corso) {
        this.corso = corso;
    }
    public String getAutore() {
        return autore;
    }
    public void setAutore(String autore) {
        this.autore = autore;
    }
    public String getISBN() {
        return ISBN;
    }
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
    public int getDisponibili() {
        return disponibili;
    }
    public void setDisponibili(int disponibili) {
        this.disponibili = disponibili;
    }
    public String getCopertina() {
        return copertina;
    }
    public void setCopertina(String copertina) {
        this.copertina = copertina;
    }


}
