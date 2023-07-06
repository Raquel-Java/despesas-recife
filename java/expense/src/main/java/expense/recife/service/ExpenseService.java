package expense.recife.service;

import java.util.List;

import org.springframework.stereotype.Service;

import expense.recife.entity.Expense;

@Service
public interface ExpenseService {

	List<Expense> getExpense();

//	void changeForExpense(Expense expense,String id);
	
	void removeExpense(String id);

	Expense createExpense(Expense expense);
	

}
