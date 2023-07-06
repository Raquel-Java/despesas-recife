import { Component, OnInit } from '@angular/core';
import { Router, ActivatedRoute } from '@angular/router';
import { Expense } from '../expense.model';
import { ExpenseService } from '../expense.service';

@Component({
  selector: 'app-expense-create',
  templateUrl: './expense-create.component.html',
  styleUrls: ['./expense-create.component.css']
})
export class ExpenseCreateComponent implements OnInit {

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

  createExpense(): void {
    this.expenseService.create(this.expense).subscribe(() => {
      this.expenseService.showMessege('Despesa criada com sucesso!');
      this.router.navigate(['/expense']);
    })
  }

  cancel(): void {
    this.router.navigate(['/expense']);

  }

}
