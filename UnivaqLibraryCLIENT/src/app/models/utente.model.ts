import { Corso } from './corso.model';
import { Libro } from './libro.model';

export class Utente {

    username: string;
    nome: string;
    cognome: string;
    email: string;
    matricola: string;
    telefono: string;
    corsoStudente: Corso;
    libriVendita: Libro[];
    libriPrenotati: Libro[];
}
