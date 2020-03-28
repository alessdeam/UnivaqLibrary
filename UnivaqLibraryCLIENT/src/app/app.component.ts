import {Component, OnInit} from '@angular/core';

import {NavController, Platform} from '@ionic/angular';
import {SplashScreen} from '@ionic-native/splash-screen/ngx';
import {StatusBar} from '@ionic-native/status-bar/ngx';
import {UtenteService} from './services/utente.service';
import {Utente} from './models/utente.model';
import {BehaviorSubject} from 'rxjs';


@Component({
    selector: 'app-root',
    templateUrl: 'app.component.html'
})
export class AppComponent implements OnInit {
    private utente: BehaviorSubject<Utente>;

    private menu = [
        {title: 'Libri prenotati', url: 'libri-prenotati', icon: 'book'},
        {title: 'Impostazioni profilo', url: 'profilo', icon: 'person'}
    ]


    constructor(private platform: Platform,
                private splashScreen: SplashScreen,
                private utenteService: UtenteService,
                private navController: NavController,
                private statusBar: StatusBar) {
        this.initializeApp();
    }

    ngOnInit(): void {
        this.utente = this.utenteService.getUtente();
        this.navController.navigateRoot('tabs');
    }

    openPage(url: string) {
        this.navController.navigateForward(url);
    }

    logout() {
        this.utenteService.logout();
        this.navController.navigateRoot('login');
    }

    initializeApp() {
        this.platform.ready().then(() => {
            this.statusBar.styleDefault();
            this.splashScreen.hide();
        });
    }


}
