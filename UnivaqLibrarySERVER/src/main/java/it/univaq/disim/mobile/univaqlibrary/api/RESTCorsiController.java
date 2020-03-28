package it.univaq.disim.mobile.univaqlibrary.api;

import it.univaq.disim.mobile.univaqlibrary.business.UnivaqLibraryService;
import it.univaq.disim.mobile.univaqlibrary.domain.Biblioteca;
import it.univaq.disim.mobile.univaqlibrary.domain.Corso;
import it.univaq.disim.mobile.univaqlibrary.domain.Libro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/corsi")
public class RESTCorsiController {

    @Autowired
    private UnivaqLibraryService service;

    @GetMapping("/{idCorso}")
    public Corso findCorsoById(@PathVariable long idCorso) { return service.findCorsoById(idCorso); }

    @GetMapping
    public List<Corso> list() {
        return service.findAllCorsi();
    }

    @GetMapping("/{idCorso}/libri")
    public List<Libro> list(@PathVariable long idCorso) {
        return service.findLibriByCorsoId(idCorso);
    }

}
