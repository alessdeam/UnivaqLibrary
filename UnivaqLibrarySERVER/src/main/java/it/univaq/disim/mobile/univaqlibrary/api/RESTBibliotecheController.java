package it.univaq.disim.mobile.univaqlibrary.api;

import java.util.List;

import it.univaq.disim.mobile.univaqlibrary.business.UnivaqLibraryService;
import it.univaq.disim.mobile.univaqlibrary.domain.Biblioteca;
import it.univaq.disim.mobile.univaqlibrary.domain.Libro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import it.univaq.disim.mobile.univaqlibrary.common.Utility;
import it.univaq.disim.mobile.univaqlibrary.domain.Utente;

@RestController
@RequestMapping("/api/biblioteche")
public class RESTBibliotecheController {

    @Autowired
    private UnivaqLibraryService service;

    @GetMapping("/{idBiblioteca}")
    public Biblioteca findBibliotecaById(@PathVariable long idBiblioteca) { return service.findBibliotecaById(idBiblioteca); }

    @GetMapping
    public List<Biblioteca> list() {
        return service.findAllBiblioteche();
    }

    @GetMapping("/{idBiblioteca}/libri")
    public List<Libro> listLibriByBibliotecaId(@PathVariable long idBiblioteca) {
        return service.findLibriByBibliotecaId(idBiblioteca);
    }

}
