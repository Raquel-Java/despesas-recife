package expense.recife.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import expense.recife.entity.Expense;
import expense.recife.service.ExpenseServiceImpl;

@RestController
@RequestMapping("/expense/v1")
public class ExpenseControl {
	
	@Autowired private ExpenseServiceImpl service;
	
	 @CrossOrigin(origins = "*")
	 @GetMapping(value = "/all")
	 public List<Expense> buscar(){
	      return service.getExpense();
	 }
	
	

}
