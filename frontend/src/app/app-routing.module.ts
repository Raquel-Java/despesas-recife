import { ExpenseDeleteComponent } from './components/views/expense/expense-delete/expense-delete.component';
import { ExpenseUpdateComponent } from './components/views/expense/expense-update/expense-update.component';
import { ExpenseReadComponent } from './components/views/expense/expense-read/expense-read.component';
import { ExpenseCreateComponent } from './components/views/expense/expense-create/expense-create.component';

import { HomeComponent } from './components/views/home/home.component';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

const routes: Routes = [
  {
    path: "",
    component: HomeComponent
  },
  {
    path: "expense",
    component: ExpenseReadComponent
  },
  {
    path: "expense/create",
    component: ExpenseCreateComponent
  },
  {
    path: "expense/update/:id",
    component: ExpenseUpdateComponent
  },
  {
    path: "expense/delete/:id",
    component: ExpenseDeleteComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
