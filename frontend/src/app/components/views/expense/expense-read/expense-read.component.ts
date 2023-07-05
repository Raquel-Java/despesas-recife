import { Component, OnInit } from '@angular/core';
import { Expense } from '../expense.model';
import { ExpenseService } from '../expense.service';

@Component({
  selector: 'app-expense-read',
  templateUrl: './expense-read.component.html',
  styleUrls: ['./expense-read.component.css']
})
export class ExpenseReadComponent implements OnInit {

  expenses: Expense[] = [];
  displayedColumns = ['id','ano','mes'
  ,'codOrgao','nomeOrgao','subElemento'
  ,'valorEmpenhado','valorLiquido','valorPago']

  constructor(private expenseService: ExpenseService) { }

  ngOnInit(): void {
    this.expenseService.read().subscribe(expenses=>{
      this.expenses = expenses
    })
  }

}
