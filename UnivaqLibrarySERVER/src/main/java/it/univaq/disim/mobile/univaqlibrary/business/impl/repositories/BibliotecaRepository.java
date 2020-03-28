package it.univaq.disim.mobile.univaqlibrary.business.impl.repositories;

import java.util.List;

import it.univaq.disim.mobile.univaqlibrary.domain.Biblioteca;
import it.univaq.disim.mobile.univaqlibrary.domain.Libro;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BibliotecaRepository extends JpaRepository<Biblioteca, Long>{

}