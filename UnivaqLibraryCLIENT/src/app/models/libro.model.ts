import { Biblioteca } from '././biblioteca.model';
import { Corso } from './corso.model';
import { Utente } from './utente.model';
import { Observable } from 'rxjs';

export class Libro {
    id: number;
    titolo: string;
    autore: string;
    isbn: string;
    biblioteca: Biblioteca;
    corso: Corso;
    disponibili: number;
    copertina: string;
    telefoniVenditori: string[];
    emailVenditori: string[];
}
