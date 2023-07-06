package expense.recife.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import expense.recife.client.ExpenseClient;
import expense.recife.entity.Expense;
import expense.recife.repository.ExpenseRepository;

@Service
public class ExpenseServiceImpl implements ExpenseService{
	
	@Autowired
	private ExpenseClient clientExpense;
	
	@Autowired private ExpenseRepository repository;

	@Override
	public List<Expense> getExpense() {
		return clientExpense.expenseForClient();
	}

	@Override
	public void changeForExpense(Expense expense, String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeExpense(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Expense createExpense(Expense expense) {
		// TODO Auto-generated method stub
		return null;
	}

}
