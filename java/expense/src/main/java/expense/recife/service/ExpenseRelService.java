package expense.recife.service;

import java.util.List;

import org.springframework.stereotype.Service;

import expense.recife.dto.ExpenseCategoria;
import expense.recife.dto.ExpenseFont;
import expense.recife.dto.ExpenseMensal;

@Service
public interface ExpenseRelService {
	
	List<ExpenseMensal> getExpenseMensal();
	List<ExpenseCategoria> getExpenseCategoria();
	List<ExpenseFont> getExpenseFont();
	
	

}
