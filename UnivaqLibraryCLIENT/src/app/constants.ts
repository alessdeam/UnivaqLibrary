export const USE_PROXY = true;

export const URL_BASE = USE_PROXY ? 'api' : 'http://localhost:8080/univaq_library/api';

export const URL = {
    LOGIN: URL_BASE + '/login',
    LOGOUT: URL_BASE + '/logout',
    UPDATE_PROFILO: URL_BASE + '/utente/updateprofilo',
    BIBLIOTECHE: URL_BASE + '/biblioteche',
    CORSI: URL_BASE + '/corsi',
    LIBRI: URL_BASE + '/libri',
    UTENTI: URL_BASE + '/utenti',
    PRENOTA_LIBRO: URL_BASE + '/utente/updateLibriPrenotati',
    ANNULLA_PRENOTAZIONE: URL_BASE + '/utente/annullaPrenotazione',
    VENDI_LIBRO: URL_BASE + '/utente/updateLibriVendita',
    ANNULLA_VENDITA: URL_BASE + '/utente/annullaVendita',
    TOGLI_DISPONIBILE: URL_BASE + '/libri/togliDisponibile',
    AGGIUNGI_DISPONIBILE: URL_BASE + '/libri/aggiungiDisponibile',
    UPDATE_LIBRO: URL_BASE + '/libro/utente',
};

export const X_AUTH = 'X-Auth';

export const AUTH_TOKEN = 'auth-token';

export const UTENTE_STORAGE = 'utente';
