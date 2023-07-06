package expense.recife.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import expense.recife.dto.ExpenseDto;
import expense.recife.entity.Expense;

@Service
public interface ExpenseService {

	List<Expense> getExpense();
	
	Optional<Expense> getExpenseForById(String id);
	
	void crudExpense();

	Expense changeForExpense(ExpenseDto expense);
	
	void removeExpense(String id);

	Expense createExpense(ExpenseDto expense);
	

}
