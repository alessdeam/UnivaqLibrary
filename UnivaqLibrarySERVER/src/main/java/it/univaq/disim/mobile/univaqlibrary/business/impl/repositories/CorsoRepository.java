package it.univaq.disim.mobile.univaqlibrary.business.impl.repositories;

import it.univaq.disim.mobile.univaqlibrary.domain.Corso;
import it.univaq.disim.mobile.univaqlibrary.domain.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface CorsoRepository extends JpaRepository<Corso, Long>{


}