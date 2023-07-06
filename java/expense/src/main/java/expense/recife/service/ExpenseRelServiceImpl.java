package expense.recife.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import expense.recife.dto.ExpenseMensal;
import expense.recife.repository.ExpenseRelDto;
import expense.recife.repository.ExpenseRepository;

@Service
public class ExpenseRelServiceImpl implements ExpenseRelService{
	
	@Autowired private ExpenseRepository repository;

	@Override
	public List<ExpenseMensal> getExpenseMensal() {
		List<ExpenseMensal> list = new ArrayList<>();
		
		List<ExpenseRelDto> edto = repository.relMensal();
		
		for (ExpenseRelDto expenseRelDto : edto) {
			
			ExpenseMensal e = new ExpenseMensal();
			
			e.setMes(expenseRelDto.getmes());
			e.setLiquido(expenseRelDto.getliquido());
			e.setPago(expenseRelDto.getpago());
			e.setEmpenhado(expenseRelDto.getempenhado());
			
			list.add(e);
		}
		
		
		return list;
	}

}
