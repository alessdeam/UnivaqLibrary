package it.univaq.disim.mobile.univaqlibrary.business.impl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import it.univaq.disim.mobile.univaqlibrary.business.UnivaqLibraryService;
import it.univaq.disim.mobile.univaqlibrary.business.impl.repositories.BibliotecaRepository;
import it.univaq.disim.mobile.univaqlibrary.business.impl.repositories.CorsoRepository;
import it.univaq.disim.mobile.univaqlibrary.business.impl.repositories.LibroRepository;
import it.univaq.disim.mobile.univaqlibrary.domain.Biblioteca;
import it.univaq.disim.mobile.univaqlibrary.domain.Corso;
import it.univaq.disim.mobile.univaqlibrary.domain.Libro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.jpa.domain.JpaSort;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import it.univaq.disim.mobile.univaqlibrary.business.BusinessException;
import it.univaq.disim.mobile.univaqlibrary.business.impl.repositories.UtenteRepository;
import it.univaq.disim.mobile.univaqlibrary.domain.Utente;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Service
@Transactional
public class UnivaqLibraryServiceImpl implements UnivaqLibraryService {

    @Autowired
    private UtenteRepository utenteRepository;

    @Autowired
    private BibliotecaRepository bibliotecaRepository;

    @Autowired
    private CorsoRepository corsoRepository;

    @Autowired
    private LibroRepository libroRepository;

    @Override
    public Utente findUtenteByUsername(String username) throws BusinessException {
        return utenteRepository.findByUsername(username);
    }

    @Override
    public Utente updateProfilo(Utente profilo) throws BusinessException {
        Utente utente = utenteRepository.findByUsername(profilo.getUsername());
        utente.setEmail(profilo.getEmail());
        utente.setTelefono(profilo.getTelefono());
        return utente;
    }

    @Override
    public List<Utente> findAllUtenti() throws BusinessException {
        return utenteRepository.findAll(JpaSort.unsafe(Direction.DESC, "username"));
    }

    @Override
    public List<Biblioteca> findAllBiblioteche() throws BusinessException {
        return bibliotecaRepository.findAll(JpaSort.unsafe(Direction.DESC, "polo"));
    }

    @Override
    public Biblioteca findBibliotecaById(long idBiblioteca) throws BusinessException {
        return bibliotecaRepository.findById(idBiblioteca).get();
    }

    @Override
    public Corso findCorsoById(long idCorso) throws BusinessException {
        return corsoRepository.findById(idCorso).get();
    }

    @Override
    public List<Corso> findAllCorsi() throws BusinessException {
        return corsoRepository.findAll(JpaSort.unsafe(Direction.DESC, "nome"));
    }

    @Override
    public List<Libro> findLibriByBibliotecaId(long idBiblioteca) throws BusinessException {
        return libroRepository.findLibriByBibliotecaId(idBiblioteca);
    }

    @Override
    public List<Libro> findLibriByCorsoId(long idCorso) throws BusinessException {
        return libroRepository.findLibriByCorsoId(idCorso);
    }


    @Override
    public List<Libro> findAllLibri() throws BusinessException {
        return libroRepository.findAll(JpaSort.unsafe(Direction.DESC, "titolo"));
    }

    @Override
    public void createLibro(Libro libro) throws BusinessException {
        libroRepository.save(libro);
    }

    @Override
    public Libro findLibroById(long idLibro) throws BusinessException {
        return libroRepository.findById(idLibro).get();
    }

    @Override
    public void updateLibro(Libro libro) throws BusinessException {
        libroRepository.save(libro);
    }

    @Override
    public void deleteLibro(long idLibro) throws BusinessException {
        libroRepository.deleteById(idLibro);

    }

    @Override
    public Utente prenotaLibro(Utente profilo) throws BusinessException {
        Utente utente = utenteRepository.findByUsername(profilo.getUsername());
        utente.setLibriPrenotati(profilo.getLibriPrenotati());
        return utente;
    }

    @Override
    public Utente annullaPrenotazione(Utente profilo) throws BusinessException {
        Utente utente = utenteRepository.findByUsername(profilo.getUsername());
        utente.setLibriPrenotati(profilo.getLibriPrenotati());
        return utente;
    }


    /*@Override
    public void togliDisponibile(Libro libro) throws BusinessException {
        int disponibili = libro.getDisponibili() - 1;
        libro.setDisponibili(disponibili);
        libroRepository.save(libro);
    }*/


    @Override
    public void togliDisponibile(Libro libro) throws BusinessException {
        int disponibili = libro.getDisponibili() - 1;
        libro.setDisponibili(disponibili);
        libroRepository.save(libro);
    }

    @Override
    public void aggiungiDisponibile(Libro libro) throws BusinessException {
        int disponibili = libro.getDisponibili() + 1;
        libro.setDisponibili(disponibili);
        libroRepository.save(libro);
    }
}
