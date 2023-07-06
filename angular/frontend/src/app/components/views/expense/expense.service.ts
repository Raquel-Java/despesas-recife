import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import {MatSnackBar} from '@angular/material/snack-bar';
import { Expense } from './expense.model';
import { EMPTY, Observable, catchError, map } from 'rxjs';
import { Router } from '@angular/router';

@Injectable({
  providedIn: 'root'
})
export class ExpenseService {

  //baseUrl = "http://localhost:3001/expense"

  baseUrl = "http://localhost:8080/expense/v1"
  baseUrlBy = "http://localhost:8080/expense/v1/by"

  constructor(private snackBar: MatSnackBar, private http:HttpClient ,private router:Router) { }

  showMessege(msg:string, isError: boolean = false):void{
    this.snackBar.open(msg,'',{
      duration:3000,
      horizontalPosition:"right",
      verticalPosition:"top",
      panelClass:  isError ? ['msg-error'] : ['msg-success'] ,
    })
  }

  errorHandler(e:any):Observable<any>{
    this.showMessege('Ocorreu um erro do lado do servidor! ',true);
    return EMPTY
  }

  read():Observable<Expense[]>{
    return this.http.get<Expense[]>(this.baseUrl).pipe(
      map((obj: any)=>obj),
      catchError((e: any)=> this.errorHandler(e))
    );
  }

  create(expense:Expense):Observable<Expense>{
    return this.http.post<Expense>(this.baseUrl,expense).pipe(
      map((obj: any)=>obj),
      catchError((e: any)=> this.errorHandler(e))
    );
  }

  readById(id: any): Observable<Expense>{
    const url = `${this.baseUrlBy}/${id}`
    return this.http.get<Expense>(url).pipe(
      map((obj: any)=>obj),
      catchError((e: any)=> this.errorHandler(e))
    );
  }

  update(expense: Expense): Observable<Expense>{
    const url = `${this.baseUrl}/${expense.id}`
    return this.http.put<Expense>(url,expense).pipe(
      map((obj: any)=>obj),
      catchError((e: any)=> this.errorHandler(e))
    );
  }

  delete(id: any): Observable<Expense>{
    const url = `${this.baseUrl}/${id}`
    return this.http.delete<Expense>(url).pipe(
      map((obj: any)=>obj),
      catchError((e: any)=> this.errorHandler(e))
    );
  }

}
