import { LOCALE_ID, NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MatToolbarModule } from '@angular/material/toolbar';
import { MatSidenavModule } from '@angular/material/sidenav'
import { MatListModule } from '@angular/material/list';
import { MatCardModule } from '@angular/material/card';
import { MatButtonModule } from '@angular/material/button';
import { MatSnackBarModule } from '@angular/material/snack-bar';
import { HttpClientModule } from '@angular/common/http'
import { FormsModule } from '@angular/forms';
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatInputModule } from '@angular/material/input';
import { MatTableModule } from '@angular/material/table';
import localePt from '@angular/common/locales/pt';
import { registerLocaleData } from '@angular/common';
import { HomeComponent } from './components/views/home/home.component';
import { CrudComponent } from './components/views/crud/crud.component';
import { FooterComponent } from './components/views/footer/footer.component';
import { HeaderComponent } from './components/views/header/header.component';
import { NavComponent } from './components/views/nav/nav.component';
import { ExpenseCreateComponent } from './components/views/expense/expense-create/expense-create.component';
import { ExpenseDeleteComponent } from './components/views/expense/expense-delete/expense-delete.component';
import { ExpenseReadComponent } from './components/views/expense/expense-read/expense-read.component';
import { ExpenseUpdateComponent } from './components/views/expense/expense-update/expense-update.component';

registerLocaleData(localePt);

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    CrudComponent,
    FooterComponent,
    HeaderComponent,
    NavComponent,
    ExpenseCreateComponent,
    ExpenseDeleteComponent,
    ExpenseReadComponent,
    ExpenseUpdateComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    MatToolbarModule,
    MatSidenavModule,
    MatListModule,
    MatCardModule,
    MatButtonModule,
    MatSnackBarModule,
    HttpClientModule,
    FormsModule,
    MatFormFieldModule,
    MatInputModule,
    MatTableModule
  ],
  providers: [{
    provide: LOCALE_ID,
    useValue: "pt-BR"
  }],
  bootstrap: [AppComponent]
})
export class AppModule { }
