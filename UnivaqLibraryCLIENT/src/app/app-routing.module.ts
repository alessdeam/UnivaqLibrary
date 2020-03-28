import { NgModule } from '@angular/core';
import { PreloadAllModules, RouterModule, Routes } from '@angular/router';
import { AuthGuard } from './guard/auth.guard';

const routes: Routes = [
    {
        path: '',
        redirectTo: 'login',
        pathMatch: 'full'
    },
    {
        path: 'login',
        loadChildren: './pages/login/login.module#LoginPageModule'
    },
    {
        path: 'tabs',
        loadChildren: './pages/tabs/tabs.module#TabsPageModule',
        canActivateChild: [AuthGuard]
    },
    {
        path: 'profilo',
        loadChildren: './pages/profilo/profilo.module#ProfiloPageModule',
        canActivate: [AuthGuard]
    },
    {
        path: 'libri-biblioteca/:id',
        loadChildren: './pages/libri-biblioteca/libri-biblioteca.module#LibriBibliotecaPageModule',
        canActivate: [AuthGuard]
    },
    {
        path: 'dettaglio-libro/:id',
        loadChildren: './pages/dettaglio-libro/dettaglio-libro.module#DettaglioLibroPageModule',
        canActivate: [AuthGuard]
    },
    {   path: 'libri-prenotati', 
        loadChildren: './pages/libri-prenotati/libri-prenotati.module#LibriPrenotatiPageModule',
        canActivate: [AuthGuard] 
    },
    {   path: 'libri-vendita', 
        loadChildren: './pages/libri-vendita/libri-vendita.module#LibriVenditaPageModule',
        canActivate: [AuthGuard] 
    }
]
    ;

@NgModule({
    imports: [
        RouterModule.forRoot(routes, { preloadingStrategy: PreloadAllModules })
    ],
    exports: [RouterModule]
})
export class AppRoutingModule {
}
