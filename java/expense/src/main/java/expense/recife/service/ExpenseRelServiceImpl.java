package expense.recife.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import expense.recife.dto.ExpenseCategoria;
import expense.recife.dto.ExpenseFont;
import expense.recife.dto.ExpenseMensal;
import expense.recife.repository.ExpenseRelCategoriaDto;
import expense.recife.repository.ExpenseRelFonteDto;
import expense.recife.repository.ExpenseRelMesDto;
import expense.recife.repository.ExpenseRepository;

@Service
public class ExpenseRelServiceImpl implements ExpenseRelService{
	
	@Autowired private ExpenseRepository repository;

	@Override
	public List<ExpenseMensal> getExpenseMensal() {
		List<ExpenseMensal> list = new ArrayList<>();
		List<ExpenseRelMesDto> obj = repository.relMensal();
		
		for (ExpenseRelMesDto expenseRelDto : obj) {
			
			ExpenseMensal e = new ExpenseMensal();
			e.setMes(expenseRelDto.getmes());
			e.setLiquido(expenseRelDto.getliquido());
			e.setPago(expenseRelDto.getpago());
			e.setEmpenhado(expenseRelDto.getempenhado());
			
			list.add(e);
		}
		
		
		return list;
	}

	@Override
	public List<ExpenseCategoria> getExpenseCategoria() {

		List<ExpenseRelCategoriaDto> obj = repository.relCategoria();
		List<ExpenseCategoria> list = new ArrayList<>();
		
		for (ExpenseRelCategoriaDto expenseRelDto : obj) {
			ExpenseCategoria e = new ExpenseCategoria();
			e.setCategoriaEconomica(expenseRelDto.getcategoriaEconomica());
			e.setLiquido(expenseRelDto.getliquido());
			e.setPago(expenseRelDto.getpago());
			e.setEmpenhado(expenseRelDto.getempenhado());
			list.add(e);
		}
		return list;
	}
	

	@Override
	public List<ExpenseFont> getExpenseFont() {
		List<ExpenseRelFonteDto> obj = repository.relFont();
		List<ExpenseFont> list = new ArrayList<>();
		
		for (ExpenseRelFonteDto expenseRelDto : obj) {
			
			ExpenseFont e = new ExpenseFont();
			e.setFonteRecurso(expenseRelDto.getfonteRecurso());
			e.setLiquido(expenseRelDto.getliquido());
			e.setPago(expenseRelDto.getpago());
			e.setEmpenhado(expenseRelDto.getempenhado());

			list.add(e);
		}
		return list;
	}

}
