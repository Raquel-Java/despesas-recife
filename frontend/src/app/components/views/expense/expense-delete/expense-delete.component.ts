import { Component, OnInit } from '@angular/core';
import { Router, ActivatedRoute } from '@angular/router';
import { Expense } from '../expense.model';
import { ExpenseService } from '../expense.service';

@Component({
  selector: 'app-expense-delete',
  templateUrl: './expense-delete.component.html',
  styleUrls: ['./expense-delete.component.css']
})
export class ExpenseDeleteComponent implements OnInit {

  expense: Expense = {
    ano: '',
    mes: '',
    codOrgao: '',
    nomeOrgao: '',
    subElemento: '',
    valorEmpenhado: 0,
    valorLiquido: 0,
    valorPago: 0
  }

  constructor(private expenseService: ExpenseService, 
    private router: Router,
    private route: ActivatedRoute
    ) { }

  ngOnInit(): void {
    const id= this.route.snapshot.paramMap.get('id')
    this.expenseService.readById(id).subscribe(expense=>{
      this.expense = expense
    });

  }

  deleteExpense(): void {
    this.expenseService.delete(this.expense.id).subscribe(() => {
      this.expenseService.showMessege('Despesa deletada com sucesso!');
      this.router.navigate(['/expense']);
    })
  }

  cancel(): void {
    this.router.navigate(['/expense']);

  }

}
