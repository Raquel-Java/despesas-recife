package expense.recife.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import expense.recife.dto.ExpenseMensal;
import expense.recife.service.ExpenseRelServiceImpl;

@RestController
@RequestMapping("/expense/v1/rel")
public class ExpenseRelControl {
	
	@Autowired private ExpenseRelServiceImpl service;
	
	@CrossOrigin(origins = "*")
	 @GetMapping
	 public List<ExpenseMensal> buscar(){
	      return service.getExpenseMensal();
	 }

}
