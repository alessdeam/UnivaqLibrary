package it.univaq.disim.mobile.univaqlibrary.business.impl.repositories;

import java.util.List;

import it.univaq.disim.mobile.univaqlibrary.domain.Libro;
import org.springframework.data.jpa.repository.JpaRepository;


public interface LibroRepository extends JpaRepository<Libro, Long>{

    List<Libro> findLibriByBibliotecaId(long idBiblioteca);

    List<Libro> findLibriByCorsoId(long idCorso);

}