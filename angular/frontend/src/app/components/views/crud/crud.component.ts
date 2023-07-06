import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { HeaderService } from '../header/header.service';

@Component({
  selector: 'app-crud',
  templateUrl: './crud.component.html',
  styleUrls: ['./crud.component.css']
})
export class CrudComponent implements OnInit {

  constructor(private router:Router,private headerService: HeaderService) { 
    headerService.headerData={
      title: 'Despesas',
      icon: 'storefront',
      routeUrl: '/expenses'
    }
  }

  ngOnInit(): void {
  }

  navigateToExpenseCreate():void{
    this.router.navigate(['/expense/create'])
  }

}
