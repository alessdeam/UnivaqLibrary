package it.univaq.disim.mobile.univaqlibrary;

import it.univaq.disim.mobile.univaqlibrary.business.impl.repositories.*;
import it.univaq.disim.mobile.univaqlibrary.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.*;

@SpringBootApplication
public class UnivaqLibraryApplication {

    @Autowired
    private PasswordEncoder passwordEncoder;


    public static void main(String[] args) {
        SpringApplication.run(UnivaqLibraryApplication.class, args);
    }


    @Bean
    public CommandLineRunner loadData(UtenteRepository utenteRepository, BibliotecaRepository bibliotecaRepository, CorsoRepository corsoRepository, LibroRepository libroRepository) {
        return (args) -> {

            Corso informatica = new Corso();
            informatica.setNome("Informatica");
            corsoRepository.save(informatica);

            Corso corso_medicina = new Corso();
            corso_medicina.setNome("Medicina");
            corsoRepository.save(corso_medicina);

            Corso ingegneria_meccanica = new Corso();
            ingegneria_meccanica.setNome("Ing. Meccanica");
            corsoRepository.save(ingegneria_meccanica);

            Corso matematica = new Corso();
            matematica.setNome("Matematica");
            corsoRepository.save(matematica);

            Corso fisioterapia = new Corso();
            fisioterapia.setNome("Fisioterapia");
            corsoRepository.save(fisioterapia);

            Corso filosofia = new Corso();
            filosofia.setNome("Filosofia");
            corsoRepository.save(filosofia);

            Corso corso_economia = new Corso();
            corso_economia.setNome("Economia");
            corsoRepository.save(corso_economia);

            Corso lettere = new Corso();
            lettere.setNome("Lettere");
            corsoRepository.save(lettere);

            Utente user = new Utente();
            user.setUsername("user");
            user.setPassword(passwordEncoder.encode("user"));
            user.setNome("user");
            user.setCognome("user");
            user.setEmail("user@student.univaq.it");
            user.setMatricola("99999");
            user.setTelefono("+39.3917214982");
            user.setCorsoStudente(ingegneria_meccanica);
            List<Libro> libriPrenotati = new ArrayList<Libro>();
            user.setLibriPrenotati(libriPrenotati);
            utenteRepository.save(user);

            Utente user2 = new Utente();
            user2.setUsername("user2");
            user2.setPassword(passwordEncoder.encode("user2"));
            user2.setNome("user2");
            user2.setCognome("user2");
            user2.setEmail("user2@student.univaq.it");
            user2.setMatricola("19999");
            user2.setTelefono("+39.392084965");
            user2.setCorsoStudente(informatica);
            List<Libro> libriPrenotati2 = new ArrayList<Libro>();
            user2.setLibriPrenotati(libriPrenotati2);
            utenteRepository.save(user2);

            Biblioteca scienze_umane = new Biblioteca();
            scienze_umane.setPolo("Centro");
            scienze_umane.setDenominazione("Biblioteca dell'Area di scienze umane");
            bibliotecaRepository.save(scienze_umane);

            Biblioteca economia = new Biblioteca();
            economia.setPolo("Centro");
            economia.setDenominazione("Biblioteca dell'Area di economia");
            bibliotecaRepository.save(economia);

            Biblioteca scienze = new Biblioteca();
            scienze.setPolo("Coppito");
            scienze.setDenominazione("Biblioteca dell'Area scientifica");
            bibliotecaRepository.save(scienze);

            Biblioteca medicina = new Biblioteca();
            medicina.setPolo("Coppito");
            medicina.setDenominazione("Biblioteca dell'Area medica");
            bibliotecaRepository.save(medicina);

            Biblioteca ingegneria = new Biblioteca();
            ingegneria.setPolo("Roio");
            ingegneria.setDenominazione("Biblioteca dell'Area di ingegneria");
            bibliotecaRepository.save(ingegneria);

            Libro libroAlgoritmi = new Libro();
            libroAlgoritmi.setTitolo("Algoritmi e strutture dati");
            libroAlgoritmi.setAutore("Camil Demetrescu, Irene Finocchi, Giuseppe F. Italiano");
            libroAlgoritmi.setISBN("8838664684");
            libroAlgoritmi.setDisponibili(1);
            libroAlgoritmi.setCopertina("/assets/images/algoritmi.jpg");
            libroAlgoritmi.setBiblioteca(scienze);
            libroAlgoritmi.setCorso(informatica);
            libroRepository.save(libroAlgoritmi);

            Libro libroSistemiOperativi = new Libro();
            libroSistemiOperativi.setTitolo("Sistemi operativi. Concetti ed esempi");
            libroSistemiOperativi.setAutore("Abraham Silberschatz, Peter Baer Galvin, Greg Gagne");
            libroSistemiOperativi.setISBN("8865183713");
            libroSistemiOperativi.setDisponibili(1);
            libroSistemiOperativi.setCopertina("/assets/images/sistemi_operativi.jpg");
            libroSistemiOperativi.setBiblioteca(scienze);
            libroSistemiOperativi.setCorso(informatica);
            libroRepository.save(libroSistemiOperativi);

            Libro libroAnatomia = new Libro();
            libroAnatomia.setTitolo("Anatomia umana");
            libroAnatomia.setAutore("Frederic H. Martini, L. Cocco, E. Gaudio, L. Manzoli, G. Zummo");
            libroAnatomia.setISBN("8833190250");
            libroAnatomia.setDisponibili(2);
            libroAnatomia.setCopertina("/assets/images/anatomia.jpg");
            libroAnatomia.setBiblioteca(medicina);
            libroAnatomia.setCorso(corso_medicina);
            libroRepository.save(libroAnatomia);

            Libro libroMeccanicaRazionale = new Libro();
            libroMeccanicaRazionale.setTitolo("Meccanica Razionale");
            libroMeccanicaRazionale.setAutore("Paolo Biscari, Tommaso Ruggeri, Giuseppe Saccomandi, Maurizio Vianello");
            libroMeccanicaRazionale.setISBN("8847057728");
            libroMeccanicaRazionale.setDisponibili(2);
            libroMeccanicaRazionale.setCopertina("/assets/images/meccanica_razionale.jpg");
            libroMeccanicaRazionale.setBiblioteca(ingegneria);
            libroMeccanicaRazionale.setCorso(ingegneria_meccanica);
            libroRepository.save(libroMeccanicaRazionale);

            Libro libroDisegnoTecnico = new Libro();
            libroDisegnoTecnico.setTitolo("Esercizi di disegno meccanico");
            libroDisegnoTecnico.setAutore("Monica Carfagni, Rocco Furferi, Lapo Governi");
            libroDisegnoTecnico.setISBN("8808261026");
            libroDisegnoTecnico.setDisponibili(1);
            libroDisegnoTecnico.setCopertina("/assets/images/disegno_tecnico.jpg");
            libroDisegnoTecnico.setBiblioteca(ingegneria);
            libroDisegnoTecnico.setCorso(ingegneria_meccanica);
            libroRepository.save(libroDisegnoTecnico);

            Libro libroChimica = new Libro();
            libroChimica.setTitolo("Introduzione alla chimica organica");
            libroChimica.setAutore("William H. Brown, Thomas Poon");
            libroChimica.setISBN("8879598252");
            libroChimica.setDisponibili(1);
            libroChimica.setCopertina("/assets/images/chimica.jpg");
            libroChimica.setBiblioteca(medicina);
            libroChimica.setCorso(corso_medicina);
            libroRepository.save(libroChimica);

            Libro libroDirittoPrivato = new Libro();
            libroDirittoPrivato.setTitolo("Manuale di diritto privato");
            libroDirittoPrivato.setAutore("Andrea Torrente, Piero Schlesinger, F. Anelli, C. Granelli");
            libroDirittoPrivato.setISBN("8828809795");
            libroDirittoPrivato.setDisponibili(3);
            libroDirittoPrivato.setCopertina("/assets/images/diritto_privato.jpg");
            libroDirittoPrivato.setBiblioteca(economia);
            libroDirittoPrivato.setCorso(corso_economia);
            libroRepository.save(libroDirittoPrivato);

            Libro libroAnalisi = new Libro();
            libroAnalisi.setTitolo("Analisi matematica 1");
            libroAnalisi.setAutore("Marco Bramanti, Carlo D. Pagani, Sandro Salsa");
            libroAnalisi.setISBN("8808064859");
            libroAnalisi.setDisponibili(1);
            libroAnalisi.setCopertina("/assets/images/analisi.jpg");
            libroAnalisi.setBiblioteca(economia);
            libroAnalisi.setCorso(corso_economia);
            libroRepository.save(libroAnalisi);

            Libro libroLetteratura = new Libro();
            libroLetteratura.setTitolo("Letteratura italiana. Un metodo di studio");
            libroLetteratura.setAutore("Gino Tellini");
            libroLetteratura.setISBN("8800745040");
            libroLetteratura.setDisponibili(2);
            libroLetteratura.setCopertina("/assets/images/letteratura.jpg");
            libroLetteratura.setBiblioteca(scienze_umane);
            libroLetteratura.setCorso(lettere);
            libroRepository.save(libroLetteratura);

            Libro libroFilosofia = new Libro();
            libroFilosofia.setTitolo("La filosofia moderna. Il Seicento e il Settecento");
            libroFilosofia.setAutore("G. Cambiano, L. Fonnesu, M. Mori");
            libroFilosofia.setISBN("8864732101");
            libroFilosofia.setDisponibili(1);
            libroFilosofia.setCopertina("/assets/images/filosofia.jpg");
            libroFilosofia.setBiblioteca(scienze_umane);
            libroFilosofia.setCorso(filosofia);
            libroRepository.save(libroFilosofia);


        };
    }

}
