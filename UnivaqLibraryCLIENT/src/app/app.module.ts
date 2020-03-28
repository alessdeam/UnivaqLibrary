import {NgModule} from '@angular/core';
import {BrowserModule} from '@angular/platform-browser';
import {RouteReuseStrategy} from '@angular/router';
import { FormsModule } from '@angular/forms';

import {IonicModule, IonicRouteStrategy} from '@ionic/angular';
import {SplashScreen} from '@ionic-native/splash-screen/ngx';
import {StatusBar} from '@ionic-native/status-bar/ngx';

import {AppComponent} from './app.component';
import {AppRoutingModule} from './app-routing.module';
import {HttpClient, HttpClientModule} from '@angular/common/http';
import {IonicStorageModule} from '@ionic/storage';
import {httpInterceptorProviders} from './interceptors';


@NgModule({
    declarations: [AppComponent],
    entryComponents: [],
    imports: [BrowserModule,
        HttpClientModule,
        FormsModule,
        IonicModule.forRoot(),
        IonicStorageModule.forRoot({
            name: 'univaq_library__db',
            driverOrder: ['indexeddb', 'sqlite', 'websql']
        }),
        AppRoutingModule],
    providers: [
        StatusBar,
        SplashScreen,
        {provide: RouteReuseStrategy, useClass: IonicRouteStrategy},
        httpInterceptorProviders
    ],
    bootstrap: [AppComponent]
})
export class AppModule {
}
