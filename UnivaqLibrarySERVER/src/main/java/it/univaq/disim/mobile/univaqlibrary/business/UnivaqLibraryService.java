package it.univaq.disim.mobile.univaqlibrary.business;

import java.util.List;

import it.univaq.disim.mobile.univaqlibrary.domain.Biblioteca;
import it.univaq.disim.mobile.univaqlibrary.domain.Corso;
import it.univaq.disim.mobile.univaqlibrary.domain.Libro;
import it.univaq.disim.mobile.univaqlibrary.domain.Utente;

public interface UnivaqLibraryService {

    Utente findUtenteByUsername(String username) throws BusinessException;

    Utente updateProfilo(Utente utente) throws BusinessException;

    List<Utente> findAllUtenti() throws BusinessException;

    List<Biblioteca> findAllBiblioteche() throws BusinessException;

    Biblioteca findBibliotecaById(long idBiblioteca) throws BusinessException;

    List<Corso> findAllCorsi() throws BusinessException;

    Corso findCorsoById(long idCorso) throws BusinessException;

    List<Libro> findLibriByBibliotecaId(long idBiblioteca) throws BusinessException;

    List<Libro> findLibriByCorsoId(long idCorso) throws BusinessException;

    List<Libro> findAllLibri() throws BusinessException;

    void createLibro(Libro libro) throws BusinessException;

    Libro findLibroById(long idLibro) throws BusinessException;

    void updateLibro(Libro libro) throws BusinessException;

    Utente prenotaLibro(Utente utente) throws BusinessException;

    void deleteLibro(long idLibro) throws BusinessException;

    Utente annullaPrenotazione(Utente utente) throws BusinessException;

    void togliDisponibile(Libro libro) throws BusinessException;

    void aggiungiDisponibile(Libro libro) throws BusinessException;

}
