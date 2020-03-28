package it.univaq.disim.mobile.univaqlibrary.api;

import it.univaq.disim.mobile.univaqlibrary.business.UnivaqLibraryService;
import it.univaq.disim.mobile.univaqlibrary.domain.Biblioteca;
import it.univaq.disim.mobile.univaqlibrary.domain.Libro;
import it.univaq.disim.mobile.univaqlibrary.domain.Utente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/api/libri")
public class RESTLibriController {


    @Autowired
    private UnivaqLibraryService service;

    @GetMapping
    public List<Libro> list() { return service.findAllLibri(); }

    @GetMapping("/{idLibro}")
    public Libro findLibroById(@PathVariable long idLibro) {
        return service.findLibroById(idLibro);
    }

    /*@PostMapping
    public void createLibro(@RequestBody Libro libro) {
        service.createLibro(libro);
    }*/

    @PutMapping
    public void updateLibro(@RequestBody Libro libro) { service.updateLibro(libro); }

    @DeleteMapping("/{idLibro}")
    public void deleteLibro(@PathVariable long idLibro) {
        service.deleteLibro(idLibro);
    }

 /*   @PutMapping("/togliDisponibile")
    public void togliDisponibile(@RequestBody Libro libro) { service.togliDisponibile(libro); }*/


    @PutMapping("/togliDisponibile")
    public void togliDisponibile(@RequestBody Libro libro) {
        service.togliDisponibile(libro);
    }

    @PutMapping("/aggiungiDisponibile")
    public void aggiungiDisponibile(@RequestBody Libro libro) { service.aggiungiDisponibile(libro); }

}
