import { Component, OnInit } from '@angular/core';
import { Router, ActivatedRoute } from '@angular/router';
import { Expense } from '../expense.model';
import { ExpenseService } from '../expense.service';

@Component({
  selector: 'app-expense-update',
  templateUrl: './expense-update.component.html',
  styleUrls: ['./expense-update.component.css']
})
export class ExpenseUpdateComponent implements OnInit {

  expense: Expense = {
    ano: '',
    mes: '',
    codOrgao: '',
    nomeOrgao: '',
    subElemento: '',
    valorEmpenhado: '',
    valorLiquido: '',
    valorPago: ''
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

  updateExpense(): void {
    this.expenseService.update(this.expense).subscribe(() => {
      this.expenseService.showMessege('Despesa atualizada com sucesso!');
      this.router.navigate(['/expense']);
    })
  }

  cancel(): void {
    this.router.navigate(['/expense']);

  }

}
